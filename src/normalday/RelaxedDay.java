package normalday;
import irlpackage.*;
import randomevent.RandomEvent;

import java.util.Scanner;

import character.Character;
/**
 * 
 * @author Sean Steben
 * RelaxedDay is the state of which the character performs fresh and  relaxed. They receive bonus XP  for completing tasks in this state
 */

public class RelaxedDay implements DayState {
	
	 public void goAboutDay(Character player, PlayerDay state) {
		int thisState = 1;
		int choice;
		Scanner scan = new Scanner(System.in);
			System.out.println("This is a relaxed day!");
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
				ex.doActivity(player,thisState);
			}
			if(choice == 2) {
				Study st = new Study();
				st.doActivity(player,thisState);
			}
			if(choice == 3) {
				Socialize soc = new Socialize();
				soc.doActivity(player,thisState);
			}
			
			//tester for change into RandomEvent State
			if(choice == 4)
			{
				System.out.println("Random Event Triggered");//tester text
				RandomEvent rand = new RandomEvent();
				rand.startRand(player);
				state.eventOccured();
				
				
			}
	 }
}

