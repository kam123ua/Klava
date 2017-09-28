package klava;

import setting.Time;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static klava.StartController.timestart;

/**
 * FXML Controller class
 *
 * @author kam123ua
 */
public class SettingController implements Initializable {

    @FXML
    private Button btnOK;
    @FXML
    private Label labelText;
    @FXML
    private CheckBox checkTime;
    @FXML
    private TextField textTime;
    @FXML
    private CheckBox checkMultilingual;
    @FXML
    private ComboBox<String> chooseLanguage;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chooseLanguage.getItems().addAll(Const.chooseLanguages);
        chooseLanguage.getSelectionModel().selectFirst();
    }    

    @FXML
    private void set(ActionEvent event) {
        timestart = System.currentTimeMillis();
        if(checkTime.isSelected()) {
            time();
        }
        if(checkMultilingual.isSelected()) {
            Klava.language = "multilingual";
        } else {
            Klava.language = chooseLanguage.getValue();
        }
   
        Metod.showWindows("Test.fxml");
        Stage stage = (Stage) btnOK.getScene().getWindow();
        Metod.closeWindows(stage);
        
    }
    
    void time() {
        double time = Double.parseDouble(textTime.getText());
        Thread timeControll = new Thread(new Time(time));
        timeControll.start();
    }

    @FXML
    private void editTime(ActionEvent event) {
        if(checkTime.isSelected()) textTime.setDisable(false);
        else textTime.setDisable(true);
    }

    @FXML
    private void editMultilingual(ActionEvent event) {
        if(checkMultilingual.isSelected()) chooseLanguage.setDisable(true);
        else chooseLanguage.setDisable(false);
    }
    
}
