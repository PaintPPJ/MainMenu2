/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FXMLMainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    double x =0;
    double y = 0;
    void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(event.getXOnScreen()-x);
        stage.setX(event.getYOnScreen()-y);
    }

    void presses(MouseEvent event) {
        x = event.getXOnScreen();
        y = event.getYOnScreen();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void Play(javafx.scene.input.MouseEvent event) 
    {
        
    }

    @FXML
    private void Tutorial(javafx.scene.input.MouseEvent event) 
    {
        
    }

    @FXML
    private void dragged(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void presses(javafx.scene.input.MouseEvent event) {
    }
    
}
