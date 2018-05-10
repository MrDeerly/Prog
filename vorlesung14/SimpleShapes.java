package vorlesung14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class SimpleShapes extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {

    TilePane tileContainer = new TilePane(10, 10);
    tileContainer.setPadding(new Insets(10, 10, 10, 10));
    // Bevozugte Anzahl von Spalten
    tileContainer.setPrefColumns(4);
    // Arc
    Arc arc = new Arc();
    arc.setCenterX(50.0f);
    arc.setCenterY(50.0f);
    arc.setRadiusX(25.0f);
    arc.setRadiusY(25.0f);
    arc.setStartAngle(45.0f);
    arc.setLength(270.0f);
    arc.setType(ArcType.ROUND);
    arc.setFill(null);
    arc.setStroke(Color.BLACK);
    tileContainer.getChildren().add(arc);

    Circle circle = new Circle();
    circle.setCenterX(50.0f);
    circle.setCenterY(50.0f);
    circle.setRadius(50.0f);
    tileContainer.getChildren().add(circle);

    Ellipse ellipse = new Ellipse();
    ellipse.setCenterX(50.0f);
    ellipse.setCenterY(50.0f);
    ellipse.setRadiusX(50.0f);
    ellipse.setRadiusY(25.0f);
    tileContainer.getChildren().add(ellipse);

    Line line = new Line();
    line.setStartX(0.0f);
    line.setStartY(0.0f);
    line.setEndX(100.0f);
    line.setEndY(100.0f);
    tileContainer.getChildren().add(line);

    Path path = new Path();

    MoveTo moveTo = new MoveTo();
    moveTo.setX(0.0f);
    moveTo.setY(0.0f);

    HLineTo hLineTo = new HLineTo();
    hLineTo.setX(30.0f);

    QuadCurveTo quadCurveTo = new QuadCurveTo();
    quadCurveTo.setX(80.0f);
    quadCurveTo.setY(80.0f);
    quadCurveTo.setControlX(30.0f);
    quadCurveTo.setControlY(70.0f);

    LineTo lineTo = new LineTo();
    lineTo.setX(100.0f);
    lineTo.setY(55.0f);

    ArcTo arcTo = new ArcTo();
    arcTo.setX(50.0f);
    arcTo.setY(0.0f);
    arcTo.setRadiusX(50.0f);
    arcTo.setRadiusY(50.0f);

    path.getElements().add(moveTo);
    path.getElements().add(hLineTo);
    path.getElements().add(quadCurveTo);
    path.getElements().add(lineTo);
    path.getElements().add(arcTo);
    tileContainer.getChildren().add(path);

    Polygon polygon = new Polygon();
    polygon.setFill(Color.BLUE);
    polygon.getPoints().addAll(new Double[]
    { 0.0, 0.0, 50.0, 10.0, 10.0, 20.0 });
    tileContainer.getChildren().add(polygon);

    Polyline polyline = new Polyline();
    polyline.getPoints().addAll(new Double[]
    { 0.0, 0.0, 50.0, 50.0, 10.0, 20.0, 100.0, 100.0 });
    tileContainer.getChildren().add(polyline);

    Rectangle r = new Rectangle();
    r.setX(0);
    r.setY(0);
    r.setWidth(100);
    r.setHeight(80);
    r.setArcWidth(20);
    r.setArcHeight(20);
    r.setFill(Color.BEIGE);
    tileContainer.getChildren().add(r);

    Text text = new Text();
    text.setFont(new Font(10));
    text.setWrappingWidth(100);
    text.setTextAlignment(TextAlignment.JUSTIFY);
    text.setText("Das ist ein sehr langer Text");
    tileContainer.getChildren().add(text);

    primaryStage.setScene(new Scene(tileContainer));
    primaryStage.show();

  }

  public static void main(String[] args)
  {
    launch(args);
  }

}
