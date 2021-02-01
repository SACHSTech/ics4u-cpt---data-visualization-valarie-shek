package Data;

public class ThreePointAttemptRate extends MainMenu{
    private double tpar;
    private int TotalNum;
    private double average;    
    public ThreePointAttemptRate(String name, double tpar) {
        super(name);
        this.tpar= tpar;
    }
    public ThreePointAttemptRate(double tpar)
    {
        this("Three Point Attemp Rate", tpar);
    }

    public int TotalNum(){
        return TotalNum++;
    }

    public void setTPAR(int tpar) {
        this.tpar = tpar;
    }

    public double getTPAR(){
        return tpar;
    }
    
    public double getAverage(){
        average = tpar/104;
        return average;
    }
}
