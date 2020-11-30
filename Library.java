package HW3;

import java.util.Scanner;

public class Library extends School {

	Hermione h;

	Library(Character ch) {
		super("Library", "West", "Draco Malfoy", ch);
		System.out.println("You have entered the library.");
		h = new Hermione(ch);
		Scanner object = new Scanner(System.in);
		String c = object.nextLine();
		while (!(c.contains("look"))) {
			System.out.println("Invalid option entered. Try again:");
			c = object.nextLine();
		}
		place();
	}

	@Override
	void look() {
		System.out.println(
				"Books is one of the core sources of knowledge that first year students are required to study in.\n"
						+ "In the potions class there is Draco Malfoy who is destroying the library. He seems very angry\n"
						+ "to see you and starts attacking you!");
		System.out.println("Library is one of the most important places to study peacefully for students\r\n"
				+ "Draco Malfoy is in the Libary and want to start attacking you!\r\n");

	}

	@Override
	void next() {
		if (!(!ch.polyPotion && !ch.invisibilePotion)) {
			System.out.println("Hermione is found!");

			Scanner object = new Scanner(System.in);

			while (!object.nextLine().equals("mischief managed")) {
				System.out.println("try again, not the correct words to close the map ");
			}
			System.out.println("Hiding map contents... end.");
			System.exit(1);
		}

		else {
			
			Scanner object = new Scanner(System.in);
			boolean status = false;
			while (!status) {
				String c = object.nextLine();
				if (c.contains("dining") || c.contains("north")) {
					status = true;
					ch.setLocation("Dining Hall");
					new DiningHall(ch);
				} else if (c.contains("potions") || c.contains("east")) {
					status = true;
					ch.setLocation("Potions Classroom");
					new PortionsClassroom(ch);
				} else {
					System.out.println("Invalid option, try again:");
				}

			}
		}
	}

	@Override
	void potionsProcedure() {

	}
}
