package Data;

 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 
public class Barchart extends Application {
 
    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    
 
    public Parent createContent() {
        String[] YearsOld = {"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(YearsOld));
        yAxis = new NumberAxis("Number of Players", 0.0d, 14.0d, 7.0d);
        ObservableList<BarChart.Series> barChartData = FXCollections.observableArrayList(
              new BarChart.Series("Years Old", FXCollections.observableArrayList(
                new BarChart.Data(YearsOld[0], 2),
                new BarChart.Data(YearsOld[1], 6),
                new BarChart.Data(YearsOld[2], 9),
                new BarChart.Data(YearsOld[3], 11),
                new BarChart.Data(YearsOld[4], 8),
                new BarChart.Data(YearsOld[5], 13),
                new BarChart.Data(YearsOld[6], 5),
                new BarChart.Data(YearsOld[7], 5),
                new BarChart.Data(YearsOld[8], 4),
                new BarChart.Data(YearsOld[9], 4),
                new BarChart.Data(YearsOld[10], 7),
                new BarChart.Data(YearsOld[11], 8),
                new BarChart.Data(YearsOld[12], 2),
                new BarChart.Data(YearsOld[13], 5),
                new BarChart.Data(YearsOld[14], 8),
                new BarChart.Data(YearsOld[15], 6),
                new BarChart.Data(YearsOld[16], 1)))
            );
        chart = new BarChart(xAxis, yAxis, barChartData, 7.0d);
        return chart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}
