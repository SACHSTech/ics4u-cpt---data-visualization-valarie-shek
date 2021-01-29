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
        Button GPaverage = new Button();
        Button MPaverage = new Button();
        Button TPARaverage = new Button();

        GPaverage.setText("Game Played Average");
        MPaverage.setText("Minutes Played Average");
        TPARaverage.setText("Three Points Attempt Rate Average");
        Aaverage.setText("Average Age");
        mp.setText("Minutes Played");
        position.setText("Filter:\nPosition");
        team.setText("Filter:\nTeam");
        name.setText("Filter:\nName");
        age.setText("Filter:\nAge");

        TPARaverage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            double tpar = methods.TPAR();
            MainMenu ThreePAR = new ThreePointAttemptRate(tpar);
            System.out.println(ThreePAR.getAverage());
            }
        });

        MPaverage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            double mp = methods.MinutesPlayed();
            MainMenu MP = new MinutesPlayed(mp);
            System.out.println(MP.getAverage());
            }
        });

        GPaverage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            double gp = methods.GamesPlayed();
            MainMenu GP = new GamesPlayed(gp);
            System.out.println(GP.getAverage());
            }
        });

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
        
        age.setMaxSize(120, 100);
        name.setMaxSize(120, 100);
        team.setMaxSize(120, 100);
        position.setMaxSize(120, 100);
        mp.setMaxSize(120, 100);
        Aaverage.setMaxSize(120,100);
        TPARaverage.setMaxSize(220,100);
        MPaverage.setMaxSize(150,100);
        GPaverage.setMaxSize(150,100);
        HBox hbox = new HBox(age, Aaverage, name, team, position, mp, MPaverage, TPARaverage, GPaverage);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        primaryStage.setScene(new Scene(hbox, 900, 600));
        primaryStage.show();
    
    }

    

}

