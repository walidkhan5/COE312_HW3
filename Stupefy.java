package HW3;

public class Stupefy implements Command{
    Spells s;

    Stupefy(Spells s)
    {
        this.s = s;
    }

    @Override
    public void execute(String deathEater) 
    {
        s.Stupefy(deathEater);
    }
}
