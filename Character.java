
package HW3;

import java.util.Scanner;

public class Character extends ConcreteSubject implements Runnable {

	String loc;
	Watch w;
	Command[] spells;
	Spells s;
	ControlPanel cp;
	Thread t;

	boolean polyPotion = false;

	boolean invisibilePotion = false;

	private static Character ch;

	private Character(Watch w, Spells s) {
		super();
		this.loc = "Entrance";
		this.w = w;
		this.s = s;
		Expelliarmus expelliarmus = new Expelliarmus(s);
		Stupefy sptupefy = new Stupefy(s);
		Protego protego = new Protego(s);
		ExpectoPatronum expectoPatronum = new ExpectoPatronum(s);
		Command[] sp = { expelliarmus, sptupefy,protego, expectoPatronum };
		spells = sp;

		cp = new ControlPanel(spells);

		System.out.println("The Entrance"
				+ "\n\nYou arrive at the doors of Hogwarts. The door on the north wall leads to the dining\r\n" + 
				"hall, the door to the east leads to the Potions class, and the door to the west leads to\r\n" + 
				"the Library.");

		boolean status = false; 

		String exit = "mischief managed"; 

		Scanner object = new Scanner(System.in);

		String c = object.nextLine();

		while (!status) {
			if (c.contains("Potions") || c.contains("East")) {
				setLocation("Potions");
				new PortionsClassroom(this);
				status = true;
			}
			else if (c.contains("Library") || c.contains("West")) {
				setLocation("Library");
				new Library(this);
				status = true;
			}
			  else if (c.contains("Dining") || c.contains("North")) {
				setLocation("Dining");
				new DiningHall(this);
				status = true;
			  } else if (c.equals(exit)) {
				status = true;
			} else {
				System.out.println("Invalid option,  try again:");
				System.out.println();
				c = object.nextLine();
			}
			t = new Thread(this);
			t.start();
		}
	}

	public static synchronized Character getInstance(Watch watch, Spells spell) {
		if (ch == null) {
			ch = new Character(watch, spell);
		}
		return ch;
	}
	
	public synchronized String getLocation() {
		return loc;
	}

	public synchronized void setLocation(String loc) {
		this.loc = loc;
	}


	@Override
	public void run() {
		Scanner object = new Scanner(System.in);
		while (true) {
			if (w.b) {
				String chief = object.nextLine();
				if (chief.equals("mischief managed")) {
					System.out.println("You closed the map and did not find Hermione");
					System.exit(1);
				}

				NotifyObserver();
			}

		}

	}
}

