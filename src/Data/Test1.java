package Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.ArrayList;
import Data.methods;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test1 extends Application {
    public static void main(String[] args) throws IOException {
        System.out.println("testing");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("NBA Stats 2020");
        Button age = new Button();
        Button name = new Button();
        Button team = new Button();
        Button position = new Button();
        Button mp = new Button();
        Button Aaverage = new Button();
        Aaverage.setText("Average Age");
        mp.setText("Minutes Played");
        position.setText("Position");
        team.setText("Team");
        name.setText("Name");
        age.setText("Age");

        Aaverage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            double ages = methods.Ages();
            MainMenu test = new Age(ages);
            System.out.println(test.getAverage());
            }
        });

        age.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter age");
                String Age;
                try {
                    Age = keyboard.readLine();
                    System.out.println(methods.AgeMethod(Age));
                } catch (IOException e) {
                    e.printStackTrace();
                }
               
            }


        });
        mp.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter minutes played");
                int mp;
                try {
                    mp = Integer.parseInt(keyboard.readLine());
                    System.out.println(methods.MP(mp));
                } catch (IOException e) {
                    e.printStackTrace();
                }
               
            }
        });
        name.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter name");
                try {
                    String Name = keyboard.readLine();
                    System.out.println(methods.NameMethod(Name));
                } catch (IOException e) {
                    e.printStackTrace();
                }
               
            }
        });
        team.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter team");
                try {
                    String Team = keyboard.readLine();
                    System.out.println(methods.TeamMethod(Team));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
            }
        });
    position.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter position");
            try {
                String Position = keyboard.readLine();
                System.out.println(methods.PositionMethod(Position));
            } catch (IOException e) {
                e.printStackTrace();
            }
           
        }
    });
        
        age.setMaxSize(150, 75);
        name.setMaxSize(150, 75);
        team.setMaxSize(150, 75);
        position.setMaxSize(150, 75);
        mp.setMaxSize(150, 75);
        Aaverage.setMaxSize(150,75);
        HBox hbox = new HBox(age, Aaverage, name, team, position, mp);
        hbox.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(hbox, 600, 600));
        primaryStage.show();
    
    }

    

}

