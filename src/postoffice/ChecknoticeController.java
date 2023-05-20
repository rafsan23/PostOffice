
package postoffice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ChecknoticeController implements Initializable {

    @FXML
    private Label notice;
    @FXML
    private Button back;
    
    public void displayNotice(String Notice){
    
    notice.setText("Notice"+ Notice);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void goBack(ActionEvent event) {
        
    }
    
}
