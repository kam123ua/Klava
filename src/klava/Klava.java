package klava;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author kam123ua
 */
public class Klava extends Application {
    
    public static String language = "";
    public static int nTrue = 0, nErrors = 0;
    @Override
    public void start(Stage stage) throws Exception {
        Metod.showWindows("Start.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}