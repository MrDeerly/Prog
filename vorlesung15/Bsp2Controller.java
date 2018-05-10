package vorlesung15;

import java.math.BigInteger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Bsp2Controller
{
   @FXML
   TextField mTextField1;
   @FXML
   TextField mTextField2;
   @FXML
   Label mErgebnis;

   @FXML
   void doAdd()
   {
      BigInteger a = new BigInteger(mTextField1.getText());
      BigInteger b = new BigInteger(mTextField2.getText());
      a = a.add(b);
      mErgebnis.setText(a.toString());
   }

   @FXML
   void doMinus()
   {
      BigInteger a = new BigInteger(mTextField1.getText());
      BigInteger b = new BigInteger(mTextField2.getText());
      a = a.subtract(b);
      mErgebnis.setText(a.toString());
   }

}
