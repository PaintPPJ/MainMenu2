
package mainmenu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import static javafx.scene.paint.Color.color;
import javafx.stage.StageStyle;
/**
 *
 * @author DELL
 */
public class MainMenu extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    @Override 
 public void start(Stage stage) throws Exception { 
 Parent root = FXMLLoader.load(getClass().getResource("FXMLMainMenu.fxml")); 
 
 Scene scene = new Scene(root); 
 scene.setFill(Color.TRANSPARENT);
 stage.setScene(scene); 
stage.initStyle(StageStyle.TRANSPARENT); 
 stage.show(); 
 } 
  


}
