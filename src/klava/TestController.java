package klava;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import setting.Dec;
import setting.TextGenerator;

/**
 * FXML Controller class
 *
 * @author kam123ua
 */
public class TestController implements Initializable {

    @FXML
    private TextArea textTest;
    @FXML
    private TextField textYou;
    
    public static Dec symbols;
    @FXML
    private Button btnStop;
    
    public static boolean status = true;

    /**
     * Initializes the controller class.
     */
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        if(Klava.language == "Ukrainian") {
            textTest.setText("Привіт. Почнемо тестування!!!");
            symbols = new Dec("Привіт. Почнемо тестування!!!.");
        } else if(Klava.language == "Russian") {
            textTest.setText("Привет. Начнем тестирование!!!");
            symbols = new Dec("Привет. Начнем тестирование!!!");
        } else {
            textTest.setText("Hello. Start testing!!!");
            symbols = new Dec("Hello. Start testing!!!.......");
        }
    }    

    @FXML
    private void stop(ActionEvent event) {
        Metod.showWindows("Message.fxml");
        Stage stage = (Stage) btnStop.getScene().getWindow();
        Metod.closeWindows(stage);
    }

    @FXML
    private void key(KeyEvent event) {
        if(!status) {
            Metod.showWindows("Message.fxml");
            Stage stage = (Stage) btnStop.getScene().getWindow();
            Metod.closeWindows(stage);
        }
        String you = textYou.getText();
        char c = symbols.getValue();
        char[] buf = you.toCharArray();
        
        if(buf[0] == c) {
            textTest.setStyle("-fx-background: #98FB98;");
            symbols.deleteValue();
            symbols.addValue(TextGenerator.generate(Klava.language));
            String resStr = symbols.string();
            Klava.nTrue++;
            textTest.setText(resStr);
        } else {
            Klava.nErrors++;
            textTest.setStyle("-fx-background: #FF0000;");
        }
        textYou.setText("");
    }
    
}
