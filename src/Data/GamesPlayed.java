package Data;

public class GamesPlayed extends MainMenu{
    private int gamesPlayed;
    private int TotalNum;
    private double average;

    public int TotalNum(){
        return TotalNum++;
    }

    public void setGP(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGP(){
        return gamesPlayed;
    }
    
    public double getAverage(){
        return average;
    }

    public void setAverage(int gamesPlayed){
        double holder = 0;

        average = holder + gamesPlayed;
        holder = average;

        this.average = gamesPlayed;
    }
}
