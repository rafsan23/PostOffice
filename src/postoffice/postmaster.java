
package postoffice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class postmaster {

    @FXML
    private Button logout;
    
    @FXML
     public void userLogOut(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("FXMLDocument.fxml");

    }

    @FXML
    private void viewworkersOnClick(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("viewworkers.fxml");
        
    }

    @FXML
    private void vieworders(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("checkorders.fxml");
        
    }

    @FXML
    private void attendancereport(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("attendancereport.fxml");
    }

    @FXML
    private void moneytransictions(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("moneytransiction.fxml");
    }
    

}
