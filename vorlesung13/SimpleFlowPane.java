package vorlesung13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class SimpleFlowPane extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // Vertikaler FlowPane
    FlowPane flow = new FlowPane(20, 20);
    flow.setPadding(new Insets(5, 0, 5, 0));
    // flow.setVgap(20);
    // flow.setHgap(20);
    flow.setPrefWrapLength(300); // bevorzugte Länge zum Umbruch
    flow.setStyle("-fx-background-color: #DAE6F3;");
    for (int i = 0; i < 8; i++)
    {
      Button b = new Button("Nr " + i);
      flow.getChildren().add(b);
    }
    primaryStage.setScene(new Scene(flow));
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }

}
