package hotel.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;


public class Validator {
    List<String> errors;

    public Validator() {
        this.errors = new ArrayList<>();
    }

    public void textFieldNotEmpty(TextField field) {
        if (field.getText().trim().isEmpty()) {
            String error = field.getId() + " mag niet leeg zijn";
            this.errors.add(error);
        }
    }

    public void datePickerIsBefore(DatePicker datePicker, LocalDate before) {
        if (datePicker.getValue().isBefore(before)) {
            String error = datePicker.getId() + " mag niet voor '" + before + "' zijn";
            this.errors.add(error);
        }
    }

    public void comboBoxIsNotNull(ComboBox comboBox) {
        if (comboBox.getValue() == null) {
            String error = comboBox.getId() + " mag niet leeg zijn";
            this.errors.add(error);
        }
    }

    public boolean hasErrors() {
        return this.errors.size() > 0;
    }

    public void showErrors() {
        Alert alert = new Alert(Alert.AlertType.ERROR, String.join("\n", this.errors));
        alert.show();
    }
}
