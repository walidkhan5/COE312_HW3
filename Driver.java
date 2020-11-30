package HW3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids " +
                "\nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP" +
                "\n\nSay the magic phrase to reveal the map.");

        Scanner scanner = new Scanner(System.in);

        while (!scanner.nextLine().equals("I solemnly swear that I am up for no good")) 
        {
            System.out.println("Those are not the correct words try again: ");
        }

        Character.getInstance(Watch.getInstance(), new Spells());

    }
}
