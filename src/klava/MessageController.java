package klava;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kam123ua
 */
public class MessageController implements Initializable {

    @FXML
    private Label labelResult;
    @FXML
    private Label labelTime;
    @FXML
    private PieChart diagram;
    @FXML
    private Button btnRes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showDiagram(Klava.nTrue, Klava.nErrors);
        String time = Metod.timeInfo();
        labelResult.setText(labelResult.getText() + ("" + Klava.nTrue));
        labelTime.setText(labelTime.getText() + ("" + time));
    }    
    
    void showDiagram(int t, int f) {
        ObservableList<PieChart.Data> pieChartData =
            FXCollections.observableArrayList(
            new PieChart.Data("True", t),
            new PieChart.Data("False", f));
        diagram.setData(pieChartData);
    }

    @FXML
    private void restart(ActionEvent event) {
        Metod.showWindows("Start.fxml");
        Klava.language = "";
        Klava.nErrors = 0;
        Klava.nTrue = 0;
        TestController.status = true;
        TestController.symbols = null;
        Stage stage = (Stage) btnRes.getScene().getWindow();
        Metod.closeWindows(stage);
    }
        
}
