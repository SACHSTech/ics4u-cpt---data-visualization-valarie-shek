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



public class MainMenu extends Application{
    public static void main (String[] args) throws IOException{
        
       // System.out.println(methods.MakeList());
        launch(args);
    }

        @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Button age = new Button();
        age.setText("Age");
        age.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Age testing");
            }
        });
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(age);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    
    }
/*
    public MainMenu(){

    }
*/
   // public abstract double getAverage();

}

