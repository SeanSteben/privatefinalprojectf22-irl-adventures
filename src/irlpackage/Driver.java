package irlpackage;
import java.util.Scanner;

import character.Character;
/**
 * @author Sean Steben
 * Driver creates grabs an instance of player, creates a new instance of day and an observer
 * Continues as long as user wants
 */


public class Driver {

	public static void main(String[] args) {
		
		Character player = Character.getInstance();
		PlayerDay myDay = new PlayerDay();
		new RandomEventObserver(myDay);
		Scanner scan = new Scanner(System.in);
		//right now first call is normal day state
		
		//keep going about day until end 
		//myDay.doDay(player);//right now second call is random event state
		
		char cont = 'y';
		while(cont == 'y'){
			
			myDay.doDay(player);
		
			System.out.println("Continue?(y/n)");
			cont = scan.next().charAt(0);
			
		}
		
		

	}

}
