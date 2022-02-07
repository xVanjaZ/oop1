package hotel.userinterface;

import hotel.model.Boeking;
import hotel.model.Hotel;
import hotel.model.Kamer;
import hotel.model.KamerType;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
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
        LocalDate now = LocalDate.now();

        if (this.nameInput.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Naam mag niet leeg zijn");
            alert.show();
            return;
        }

        if (this.adresInput.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Adres mag niet leeg zijn");
            alert.show();
            return;
        }

        if (this.arrivedateInput.getValue().isBefore(now)) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Aankomstdatum mag niet eerder zijn dan vandaag");
            alert.show();
            return;
        }

        if (this.leavedateInput.getValue().isBefore(now)) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Vertrekdatum mag niet eerder zijn dan vandaag");
            alert.show();
            return;
        }

        if (this.leavedateInput.getValue().isBefore(this.arrivedateInput.getValue())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Vertrekdatum mag niet eerder zijn dan vandaag");
            alert.show();
            return;
        }

        if (this.roomtypeInput.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Kamertype mag niet leeg zijn");
            alert.show();
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