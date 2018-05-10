package Uebungsblatt5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Aufgabe1 extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox box = new HBox(10);

        javafx.scene.control.Button b1 = new Button("Open");
        javafx.scene.control.Button b2 = new Button("Save");
        Pane spacer = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        spacer.setMinSize(10, 1);
        javafx.scene.control.Button b3 = new Button("Help");
        box.setPrefWidth(400);
        box.setPadding(new Insets(10, 10, 10, 10));
        // mit addAll kann man mehrere Widgets hinzufügen
        box.getChildren().addAll(b1, b2, spacer, b3);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
