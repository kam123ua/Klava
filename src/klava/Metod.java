package klava;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author kam123ua
 */
public class Metod {
    
    public static void showWindows(String str){	
	Stage primaryStage = new Stage();
    	Pane mainPane;
	try {
            mainPane = (Pane)FXMLLoader.load(Klava.class.getResource(str));
            primaryStage.setScene(new Scene(mainPane));
            primaryStage.setResizable(false);
            primaryStage.setTitle(Const.nameApplication);
            primaryStage.getIcons().add(new Image(Const.iconApplication));
            primaryStage.show();
	} catch (IOException e) {
		e.printStackTrace();
	}	
    }
    
    public static void closeWindows(Stage stage) {
        stage.close();
    }
    
    public static void errorMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Write a correct text");
        alert.showAndWait();
    }
    
    public static double time() {
        return (System.currentTimeMillis() - StartController.timestart) / 1000;
    }
    
    public static String timeInfo() {
        String res = "";
        double t = time();
        int h = 0, m = 0, s = 0;
        h = (int) (t / 3600);
        t -= h * 3600;
        m = (int) (t / 60);
        t -= m * 60;
        s = (int) t;
        if(h > 0) {
            res += h + " h ";
        }
        if(m > 0) {
            res += m + " m ";
        }
        if(s > 0) {
            res += s + " s.";
        }
        return res;
    }

}