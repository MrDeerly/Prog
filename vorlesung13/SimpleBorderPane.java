package vorlesung13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SimpleBorderPane extends Application
{

  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    BorderPane borderPane = new BorderPane();
    Label topLabel = new Label("Titel im Norden");
    BorderPane.setAlignment(topLabel, Pos.CENTER);
    BorderPane.setMargin(topLabel, new Insets(4, 4, 4, 4));
    borderPane.setTop(topLabel);
    borderPane.setLeft(new Button("Links"));
    borderPane.setRight(new Button("Rechts"));
    TextArea centerText = new TextArea("Hier ist ein Textbereich");
    borderPane.setCenter(centerText);
    borderPane.setBottom(new Label("Statusleiste im Süden"));
    primaryStage.setScene(new Scene(borderPane, 200, 150));
    primaryStage.show();
  }

}
