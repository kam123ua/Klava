package klava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author kam123ua
 */
public class StartController {
    
    @FXML
    private Button btnOK;
    public static long timestart = 0;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void startTest(ActionEvent event) {
        Stage stage = (Stage) btnOK.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("Setting.fxml");
    }   
    
}
