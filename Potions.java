package HW3;

public abstract class Potions {
    
	final void preparePotion(String add, String str,String temp)
    {
        add(add);

        stir(str);

        heat(temp);

        wave();
    }
    
	
	
	void add(String add)
    {
        System.out.println("Adding "+add+" in cauldron");
    }

    void stir(String str)
    {
        System.out.println("Stirring "+str);
    }
    void heat(String temp)
    {
        System.out.println("Heating at "+temp+" temperature");
    }

    abstract void wave();
}
