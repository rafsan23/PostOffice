
package postoffice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class CheckordersController {

    @FXML
    private PieChart piechart;


    @FXML
    private void loadchartOnClick(ActionEvent event) {
        ObservableList<Data> list=FXCollections.observableArrayList(
        new PieChart.Data("postage stamps",40),
        new PieChart.Data("Package",20),
        new PieChart.Data("Stationery",10),
        new PieChart.Data("Money Orders",30)     
        );
        piechart.setData(list);
    }
    
}
