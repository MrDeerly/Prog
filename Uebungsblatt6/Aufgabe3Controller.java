package Uebungsblatt6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Aufgabe3Controller {

    @FXML
    private RadioButton buttonArtist;

    @FXML
    private RadioButton buttonDatum;

    @FXML
    private Button buttonSearch;

    @FXML
    private RadioButton buttonStadt;

    @FXML
    private TextField textField;

    String searchtype;

    @FXML
    void isActive(ActionEvent event) {


        if (event.getTarget().toString().equals(buttonStadt.toString())) {
            searchtype = buttonStadt.getText();
        } else if (event.getTarget().toString().equals(buttonArtist.toString())) {
            searchtype = buttonArtist.getText();
        } else if (event.getTarget().toString().equals(buttonDatum.toString())) {
            searchtype = buttonDatum.getText();
        }
    }

    @FXML
    void buttonPress(ActionEvent event) {
        if (event.getTarget().toString().equals(buttonSearch.toString())) {
            System.out.println(textField.getText() + " " + searchtype);
        }
    }
}


