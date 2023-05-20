
package postoffice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class assistantPostmaster {

    @FXML
    private Button logout;

    @FXML
    private void sellstampsOnClick(ActionEvent event) throws IOException {
                PostOffice m;
        m = new PostOffice();
        m.changeScene("sellstamps.fxml");
    }

    @FXML
    private void userLogOutOnClick(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("FXMLDocument.fxml");

    }

    @FXML
    private void meetingOnClick(ActionEvent event) {
        
    }

    @FXML
    private void ordersOnClick(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("allorders.fxml");

    }
}