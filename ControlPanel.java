package HW3;

public class ControlPanel 
{
	 Command [] slots;

	    public ControlPanel(Command[] slots)
	    {
	        this.slots = slots;
	    }

	    public void castingSpell(int index, String deathEaters)
	    {
	        slots[index].execute(deathEaters);
	    }
}
