
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


public class AttendancereportController implements Initializable {

    @FXML
    private BarChart barchart;
    @FXML
    private NumberAxis yaxis;
    @FXML
    private CategoryAxis xaxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
XYChart.Series dataSeries1 = new XYChart.Series();
XYChart.Series dataSeries2 = new XYChart.Series();
dataSeries1.setName("2020");

dataSeries1.getData().add(new XYChart.Data("Worker1", 100));
dataSeries1.getData().add(new XYChart.Data("Worker2"  , 90));
dataSeries1.getData().add(new XYChart.Data("Worker3"  , 110));
dataSeries1.getData().add(new XYChart.Data("Worker4"  , 120));
dataSeries1.getData().add(new XYChart.Data("Worker5"  , 80));

dataSeries2.setName("2021");

dataSeries2.getData().add(new XYChart.Data("Worker1", 110));
dataSeries2.getData().add(new XYChart.Data("Worker2"  , 120));
dataSeries2.getData().add(new XYChart.Data("Worker3"  , 110));
dataSeries2.getData().add(new XYChart.Data("Worker4"  , 100));
dataSeries2.getData().add(new XYChart.Data("Worker5"  , 120));


barchart.getData().add(dataSeries1);
barchart.getData().add(dataSeries2);
    }    

    @FXML
    private void goback(ActionEvent event) throws IOException {
                                        PostOffice m;
        m = new PostOffice();
        m.changeScene("postmaster.fxml");
    }
    

    
}
