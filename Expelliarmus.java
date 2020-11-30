package HW3;

public class Expelliarmus implements Command 
{
    Spells s;

    Expelliarmus(Spells s)
    {
        this.s = s;
    }

    @Override
    public void execute(String deathEater ) 
    {
        s.Expelliarmus(deathEater );
    }
}
