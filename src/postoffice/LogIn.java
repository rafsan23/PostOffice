
package postoffice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class LogIn {

   
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    private Label wronglogin;
    
    
    @FXML
     public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        PostOffice m;
        m = new PostOffice();
        if(username.getText().equals("rafsan") && password.getText().equals("123")) {
            wronglogin.setText("Success!");

            m.changeScene("admin.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
           wronglogin.setText("Please Enter ur data");

       }
       else {
           wronglogin.setText("login unsuccessful");
       }
       if(username.getText().equals("tanisha") && password.getText().equals("345")){
           wronglogin.setText("Success");
           m.changeScene("postmaster.fxml");

       }
       else if(username.getText().isEmpty() && password.getText().isEmpty()){
           wronglogin.setText("Please Enter ur data");

       }
       else {
           wronglogin.setText("login unsuccessful");
       }
       if(username.getText().equals("ratul") && password.getText().equals("567")){
           wronglogin.setText("Success");
           m.changeScene("assistantPostmaster.fxml");

       }
       else if(username.getText().isEmpty() && password.getText().isEmpty()){
           wronglogin.setText("Please Enter ur data");

       }
       else {
           wronglogin.setText("login unsuccessful");
       }
       if(username.getText().equals("akib") && password.getText().equals("789")){
           wronglogin.setText("Success");
           m.changeScene("accountant.fxml");

       }
       else if(username.getText().isEmpty() && password.getText().isEmpty()){
           wronglogin.setText("Please Enter ur data");

       }
       else {
           wronglogin.setText("login unsuccessful");
       }
       if(username.getText().equals("nahid") && password.getText().equals("910")){
           wronglogin.setText("Success");
           m.changeScene("workers.fxml");

       }
       else if(username.getText().isEmpty() && password.getText().isEmpty()){
           wronglogin.setText("Please Enter ur data");

       }
       else {
           wronglogin.setText("login unsuccessful");
       }

   }
}


