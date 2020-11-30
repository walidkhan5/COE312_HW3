package HW3;

public class Hermione extends ConcreteObserver  
{

	Character ch;

	public Hermione(Character ch) 
	{
		super(ch);
		this.ch = ch;
		
		ch.RegisterObserver(this);
	}

	@Override
	public void update() 
	{
        if (ch.getLocation().equals("Library")) 
        {
            System.out.println("Hermione shouts I am here!");
            ch.RemoveObserver(this);
        }
    }
}

