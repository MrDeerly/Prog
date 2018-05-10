package vorlesung13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleVBoxLayout extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Button b1 = new Button("Open");
      Button b2 = new Button("Save");
      Button b3 = new Button("Exit");

      // Vergrößern Sie das Fenster, um die Wirkung der
      // beiden folgenden Anweisungen zu verstehen
      b2.setMaxWidth(Double.MAX_VALUE);
      b3.setMaxWidth(Double.MAX_VALUE);
      VBox.setVgrow(b1, Priority.ALWAYS);
      b1.setMaxHeight(Double.MAX_VALUE);

      VBox box = new VBox(20);
      // Buttons in den Container aufnehmen
      box.getChildren().addAll(b1, b2, b3);
      // box als Wurzel für die Scene
      Scene scene = new Scene(box);
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
