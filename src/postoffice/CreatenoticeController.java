
package postoffice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CreatenoticeController implements Initializable {

    @FXML
    private TextArea noticeSend;
    @FXML
    private Button send;
    private Stage stage;
    private Scene scene;
    private Parent root;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendnoticeOnClick(ActionEvent event)throws IOException {
     String Notice =noticeSend.getText();
     FXMLLoader loader = new FXMLLoader(getClass().getResource("createnotice.fxml"));
     root=loader.load();
     ChecknoticeController checknoticeController=loader.getController();
     checknoticeController.displayNotice(Notice);
     stage =(Stage)((Node)event.getSource()).getScene().getWindow();
     scene= new Scene(root);
     stage.setScene(scene);
     stage.show();
     
     
     
    }

    @FXML
    private void goback(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("admiin.fxml");
    }

    @FXML
    private void seeNotice(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("checknotice.fxml");
    }
    
}
