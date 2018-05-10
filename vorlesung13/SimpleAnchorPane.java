package vorlesung13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SimpleAnchorPane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      AnchorPane p = new AnchorPane();
      Button b1 = new Button("OK");
      // Setzen die Ankerpunkte (bzgl. Kanten des Containers)
      AnchorPane.setTopAnchor(b1, 10.0);
      AnchorPane.setLeftAnchor(b1, 30.0);
      
      Button b2 = new Button("Einverstanden");
      // Bottom - Right - Ankerpunkt
      AnchorPane.setBottomAnchor(b2, 10.0);
      AnchorPane.setRightAnchor(b2, 30.0);
      p.setPrefSize(200, 200);
      p.getChildren().addAll(b1, b2);
      primaryStage.setScene(new Scene(p));
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
