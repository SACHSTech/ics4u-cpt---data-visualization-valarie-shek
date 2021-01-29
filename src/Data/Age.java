package Data;

public class Age extends MainMenu{
    
    private int Age;
    private int TotalNum;

    public int TotalNum(){
        return TotalNum++;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge(){
        return Age;
    }
    
    public double getAverage(){
        for(int i = 1; i<105; i++){
           Age = Age+Age; 
        }
        return Age/TotalNum;
    }
}
