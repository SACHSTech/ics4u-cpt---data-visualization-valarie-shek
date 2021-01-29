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



public class Test1 extends Application{
    public static void main (String[] args) throws IOException{
        launch(args);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter age");
        String Age = keyboard.readLine();
        System.out.println(methods.AgeMethod(Age));
    }

        @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("NBA Stats 2020");
        Button age = new Button();
        age.setText("Age");
        age.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Age testing");
            }
        });
        age.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("testing age");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(age);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    
    }

    

}

