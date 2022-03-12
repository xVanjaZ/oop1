package hotel.userinterface;

import hotel.model.Boeking;
import hotel.model.Hotel;
import hotel.model.Kamer;
import hotel.model.KamerType;
import hotel.utils.Validator;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BoekingAanmakenOverzichtController {
    @FXML private TextField nameInput;
    @FXML private TextField adresInput;
    @FXML private DatePicker arrivedateInput;
    @FXML private DatePicker leavedateInput;
    @FXML private ComboBox<KamerType> roomtypeInput;

    public void initialize() {
        this.getKamerTypen();
        this.resetForm();
    }

    public void getKamerTypen() {
        Hotel hotel = Hotel.getHotel();
        List<KamerType> kamerTypen = hotel.getKamerTypen();
        this.roomtypeInput.getItems().addAll(kamerTypen);
    }

    public void createBooking() {
        // error handling op een betere plek (domein)
        Validator validator = new Validator();

        validator.textFieldNotEmpty(this.nameInput);
        validator.textFieldNotEmpty(this.adresInput);

        validator.datePickerIsBefore(this.arrivedateInput, LocalDate.now());
        validator.datePickerIsBefore(this.leavedateInput, LocalDate.now());
        validator.datePickerIsBefore(this.leavedateInput, this.arrivedateInput.getValue());

        validator.comboBoxIsNotNull(this.roomtypeInput);

        if (validator.hasErrors()) {
            validator.showErrors();
            return;
        }

        Hotel hotel = Hotel.getHotel();

        try {
            hotel.voegBoekingToe(this.arrivedateInput.getValue(), this.leavedateInput.getValue(), this.nameInput.getText(), this.adresInput.getText(), this.roomtypeInput.getValue());

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Boeking succesvol aangemaakt!");
            alert.show();

            this.resetForm();
        } catch (Exception err) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Boeking niet aangemaakt: " + err.getMessage());
            alert.show();
        }
    }

    public void resetForm() {
        this.nameInput.setText("");
        this.adresInput.setText("");
        this.arrivedateInput.setValue(LocalDate.now());
        this.leavedateInput.setValue(LocalDate.now().plusDays(1));
        this.roomtypeInput.setValue(null);
    }
}