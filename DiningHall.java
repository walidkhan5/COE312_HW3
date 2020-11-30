
package HW3;


import java.util.Scanner;

public class DiningHall extends School 
{
	

	DiningHall(Character ch) 
	{

		super("DiningHall", "North", "Bellatrix Lestrange", ch);
		
		System.out.println("You have entered the dining hall");
		
		Scanner c  =  new Scanner(System.in);



		
		String str = c.nextLine();

		while (  !( str.contains("look") )  ) 
		{
			System.out.println("Invalid option entered. Try again:");
			str = c.nextLine();
		}
		place();
	}



	@Override
	void look() 
	{
		// TODO Auto-generated method stub
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Bellatrix Lestrange is here,\n" +
                "get ready to fight!");	
	}



	@Override
	void next() 
	{
		// TODO Auto-generated method stub

        //System.out.println("Were to next (Library west or Potions Classroom east): ");
        boolean status = false;
        Scanner object  = new Scanner(System.in);
        while (!status) 
        {
            String c = object.nextLine();
            if (c.contains("potions") || c.contains("east") ) 
            {
            	status = true;
                ch.setLocation("Potions Classroom");
                new PortionsClassroom(ch);
            }
            else if (c.contains("library") || c.contains("west") ) 
            {
            	status = true;
                ch.setLocation("Library");
                new Library(ch);
            }  
            else 
            {
                System.out.println("Invalid option entered. Try again:");
            }
        }
	}



	@Override
	void potionsProcedure() 
	{
		
	}

}



