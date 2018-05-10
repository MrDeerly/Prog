package vorlesung13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleHBoxLayout extends Application
{
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Button b1 = new Button("Open");
    Button b2 = new Button("Save");
    Button b3 = new Button("Exit");
    b1.setTextFill(Color.BLUE);
    b2.setStyle("-fx-text-fill: yellow;");
    // Abstand zwischen den Elementen 10 Pixel
    HBox box = new HBox(10);
    // Paddings: top, right, bottom, left
    box.setPadding(new Insets(15, 12, 15, 12));
    // Mit add wird nur ein Widget hinzugefügt
    box.getChildren().add(b1);
    // mit addAll kann man mehrere Widgets hinzufügen
    box.getChildren().addAll(b2, b3);
    Scene scene = new Scene(box);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }

}
