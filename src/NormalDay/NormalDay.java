package NormalDay;
import irlPackage.*;
import java.util.Scanner;
import RandomEvent.RandomEvent;
import character.Character;
/**
 * 
 * @author Sean Steben
 * Normal Day has the flow of the game in it's default state. Has the capability  of changing to another state
 * or keeping state the  same
 *
 */
//Normal day State
public class NormalDay implements DayState {
	
	 public void goAboutDay(Character player, PlayerDay state) {
		
		int choice;
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Your current stats: " + "\n" + 
					"Strength: " + player.getStr() + "\n" +
					"Dexterity: " + player.getDex() + "\n" +
					"Intelligence: " + player.getIntel() + "\n" +
					"Wisdom: " + player.getWis() + "\n" +
					"Charisma: " + player.getChr() + "\n" +
					"Constituion: " + player.getCon() + "\n" +
					"Kindness: " + player.getKnd()+ "\n");
			System.out.println("What activity would you like to do?"+ "\n" +
					"1) Exercise" + "\n" +
					"2) Study" + "\n" + 
					"3) Socialize" + "\n" +
					"4) Trigger RandomEvent **TESTER TO CHANGE STATE** ");
			choice = scan.nextInt();
			if(choice == 1) {
				Exercise ex = new Exercise();
				ex.doActivity(player);
			}
			if(choice == 2) {
				Study st = new Study();
				st.doActivity(player);
			}
			if(choice == 3) {
				Socialize soc = new Socialize();
				soc.doActivity(player);
			}
			
			//tester for change into RandomEvent State
			if(choice == 4)
			{
				System.out.println("Random Event Triggered");//tester text
				RandomEvent rand = new RandomEvent();
				//return rand;
				
				state.setState(rand);
			}
			else
				state.setState(this);
		
	}

	

	
}
