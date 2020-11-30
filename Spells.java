package HW3;

public class Spells {
	
	void Expelliarmus(String deathEater) {
		System.out.println("You defeated " + deathEater + "!... the weapon has been disarmed from your enemy");
	}

	void Stupefy(String deathEater) {
		System.out.println("The " + deathEater + " has been stunned");
	}

	void Protego(String deathEater) {
		System.out.println("You saved yourself from " + deathEater
				+ " ...now you can now use the cauldron and ingredients to make the\r\n"
				+ "Polyjuice potion or the invisibility potion to proceed without anyone recognizing you…");
	}
	
	void ExpectoPatronum(String deathEater) {
		System.out.println(
				"You are now protected from Dark Magic. The " + deathEater + " can't attack you now");
	}


}
