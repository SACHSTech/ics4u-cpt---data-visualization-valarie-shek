package Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class MainMenu extends Application{
    public static void main (String[] args) throws IOException{
        /*
        BufferedReader thefile = new BufferedReader(new FileReader("C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = thefile.readLine();
        while(line != null){
            line = thefile.readLine();
            thefile.add(line);
        }
        thefile.close();
        System.out.println(thefile);
        */

        String fileName = "C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv";
        File file = new File(fileName);

        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner (file);

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values  =line.split(",");
                lines.add(Arrays.asList(values));
            }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        int lineNo = 1;
        for(List<String> line: lines){
            int columnNo = 1;
            for(String value: line){
                System.out.println("Line"+lineNo+"Column"+columnNo+":"+value);
                columnNo++;
            }
            lineNo++;
        }

        
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

