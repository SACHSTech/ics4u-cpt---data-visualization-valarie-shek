package Data;

public class MinutesPlayed extends MainMenu{

    private int mp;
    private int TotalNum;
    private double average;
    
    
    public MinutesPlayed(String name, int mp) {
        super(name);
        this.mp= mp;
    }
        

    public MinutesPlayed(int mp)
    {
        this("Minutes Played", mp);
    }

    public int TotalNum(){
        return TotalNum++;
    }

    public void setMP(int mp) {
        this.mp = mp;
    }

    public int getMP(){
        return mp;
    }
    
    public double getAverage(){
        return average;
    }

    public void setAverage(int mp){
        double holder = 0;

        average = holder + mp;
        holder = average;

        this.average = mp;
    }
}
