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

            System.out.println("Player       Pos     Age    Tm    G    MP    PER    TS%    3PAr    FTr    ORB%    DRB%     TRB%    AST%    STL%    BLK%    TOV%    USG%    OWS    DWS    WS    WS/48    OBPM    DBPM    BPM    VORP");
            //String[][] testing1 = new String[652][26];
            

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
                
            }
//age column 2

            String b = "TOR";
            for(int i = 1; i<653; i++){
                if(lines.get(i).get(0).equalsIgnoreCase("IvicaZubac")){
                    System.out.println(lines.get(i));
                }
            }

            int value = Integer.parseInt(lines.get(2).get(2));
            String a = "Adams";
            if(lines.get(2).get(0).equalsIgnoreCase(a)){
                System.out.println("yes");
            }

            System.out.println(lines.get(2).get(0));
           // System.out.println(lines.get(2));
            System.out.println(lines.get(3));

            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    
}

    public static void PlayerSearch(){

    }

    /*
    public static void AgeSearch(){
        int age;
        int token = 0;

        if(age<19 || age>43){
            System.out.println("Error in search, please enter an age that is between 19-43.");
        }else if(age == 19){
            Pattern p = Pattern.compile("a*b");
            Matcher m = p.matcher("aaaaab");
            boolean b = m.matches();
        }else if(age == 40 || age == 41 || age == 42){

        }

    }
*/

    public static void MakeList(){
        String fileName = "C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv";
        File file = new File(fileName);

        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner (file);

            System.out.println("Player       Pos     Age    Tm    G    MP    PER    TS%    3PAr    FTr    ORB%    DRB%     TRB%    AST%    STL%    BLK%    TOV%    USG%    OWS    DWS    WS    WS/48    OBPM    DBPM    BPM    VORP");
            //String[][] testing1 = new String[652][26];
            

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
                
            }

            System.out.println(lines);

            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
        

}
