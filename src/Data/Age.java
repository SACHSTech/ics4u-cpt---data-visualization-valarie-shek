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

    public double getAge(){
        return ages;
    }

    public double getAverage(){
        average = ((ages/104)*100.00)/100.00;
        return average;
    }
    
}
