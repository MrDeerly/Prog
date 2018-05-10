package vorlesung15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Bsp1 extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Pane p = (Pane) FXMLLoader.load(getClass().getResource("Bsp1.fxml"));
      primaryStage.setScene(new Scene(p));
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
