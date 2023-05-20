
package postoffice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class accountant {

    @FXML
    private Button logout;
    
     public void userLogOut(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("FXMLDocument.fxml");

    }

}
