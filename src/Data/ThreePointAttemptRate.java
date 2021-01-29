package Data;

public class ThreePointAttemptRate extends MainMenu{
    private int tpar;
    private int TotalNum;
    private double average;

    public int TotalNum(){
        return TotalNum++;
    }

    public void setTPAR(int tpar) {
        this.tpar = tpar;
    }

    public int getTPAR(){
        return tpar;
    }
    
    public double getAverage(){
        return average;
    }

    public void setAverage(int tpar){
        double holder = 0;

        average = holder + tpar;
        holder = average;
        this.average = tpar;
    }
}
