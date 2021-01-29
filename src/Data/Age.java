package Data;

public class Age extends MainMenu{
    
    private int Age;
    private int TotalNum;
    private double average;

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
        return average;
    }

    public void setAverage(int Age){
        double holder = 0;

        average = holder + Age;
        holder = average;

        this.average = Age;
    }
}
