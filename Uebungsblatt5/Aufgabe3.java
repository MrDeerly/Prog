package Uebungsblatt5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Aufgabe3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField op1 = new TextField();
        TextField op2 = new TextField();
        TextField ergebnis = new TextField();
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        Button mal = new Button("*");
        Button geteilt = new Button("/");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button modulo = new Button("%");

        HBox box = new HBox();
        box.getChildren().addAll(plus, minus, mal
                , geteilt, modulo);

        GridPane p = new GridPane();
        p.setHgap(10);
        p.setVgap(10);
        p.setPadding(new Insets(10));
        p.add(new Text("Operand 1"), 0, 0);
        p.add(new Text("Operand 2"), 0, 1);
        p.add(new Text("Ergebnis"), 0, 3);
        p.add(op1, 1, 0);
        p.add(op2, 1, 1);
        p.add(box, 1, 2);
        p.add(ergebnis, 1, 3);
        primaryStage.setScene(new Scene(p));
        primaryStage.show();

    }
}
