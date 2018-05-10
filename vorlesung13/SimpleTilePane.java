package vorlesung13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

// TilePane ist ein Container für Kacheln gleicher Größe
public class SimpleTilePane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // TilePane mit HGap = VGap = 4
      TilePane tileContainer = new TilePane(4, 4);
      tileContainer.setPadding(new Insets(5, 0, 5, 0));
      // Bevozugte Anzahl von Spalten
      tileContainer.setPrefColumns(3);
      for (int i = 0; i < 8; i++)
      {
         Button b = new Button("" + i);
         b.setAlignment(Pos.CENTER);
         tileContainer.getChildren().add(b);
      }
      // Hintergrund
      tileContainer.setStyle("-fx-background-color: #DAE6F3;");
      primaryStage.setScene(new Scene(tileContainer));
      // Größe der Anwendung kann nicht geändert werden
      primaryStage.setResizable(false);
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
