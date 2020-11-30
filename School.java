package HW3;

import java.util.Scanner;

public abstract class School {
	
	String name;
	String location;
	String DeathEaters;
	Character ch;
	
	 
	public School() 
	{

	}

	public School(String n, String l, String de, Character chr) 
	{
		this.location = l;
		
		this.name = n;
		
		this.DeathEaters=de;
		
		this.ch=chr;
	}
	
	final void place()
    {
        look();
        next();
        potionsProcedure();
        fight();
        
    }
 
	
	void fight()
	    {
	        if(name.equals("Library") && !ch.invisibilePotion && !ch.polyPotion)
	        {
	            System.out.println("You do not have the two potions with you so you cannot fight Draco Malfoy\n" +
	                    "Go to the Potions Classroom to get the potions.");
	        }
	        else {
	            Scanner obj = new Scanner(System.in);

	            String choice = "";

	            boolean status = false;

	            while (!status) {
	                choice = obj.nextLine();
	                if (choice.equals("Expelliarmus") ) 
	                {
	                	status = true;
	                    ch.cp.castingSpell(0, DeathEaters);
	                } 
	                else if (choice.equals("Protego") ) 
	                {
	                	status = true;
	                    ch.cp.castingSpell(2, DeathEaters);
	                } 
	                else if (choice.equals("Stupefy") ) 
	                {
	                	status = true;
	                    ch.cp.castingSpell(1, DeathEaters);
	                } 
	                else if (choice.equals("Expecto Patronum") ) 
	                {
	                	status = true;
	                    ch.cp.castingSpell(3, DeathEaters);
	                } 
	                else {
	                    System.out.println("invalid choice");
	                }
	            }
	        }
	    }
	    abstract void look();

	    abstract void next();
	
	    abstract void potionsProcedure();
}
	    
