package Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.ArrayList;
import Data.methods;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        position.setText("Position");
        team.setText("Team");
        name.setText("Name");
        age.setText("Age");
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
        
        StackPane root = new StackPane();
        root.getChildren().add(age);
        root.getChildren().add(name);
        root.getChildren().add(team);
        root.getChildren().add(position);
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();
    
    }

    

}

