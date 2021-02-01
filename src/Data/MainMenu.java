package Data;

public abstract class MainMenu {
    private String name;
    
    public MainMenu(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }

    public abstract double getAverage();
    
}
