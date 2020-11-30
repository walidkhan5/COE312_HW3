package HW3;

public class ExpectoPatronum implements Command 
{
    Spells s;

    ExpectoPatronum(Spells s)
    {
        this.s = s;
    }

    @Override
    public void execute(String deathEater) 
    {
        s.ExpectoPatronum(deathEater);
    }
}
