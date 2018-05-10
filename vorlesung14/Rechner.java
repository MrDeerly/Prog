package vorlesung14;

import java.math.BigInteger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rechner extends Application
{

   @Override
   public void start(Stage primaryStage)
   {
      GridPane p = new GridPane();
      p.setHgap(10);
      p.setVgap(10);
      p.setPadding(new Insets(10));
      p.add(new Text("Operand 1"), 0, 0);
      p.add(new Text("Operand 2"), 0, 1);
      TextField tf1 = new TextField();
      TextField tf2 = new TextField();
      p.add(tf1, 1, 0);
      p.add(tf2, 1, 1);
      Button plus = new Button("+");
      Button minus = new Button("-");
      HBox b = new HBox(10);
      b.getChildren().addAll(plus, minus);
      b.setAlignment(Pos.CENTER);
      p.add(b, 0, 2, 2, 1);
      Label ergebnis = new Label();
      p.add(ergebnis, 0, 3, 2, 1);
      // Reaktionen auf Buttons
      plus.setOnAction((e) -> {
         String txt1 = tf1.getText();
         String txt2 = tf2.getText();
         if (txt1 != null && txt2 != null)
         {
            BigInteger b1 = new BigInteger(txt1);
            BigInteger b2 = new BigInteger(txt2);
            b1 = b1.add(b2);
            ergebnis.setText(b1.toString());
         }
      });
      minus.setOnAction((e) -> {
         String txt1 = tf1.getText();
         String txt2 = tf2.getText();
         if (txt1 != null && txt2 != null)
         {
            BigInteger b1 = new BigInteger(txt1);
            BigInteger b2 = new BigInteger(txt2);
            b1 = b1.subtract(b2);
            ergebnis.setText(b1.toString());
         }
      });
      primaryStage.setScene(new Scene(p));
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
