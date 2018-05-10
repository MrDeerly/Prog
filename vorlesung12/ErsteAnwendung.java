package vorlesung12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ErsteAnwendung extends Application
{
   @Override
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("Erste Fensteranwendung");
      Label label = new Label("Hello World!");
      System.out.println(label.getHeight() + " " + label.getWidth());
      Scene s = new Scene(label, 300, 400);
      primaryStage.setScene(s);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
