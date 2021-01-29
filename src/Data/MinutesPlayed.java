package Data;

public class MinutesPlayed extends MainMenu{

    private double mp;
    private int TotalNum;
    private double average;
    
    
    public MinutesPlayed(String name, double mp) {
        super(name);
        this.mp= mp;
    }
        

    public MinutesPlayed(double mp)
    {
        this("Minutes Played", mp);
    }

    public int TotalNum(){
        return TotalNum++;
    }

    public void setMP(double mp) {
        this.mp = mp;
    }

    public double getMP(){
        return mp;
    }
    
    public double getAverage(){
        average = mp/104;
        return average;
    }
}
