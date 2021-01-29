package Data;

public class GamesPlayed extends MainMenu{
    private double gamesPlayed;
    private int TotalNum;
    private double average;


    public GamesPlayed(String name, double gamesPlayed)
    {
        super(name);
        this.gamesPlayed= gamesPlayed;
    }

    public GamesPlayed(double gamesPlayed)
    {
        this("Games Played", gamesPlayed);
    }

    public int TotalNum(){
        return TotalNum++;
    }

    public void setGP(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public double getGP(){
        return gamesPlayed;
    }
    
    public double getAverage(){
        average = gamesPlayed/104;
        return average;
    }

}
