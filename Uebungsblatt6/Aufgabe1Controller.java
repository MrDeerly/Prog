package Uebungsblatt6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Aufgabe1Controller {

    @FXML
    private Separator sep2;

    @FXML
    private VBox vbox;

    @FXML
    private Separator sep1;

    @FXML
    private HBox hbox2;

    @FXML
    private HBox hbox1;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private HBox hbox50;

    @FXML
    private TextField text50;

    @FXML
    private Button okbutton;

    @FXML
    private Label label50;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private Pane pane;

    @FXML
    private Label labelerg;

    @FXML
    void handleAdd(ActionEvent event) {
        int a = Integer.parseInt(text50.getText());
        int b = Integer.parseInt(text2.getText());
        int c = Integer.parseInt(text1.getText());

        labelerg.setText("Gesamt: " + ((a * 50) + (b * 2) + c));
    }


}
