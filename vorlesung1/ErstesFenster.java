package vorlesung1;

import javafx.application.Application;
import javafx.stage.Stage;

public class ErstesFenster extends Application
{

   public static void main(String[] args)
   {
      Application.launch(args);
   }

   @Override
   public void start(Stage primaryStage) {
      primaryStage.setTitle("Erstes Fenster");
      primaryStage.show();
   }

}
