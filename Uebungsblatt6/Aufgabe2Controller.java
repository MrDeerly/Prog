package Uebungsblatt6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Aufgabe2Controller {

    @FXML
    private BorderPane borderPane;

    @FXML
    private ToolBar toolbar;

    @FXML
    private Button buttonOpen;

    @FXML
    private Button buttonSave;

    @FXML
    private HBox hbox;

    @FXML
    private Button buttonPrev;

    @FXML
    private Button buttonNext;

    @FXML
    private ImageView ImageView;

    @FXML
    private Button buttonSaveAs;

    @FXML
    private TextArea textArea;

    @FXML
    void buttonClick(ActionEvent event) {
        if (event.getTarget().toString().equals(buttonOpen.toString())) {
            textArea.setText(buttonOpen.getText());
        } else if (event.getTarget().toString().equals(buttonSave.toString())) {
            textArea.setText(buttonSave.getText());
        } else if (event.getTarget().toString().equals(buttonSaveAs.toString())) {
            textArea.setText(buttonSaveAs.getText());
        } else if (event.getTarget().toString().equals(buttonPrev.toString())) {
            textArea.setText(buttonPrev.getText());
        } else if (event.getTarget().toString().equals(buttonNext.toString())) {
            textArea.setText(buttonNext.getText());
        }


    }

}






