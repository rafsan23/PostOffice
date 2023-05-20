
package postoffice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class admin {

    @FXML
    private Button logout;
    @FXML
    private Button createusers;
    
        @FXML
    void createUsers(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("createusers.fxml");

    }

    @FXML
   public void userLogOut(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("FXMLDocument.fxml");

    }

    @FXML
    private void viewsusersOnclick(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("viewusers.fxml");
    }

    @FXML
    private void createreportOnclick(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("createreport.fxml");
    }

    @FXML
    private void createnoticeOnClick(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("createnotice.fxml");
    }

    @FXML
    private void uploaddataOnclick(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("uploaddata.fxml");
    }
}