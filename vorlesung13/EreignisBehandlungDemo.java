package vorlesung13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EreignisBehandlungDemo extends Application
{
   private TextField name = new TextField();
   private TextField vorname = new TextField();
   private Button ok = new Button("OK");
   private Button cancel = new Button("Cancel");

   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      GridPane p = createGridPane();
      ok.setOnAction(e -> {
         String n = name.getText();
         String v = vorname.getText();
         System.out.println("Sie haben eingegeben " + n + " " + v);
      });
      primaryStage.setScene(new Scene(p));
      primaryStage.show();
   }

   private GridPane createGridPane()
   {
      GridPane p = new GridPane();
      p.setHgap(10);
      p.setVgap(10);
      p.setPadding(new Insets(10));
      p.add(new Text("Name"), 0, 0);
      p.add(new Text("Vorname"), 0, 1);
      p.add(name, 1, 0);
      name.setTooltip(new Tooltip("Geben Sie Ihren Namen hier ein"));
      p.add(vorname, 1, 1);
      HBox b = new HBox(10);
      b.setAlignment(Pos.BASELINE_RIGHT);
      b.getChildren().addAll(cancel, ok);
      p.add(b, 0, 2, 2, 1);
      return p;
   }

}
