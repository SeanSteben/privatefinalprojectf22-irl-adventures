package irlpackage;
import java.util.Scanner;
import character.Character;
import character.Caretaker;

/**
 * @author Sean Steben
 * Driver creates grabs an instance of player, creates a new instance of day and an observer
 */


public class Driver {

	public static void main(String[] args) {
		
		Character player = Character.getInstance();
		Caretaker ct = new Caretaker();
		Scanner scan = new Scanner(System.in);
		
		if (!ct.isFirstGame()) {
			ct.loadFromFile();
		}else {
			System.out.println("What is your name? ");
			player.changeName(scan.next());
		}

		
		PlayerDay myDay = new PlayerDay();
		new RandomEventObserver(myDay);

		//right now first call is normal day state
		
		//keep going about day until end 
		myDay.doDay(player);//right now second call is random event state
		
		char cont = 'y';
		while(cont == 'y'){
		Scanner scan = new Scanner(System.in);
		int dayCount;
		System.out.println("Hello! Welcome to IRL Adventures!  \n" + 
							"Please enter game length(in days)");
		dayCount = scan.nextInt();
		for(int i = 1; i <= dayCount; i++)
		{
			char cont = 'y', saveChoice = 'y';
			while(cont == 'y' && player.getTime()!= 0){
			
				myDay.goAboutDay(player);

				System.out.println("Continue(y/n)" );
				cont = scan.next().charAt(0);
			}//end of day here
			player.resetTime();
			System.out.println("You've reached the end of the day!");
			System.out.println("Would you like to save? (y/n)");
			saveChoice = scan.next().charAt(0);
			if(saveChoice == 'y')
			{
				System.out.println("Saved!");
				//Dylan, recommend starting save sale file option here
			}
			
		}//end of game here
		System.out.println("You've reached the end of the game!");
		
		player.save();
		ct.saveToFile();

	}

}
