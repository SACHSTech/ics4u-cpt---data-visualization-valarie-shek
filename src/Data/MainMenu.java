package Data;

import java.io.*;
import java.nio.file.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainMenu extends Application{
    public static void main (String[] args) throws IOException{
        BufferedReader thefile = new BufferedReader(new FileReader("C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv"));
        ////var fileName = "C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\test.txt";
        ////var filePath = Paths.get(fileName);
        //// BufferedReader thefile = new BufferedReader(new FileReader(filePath));
        String example = "";
        example = thefile.readLine();
        System.out.println(example);
        thefile.close();
        launch(args);
    }

        @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                System.out.println("test Trial");
                System.out.println("Test2");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    
    }
/*
    public MainMenu(){

    }
*/
   // public abstract double getAverage();

}

