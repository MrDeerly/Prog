package vorlesung13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorld extends Application {
   @Override
   public void start(Stage primaryStage) {
      // Objekt erzeugen und konfigurieren
      Label label = new Label("Hello World");
      // Eine Scene erzeugen
      Scene scene = new Scene(label, 200, 200);     
      // und einbauen
      primaryStage.setScene(scene);
      // Titel der ,,Bühne''
      primaryStage.setTitle("Eine Anwendung");
      // Sichbar machen
      primaryStage.show();      
   }
   public static void main(String[] args) {
      launch(args);
   }
}
