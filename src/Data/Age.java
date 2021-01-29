package Data;

public class Age extends MainMenu{
    
    private double ages;
    private int TotalNum;
    private double average;

    public Age(String name, double ages)
    {
        super(name);
        this.ages = ages;
    }
    
    public Age(double ages)
    {
        this("Ages", ages);
    }

    public int TotalNum() {
        return TotalNum++;
    }


    public double getAge(){
        return ages;
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
