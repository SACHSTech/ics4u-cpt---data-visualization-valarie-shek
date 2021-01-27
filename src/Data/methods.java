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


public class methods {
    public static void main (String[] args) throws IOException{
        String fileName = "C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv";
        File file = new File(fileName);

        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner (file);

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values = line.split(",");
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
                System.out.println(value);
                //System.out.println("Line"+lineNo+"Column"+columnNo+":"+value);
                columnNo++;
            }
            lineNo++;
        }
        //System.out.println("{0:12}{1:>10}{2:>15}{3:>25}{4:>30}{5:>35}{6:>40}{7:>45}{8:>50}{9:>55}{10:>60}{11:>65}{12:>70}{13:>75}{14:>80}{15:>85}{16:>90}{17:>95}{18:>100}{19:>105}{20:>110}{21:>115}{22:>120}{23:>125}{24:>130}{25:>135}".format("Player","Pos","Age","Tm","G","MP","PER","TS%","3PAr","FTr","ORB%","DRB%","TRB%","AST%","STL%","BLK%","TOV%","USG%","OWS","DWS","WS","WS/48","OBPM","DBPM","BPM","VORP"));
        //System.out.prinltn("{0:12}{1:>10}{2:>15}{3:>25}{4:>30}{5:>35}{6:>40}{7:>45}{8:>50}{9:>55}{10:>60}{11:>65}{12:>70}{13:>75}{14:>80}{15:>85}{16:>90}{17:>95}{18:>100}{19:>105}{20:>110}{21:>115}{22:>120}{23:>125}{24:>130}{25:>135}".format()
}
}
