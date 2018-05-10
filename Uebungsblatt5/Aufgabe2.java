package Uebungsblatt5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Aufgabe2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        javafx.scene.control.Label label = new javafx.scene.control.Label("Essenmarkenautomat");
        Button b1 = new Button("Essen1");
        Button b2 = new Button("Essen2");
        Button b3 = new Button("10 Cent");
        Button b4 = new Button("50 Cent");
        Separator separator = new Separator();
        Separator separator2 = new Separator();


        VBox rahmen = new VBox(10);
        HBox box1 = new HBox(10);
        HBox box2 = new HBox(10);

        box1.getChildren().addAll(b1, b2);
        box2.getChildren().addAll(b3, b4);
        rahmen.setPadding(new Insets(10, 10, 10, 10));
        rahmen.getChildren().addAll(label, separator, box1, separator2, box2);
        Scene scene = new Scene(rahmen);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
