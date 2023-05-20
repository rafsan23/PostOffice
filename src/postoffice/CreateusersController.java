
package postoffice;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CreateusersController implements Initializable {

    @FXML private TableView<user> tableView;
    @FXML private TableColumn<user, String> firstNameColumn;
    @FXML private TableColumn<user, String> lastNameColumn;
    @FXML private TableColumn<user, LocalDate> birthdayColumn;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private DatePicker birthdayDate;
    @FXML private Button addNewUserButton;
    @FXML private Button deleteUserButton;
    @FXML
    private Button createFile;
    @FXML
    private CheckBox TextFile;
    @FXML
    private CheckBox BinFile;
       private ArrayList<user> userArr = new ArrayList<user>();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
                firstNameColumn.setCellValueFactory(new PropertyValueFactory<user,String>("firstName"));
                lastNameColumn.setCellValueFactory(new PropertyValueFactory<user,String>("lastName"));
                birthdayColumn.setCellValueFactory(new PropertyValueFactory<user,LocalDate>("birthday"));
                tableView.setItems(getPeople()); 
                tableView.setEditable(true);
                firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
                lastNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
                tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void goBack(ActionEvent event) throws IOException {
           PostOffice m;
        m = new PostOffice();
        m.changeScene("admin.fxml");
    }

    @FXML
    private void viewusersonclick(ActionEvent event) throws IOException {
       PostOffice m;
        m = new PostOffice();
        m.changeScene("viewusers.fxml");
    }

    @FXML
   public void changeLasttNameCellEvent(TableColumn.CellEditEvent edittedCell){
        user personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setLastName(edittedCell.getNewValue().toString());
    }
    

    @FXML
    public void changeFirstNameCellEvent(TableColumn.CellEditEvent edittedCell){
        user personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setFirstName(edittedCell.getNewValue().toString());
    }
    @FXML
       public void addNewUserButtonOnClick(){   
        user newUser = new user(firstNameTextField.getText(),
                                       lastNameTextField.getText(),
                                       birthdayDate.getValue()
                                    );
        tableView.getItems().add(newUser);
        
    }

    @FXML
      private void deleteUserButtonOnClick(ActionEvent event) {
        ObservableList<user> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        
        for(user p: selectedRows){
            allPeople.remove(p);
        }
    }
 

       public ObservableList<user> getPeople(){
        ObservableList<user> people = FXCollections.observableArrayList();
        people.add(new user("Tanisha", "Lamiya", LocalDate.of(1998, Month.AUGUST, 12)));
        people.add(new user("Rafsan", "Raiyan", LocalDate.of(2000, Month.JUNE, 30)));
        people.add(new user("akib", "Ahmed", LocalDate.of(2001, Month.APRIL, 17)));
        return people;
    }
    

    @FXML
    private void createFileonClick(ActionEvent event) {
         if(TextFile.isSelected()){
            try {
              
                FileWriter fw = new FileWriter("user.txt");
                String us="";
                for(user u: userArr){
                    us+= u.getFirstName()+","+u.getLastName()+","+u.getAge()+"\n";
                  
                }
                fw.write(us);
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewworkersController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(BinFile.isSelected()){
           
            try{
                FileOutputStream f = new FileOutputStream("user.bin");
                ObjectOutputStream ob = new ObjectOutputStream(f);
                for(user u: userArr)
                    ob.writeObject(u);
                ob.close();
            }
            catch(Exception e){}
        }
    
    }

        
    }
    

