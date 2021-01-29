package Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

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
        ArrayList<ArrayList<String>> testing = new ArrayList<ArrayList<String>>();
        Scanner inputStream;

        try{
            inputStream = new Scanner (file);

            System.out.println("Player       Pos     Age    Tm    G    MP    PER    TS%    3PAr    FTr    ORB%    DRB%     TRB%    AST%    STL%    BLK%    TOV%    USG%    OWS    DWS    WS    WS/48    OBPM    DBPM    BPM    VORP");
            

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
                
            }

            int token = 1;
            int iAge;
            while(token ==1){
                int a;
            for(int i = 1; i<105; i++){
                a = Integer.parseInt(lines.get(i).get(2));
                int b = Integer.parseInt(lines.get(i+1).get(2));
                int[] arr = {a,b};
                selectionSort(arr);
                //System.out.println(Arrays.toString(arr));
                if(a>b){
                    swap2(lines.get(i), lines.get(i+1));
                    System.out.println(lines.get(i));
                }else if(b>a){
                    swap2(lines.get(i+1), lines.get(i));
                    System.out.println(lines.get(i));
                }
                
            }
        }

            // choose team
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter team");
            String tm = keyboard.readLine();
            for (int i = 1; i < 652; i++) {
                if (lines.get(i).get(3).equalsIgnoreCase(tm)) {
                    System.out.println(lines.get(i));
                }
            }

            // choose age
            System.out.println("enter age");
            String age = keyboard.readLine();
            for (int i = 1; i < 652; i++) {
                if (lines.get(i).get(2).equalsIgnoreCase(age)) {
                    System.out.println(lines.get(i));
                }
            }

            // choose name
            System.out.println("enter name (firstname_lastname)");
            String nm = keyboard.readLine();
            for (int i = 1; i < 652; i++) {
                if (lines.get(i).get(0).equalsIgnoreCase(nm)) {
                    System.out.println(lines.get(i));
                }
            }

            // choose position
            System.out.println("enter position (short form)");
            String p = keyboard.readLine();
            for (int i = 1; i < 652; i++) {
                if (lines.get(i).get(1).equalsIgnoreCase(p)) {
                    System.out.println(lines.get(i));
                }
            }

            // int value = Integer.parseInt(lines.get(2).get(2));
            // String a = "Adams";
            // if(lines.get(2).get(0).equalsIgnoreCase(a)){
            // System.out.println("yes");
            // }

            // System.out.println(lines.get(2).get(0));
            // System.out.println(lines.get(2));
            // System.out.println(lines.get(3));

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void PlayerSearch() {

    }

    /*
     * public static void AgeSearch(){ int age; int token = 0;
     * 
     * if(age<19 || age>43){ System.out.
     * println("Error in search, please enter an age that is between 19-43."); }else
     * if(age == 19){ Pattern p = Pattern.compile("a*b"); Matcher m =
     * p.matcher("aaaaab"); boolean b = m.matches(); }else if(age == 40 || age == 41
     * || age == 42){
     * 
     * }
     * 
     * }
     */

    public static void selectionSort(int[] arr) {
        for (int curIndex = 0; curIndex < arr.length - 1; curIndex++) {
            System.out.println(Arrays.toString(arr));
            int minIndex = findMin(arr, curIndex);
            swap(arr, curIndex, minIndex);
        }
    }

    public static int findMin(int[] arr, int startingIndex) {
        int minIndex = startingIndex;

        for (int i = minIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap2(List<String> list, List<String> list2) {

        List<String> temp = list;
        list = list2;
        list2 = temp;
    }
    

    public static void MakeList(){
        String fileName = "C:\\ICS4U\\ics4u-cpt---data-visualization-valarie-shek\\src\\Data\\nba_2020_advanced.csv";
        File file = new File(fileName);

        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner (file);

            System.out.println("Player       Pos     Age    Tm    G    MP    PER    TS%    3PAr    FTr    ORB%    DRB%     TRB%    AST%    STL%    BLK%    TOV%    USG%    OWS    DWS    WS    WS/48    OBPM    DBPM    BPM    VORP");
            

            while(inputStream.hasNext()){
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
                
            }

            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
        

}
