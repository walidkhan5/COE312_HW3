package HW3;

public class Watch extends ConcreteSubject implements Runnable {

	
	boolean b;
		
    private static Watch instance;	
	
    Thread t;
	
	private Watch() 
	{
		
		super();
			
		t = new Thread(this);
		
		t.start();
	}

	
	public static synchronized Watch getInstance()
	{
	    if(instance == null)
	    {
	        instance = new Watch();
	    }
	    return instance;
	}

	
	@Override
	public void run() 
	{
		try 
		{
			
			for (int i = 0; i < 5; i++) 
			{
				
				t.sleep(60000);
				
				System.out.println((i+1)+" minutes have passed, you have "+(5-(i+1))+" minutes left..");				
			}

			System.out.println("You have 10 seconds to close the map before you get caught");
			 b = true;
			
			try 
			{
				
				 t.sleep(10000);
			} 
			
			catch (InterruptedException e) 
			{
				e.getStackTrace();
			}
			
			System.out.println("you have been caught using the map and the map has been confiscated and you lost");
            System.exit(1);			
	
		} 
		
		catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
}
