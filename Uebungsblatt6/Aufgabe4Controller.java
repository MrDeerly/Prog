package Uebungsblatt6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Aufgabe4Controller {

    @FXML
    private VBox vBox;

    @FXML
    private HBox hBoxTel;

    @FXML
    private Button buttonSend;

    @FXML
    private TextField textfieldtel;

    @FXML
    private HBox hBoxButton;

    @FXML
    private Separator seperator1;

    @FXML
    private TextField textFieldSend;

    @FXML
    private TextArea textArea;

    @FXML
    private Separator Seperator;

    @FXML
    void buttonPressed(ActionEvent event) {
        textArea.appendText("->" + textfieldtel.getText() + ": " + textFieldSend.getText() + "\n");
    }

}
