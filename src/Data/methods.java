package Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class methods {
    private static int[] removeTheElement(int[] sidewaysArray, int index1) {
        if (sidewaysArray == null
            || index1 <0
            || index1 >= sidewaysArray.length) {
            return sidewaysArray;
            }    
        List<Integer> arrayList = IntStream.of(sidewaysArray).boxed().collect(Collectors.toList());
        
        arrayList.remove(index1);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
        
    }

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

    public static int binarySearch(int[] array, int key)
    {
        int low = 0;
        int high = array.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            int cur = array[mid];
            
            if(cur == key)
            {
                return mid;
            }
            else if(cur < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return -1;
    }

    public static String AgeMethod(String Age) {
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
        // choose age
        for (int i = 1; i < 105; i++) {
            if (lines.get(i).get(2).equalsIgnoreCase(Age)) {
                System.out.println(lines.get(i));
            }
        }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return fileName;
    }

    public static int MP(int mp) {
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
            int token = 1;
            if(token ==1){
                int a;
            for(int j = 1; j<104; j++){
                for(int i = 1; i<104; i++){
                a = Integer.parseInt(lines.get(i).get(5));
                int b = Integer.parseInt(lines.get(i+1).get(5));
                List<String> dummy;
                List<String> test1 = lines.get(i);
                List<String> test2 = lines.get(i+1);
                if(a>b){
                   dummy = test1;
                    test1 = test2;
                    test2 = dummy;
                }
                lines.set(i, test1);
                lines.set(i+1, test2);
            }
            }
            int start = 1;
            int end = 104;
            
            int run = 1;
            //making an array
                int[] sidewaysArray = new int[200];
                for(int i = start; i<end; i++){
                    int b = Integer.parseInt(lines.get(i).get(5));
                    sidewaysArray[i-1] = b;
                }
                while(run == 1){
                    int index1 = binarySearch(sidewaysArray, mp);
                    if(index1 <0){
                        run = 0;
                     } else {
                     System.out.println(Arrays.asList(lines.get(index1+1)));
                     sidewaysArray[index1] = 0;
                }    
        }
            }inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        int d = Integer.parseInt(fileName);
        return d;
    }

        
    public static String TeamMethod(String Team) {
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
            int token = 1;
            if(token ==1){
                int a;
            for(int j = 1; j<104; j++){
                for(int i = 1; i<104; i++){
                a = Integer.parseInt(lines.get(i).get(2));
                int b = Integer.parseInt(lines.get(i+1).get(2));
                List<String> dummy;
                List<String> test1 = lines.get(i);
                List<String> test2 = lines.get(i+1);
                if(a>b){
                   dummy = test1;
                    test1 = test2;
                    test2 = dummy;
                }
                lines.set(i, test1);
                lines.set(i+1, test2);
            }
            }
        }
        // choose team
        for (int i = 1; i < 105; i++) {
            if (lines.get(i).get(3).equalsIgnoreCase(Team)) {
                System.out.println(lines.get(i));
            }
        }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return fileName;
    }

    public static String NameMethod(String Name) {
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
            
        // choose name
        for (int i = 1; i < 105; i++) {
            if (lines.get(i).get(0).equalsIgnoreCase(Name)) {
                System.out.println(lines.get(i));
            }
        }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return fileName;
    }

    public static String PositionMethod(String Position) {
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
            int token = 1;
            if(token ==1){
                int a;
            for(int j = 1; j<104; j++){
                for(int i = 1; i<104; i++){
                a = Integer.parseInt(lines.get(i).get(2));
                int b = Integer.parseInt(lines.get(i+1).get(2));
                List<String> dummy;
                List<String> test1 = lines.get(i);
                List<String> test2 = lines.get(i+1);
                if(a>b){
                   dummy = test1;
                    test1 = test2;
                    test2 = dummy;
                }
                lines.set(i, test1);
                lines.set(i+1, test2);
            }
            }
        }
        // choose position
        for (int i = 1; i < 105; i++) {
            if (lines.get(i).get(1).equalsIgnoreCase(Position)) {
                System.out.println(lines.get(i));
            }
        }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return fileName;
    }


}
