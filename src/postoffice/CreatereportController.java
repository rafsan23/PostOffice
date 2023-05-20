
package postoffice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CreatereportController implements Initializable {

    @FXML
    private TextArea report;
    @FXML
    private Button submit;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void gobackOnClick(ActionEvent event) throws IOException {
          PostOffice m;
        m = new PostOffice();
        m.changeScene("admiin.fxml");
    }

    @FXML
    private void submitreportOnClick(ActionEvent event) {
    }
    
}
