
package postoffice;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class AllordersController implements Initializable {

    @FXML private TableView<Order> tableview;
    @FXML private TableColumn<Order, String> serialnumbercolumn;
    @FXML private TableColumn<Order, String> ordernamecolumn;
    @FXML private TableColumn<Order, String> amountcolumn;
    @FXML private TextField serialNumber;
    @FXML private TextField orderName;
    @FXML private TextField amount;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
                serialnumbercolumn.setCellValueFactory(new PropertyValueFactory<Order,String>("serial"));
                ordernamecolumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderName"));
                amountcolumn.setCellValueFactory(new PropertyValueFactory<Order,String>("amount")); 
                tableview.setItems(getUser()); 
           
                
                
    }    

    private ObservableList<Order> getUser() {
    ObservableList<Order> order = FXCollections.observableArrayList();   
           order.add(new Order("1","Stamp1","500"));
           order.add(new Order("2","Stamp2","500"));
           order.add(new Order("3","Stamp3","500"));
           order.add(new Order("4","Stamp4","500"));
           order.add(new Order("5","Stamp5","500"));
           order.add(new Order("6","Stamp6","500"));
           order.add(new Order("7","Stamp7","500"));
        return order;
    }

    @FXML
    private void addOrderOnClick(ActionEvent event) {
        Order newOrder = new Order(serialNumber.getText(),
                                       orderName.getText(),
                                       amount.getText()
                                    );
        tableview.getItems().add(newOrder);
        
    }

    @FXML
    private void goback(ActionEvent event) {
    }
    
}
