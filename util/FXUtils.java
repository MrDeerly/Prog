package util;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Util, um Schreibarbeit mit JavaFX-Anwendung zu reduzieren
 * 
 * @author tientran
 *
 */
public class FXUtils
{
  /**
   * Hilfsmethode, um die FXML-Datei einzulesen und die Bühne aufzubauen
   * Wichtige Voraussetzung: Die FMXL-Datei heißt bis auf die Endung genau so
   * wie die Application-Klasse und sie liegt in dem selben Ordner
   * 
   * @param app
   *          Die JavaFX-Application
   * @param stage
   *          Die Bühne
   * @return Der eingesetzte Inhalt als Parent (Basisklasse von Pane)
   */
  public static Parent start(Application app, Stage stage)
  {
    return start(app, stage,
        app.getClass().getSimpleName() + ".fxml");
  }

  /**
   * Hilfsmethode, um die FXML-Datei einzulesen und die Bühne aufzubauen. Die
   * FXMLDatei muss im selben Ordner liegen wie die Application
   * 
   * @param app
   *          Die JavaFX-Application
   * @param stage
   *          Die Bühne
   * @param fxmlDatei
   *          Name der FXML-Datei
   * @return Der eingesetzte Inhalt als Parent (Basisklasse von Pane)
   */
  public static Parent start(Application app, Stage stage,
      String fxmlDatei)
  {
    try
    {
      Class<?> c = app.getClass();
      Parent p = (Parent) FXMLLoader.load(c.getResource(fxmlDatei));
      Scene s = new Scene(p);
      stage.setScene(s);
      stage.show();
      return p;
    } catch (Exception ex)
    {
      ex.printStackTrace();
      System.exit(1);
    }
    return null; // kann nie passieren!! muss hier stehen, sonst
                 // Kompilierfehler
  }

  /**
   * Hilfsmethode, um die FXML-Datei einzulesen und die Bühne aufzubauen. Die
   * FXMLDatei muss im selben Ordner liegen wie die Application. Der Controller
   * wird in diesem Fall explizit angegeben. WICHTIG: In der FXML-Datei darf
   * kein Kontroller eingetragen werden
   * 
   * @param app
   *          Die JavaFX-Application
   * @param stage
   *          Die Bühne
   * @param fxmlDatei
   *          Name der FXML-Datei
   * @return Der eingesetzte Inhalt als Parent (Basisklasse von Pane)
   * @param controller
   *          Ein expliziter Controller
   * @return Der eingesetzte Inhalt als Parent (Basisklasse von Pane)
   */
  public static Parent start(Application app, Stage stage,
      String fxmlDatei, Object controller)
  {
    try
    {
      Class<?> c = app.getClass();
      FXMLLoader loader = new FXMLLoader(c.getResource(fxmlDatei));
      loader.setController(controller);
      Parent p = (Parent) loader.load();
      Scene s = new Scene(p);
      stage.setScene(s);
      stage.show();
      return p;
    } catch (Exception ex)
    {
      ex.printStackTrace();
      System.exit(1);
    }
    return null; // kann nie passieren!! muss hier stehen, sonst
                 // Kompilierfehler
  }
}
