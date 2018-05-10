package util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MessageBox
{
  /**
   * Hilfsmethode, um einen Messagebox mit der enstprechenden Meldung anzuzeigen
   * 
   * @param message
   *          Nachricht
   * @param title
   *          Titel der Meldung
   */
  public static void show(String message, String title)
  {
    // // Wir bauen eine modale Bühne
    // Stage stage = new Stage();
    // stage.initModality(Modality.APPLICATION_MODAL);
    // // Mit dem entsprecheden Titel und Breite
    // stage.setTitle(title);
    // stage.setMinWidth(250);
    // // Für die Meldung
    // TextArea textBox = new TextArea(message);
    // textBox.setWrapText(true); // Für Zeilenumbruch
    // textBox.setEditable(false); // nicht editierbar
    // Button btnOK = new Button();
    // btnOK.setText("OK");
    // // Wenn OK geklickt wird, wird die Bühne geschlossen
    // btnOK.setOnAction(e -> stage.close());
    // VBox pane = new VBox(20);
    // pane.setPadding(new Insets(20));
    // pane.getChildren().addAll(textBox, btnOK);
    // pane.setAlignment(Pos.CENTER);
    // Scene scene = new Scene(pane);
    // stage.setScene(scene);
    // // zeigt die Meldung und wartet, bis sie geschlossen wird
    // // Solange bleibt die aktuelle Bühne blockiert
    // stage.showAndWait();
    Alert dialog = new Alert(AlertType.INFORMATION);
    dialog.setContentText(message);
    dialog.setHeaderText(null);
    dialog.setTitle(title);
    dialog.showAndWait();
  }
}
