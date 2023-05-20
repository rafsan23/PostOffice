
package postoffice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


public class MoneytransictionController implements Initializable {

    @FXML
    private BarChart barchart;
    @FXML
    private NumberAxis number;
    @FXML
    private CategoryAxis days;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series dataSeries1 = new XYChart.Series();
        XYChart.Series dataSeries2 = new XYChart.Series();
        XYChart.Series dataSeries3 = new XYChart.Series();
        XYChart.Series dataSeries4 = new XYChart.Series();
        XYChart.Series dataSeries5 = new XYChart.Series();
        XYChart.Series dataSeries6 = new XYChart.Series();
        XYChart.Series dataSeries7 = new XYChart.Series();
        
        dataSeries1.setName("week1");

        dataSeries1.getData().add(new XYChart.Data("day1", 100049));
        dataSeries1.getData().add(new XYChart.Data("day2"  , 908740));
        dataSeries1.getData().add(new XYChart.Data("day3"  , 110458));
        dataSeries1.getData().add(new XYChart.Data("day4"  , 120235));
        dataSeries1.getData().add(new XYChart.Data("day5"  , 809086));
        dataSeries1.getData().add(new XYChart.Data("day6"  , 119809));
        dataSeries1.getData().add(new XYChart.Data("day7"  , 804357));
        
        dataSeries2.setName("week2");

        dataSeries2.getData().add(new XYChart.Data("day1", 1000000));
        dataSeries2.getData().add(new XYChart.Data("day2"  , 900000));
        dataSeries2.getData().add(new XYChart.Data("day3"  , 110000));
        dataSeries2.getData().add(new XYChart.Data("day4"  , 120000));
        dataSeries2.getData().add(new XYChart.Data("day5"  , 800000));
        dataSeries2.getData().add(new XYChart.Data("day6"  , 150000));
        dataSeries2.getData().add(new XYChart.Data("day7"  , 800000));

        dataSeries3.setName("week3");

        dataSeries3.getData().add(new XYChart.Data("day1", 110000));
        dataSeries3.getData().add(new XYChart.Data("day2"  , 900000));
        dataSeries3.getData().add(new XYChart.Data("day3"  , 110000));
        dataSeries3.getData().add(new XYChart.Data("day4"  , 120000));
        dataSeries3.getData().add(new XYChart.Data("day5"  , 1500000));
        dataSeries3.getData().add(new XYChart.Data("day6"  , 110000));
        dataSeries3.getData().add(new XYChart.Data("day7"  , 800000));
        
        
        dataSeries4.setName("week4");

        dataSeries4.getData().add(new XYChart.Data("day1", 1000000));
        dataSeries4.getData().add(new XYChart.Data("day2"  , 900000));
        dataSeries4.getData().add(new XYChart.Data("day3"  , 110348));
        dataSeries4.getData().add(new XYChart.Data("day4"  , 120383));
        dataSeries4.getData().add(new XYChart.Data("day5"  , 806356));
        dataSeries4.getData().add(new XYChart.Data("day6"  , 802222));
        dataSeries4.getData().add(new XYChart.Data("day7"  , 100000));
        
        
        dataSeries5.setName("week5");

        dataSeries5.getData().add(new XYChart.Data("day1", 100955));
        dataSeries5.getData().add(new XYChart.Data("day2"  , 901111));
        dataSeries5.getData().add(new XYChart.Data("day3"  , 110555));
        dataSeries5.getData().add(new XYChart.Data("day4"  , 1207872));
        dataSeries5.getData().add(new XYChart.Data("day5"  , 809999));
        dataSeries5.getData().add(new XYChart.Data("day6"  , 700000));
        dataSeries5.getData().add(new XYChart.Data("day7"  , 1500345));
        
        
        dataSeries6.setName("week6");

        dataSeries6.getData().add(new XYChart.Data("day1", 1500000));
        dataSeries6.getData().add(new XYChart.Data("day2"  , 800330));
        dataSeries6.getData().add(new XYChart.Data("day3"  , 112530));
        dataSeries6.getData().add(new XYChart.Data("day4"  , 150920));
        dataSeries6.getData().add(new XYChart.Data("day5"  , 802223));
        dataSeries6.getData().add(new XYChart.Data("day6"  , 890000));
        dataSeries6.getData().add(new XYChart.Data("day7"  , 823230));
        
        
        dataSeries7.setName("week7");

        dataSeries7.getData().add(new XYChart.Data("day1", 100020));
        dataSeries7.getData().add(new XYChart.Data("day2"  , 873590));
        dataSeries7.getData().add(new XYChart.Data("day3"  , 113330));
        dataSeries7.getData().add(new XYChart.Data("day4"  , 123440));
        dataSeries7.getData().add(new XYChart.Data("day5"  , 123480));
        dataSeries7.getData().add(new XYChart.Data("day6"  , 900000));
        dataSeries7.getData().add(new XYChart.Data("day7"  , 236680));
        
        
        barchart.getData().add(dataSeries1);
        barchart.getData().add(dataSeries2);
        barchart.getData().add(dataSeries3);
        barchart.getData().add(dataSeries4);
        barchart.getData().add(dataSeries5);
        barchart.getData().add(dataSeries6);
        barchart.getData().add(dataSeries7); 
    }    

    @FXML
    private void goback(ActionEvent event) throws IOException {
        PostOffice m;
        m = new PostOffice();
        m.changeScene("postmaster.fxml");
    }
    
}
