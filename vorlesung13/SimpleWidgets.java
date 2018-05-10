package vorlesung13;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleWidgets extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    GridPane grid = new GridPane();
    grid.setHgap(4);
    grid.setVgap(4);
    grid.setPadding(new Insets(5, 5, 5, 5));

    grid.add(new Label("Name"), 0, 0);
    TextField name = new TextField();
    name.setTooltip(new Tooltip("Geben Sie Ihren Namen ein"));
    grid.add(name, 1, 0);
    grid.add(new Label("Vorname"), 0, 1);
    TextField vorname;
    grid.add(vorname = new TextField(), 1, 1);

    HBox box = new HBox(4);
    box.setAlignment(Pos.BASELINE_RIGHT);
    Button ok = new Button("OK");
    ok.setTextFill(Color.BLUE);
    ok.setOnAction((e) ->
    {
      String s = vorname.getText() + " " + name.getText();
      System.out.println(s);
    });
    box.getChildren().addAll(new Button("Cancel"), ok);
    grid.add(box, 0, 2, 2, 1);
    primaryStage.setScene(new Scene(grid));

    Button test = new Button("Test",
        new ImageView(new Image(SimpleWidgets.class
            .getResourceAsStream("graphics/piechart.png"))));
    grid.add(test, 0, 3, 2, 1);
    GridPane.setHalignment(test, HPos.CENTER);
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }

}
