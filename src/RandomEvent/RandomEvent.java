package RandomEvent;
import irlPackage.*;
import NormalDay.*;
import character.Character;
/**
 * 
 * @author Sean
 * Random Event is a class the starter of a random obstacle that happens during the players day
 *
 */
public class RandomEvent implements DayState {

	public void goAboutDay(Character player, PlayerDay state) {
		
		System.out.println("A random event happened!");//tester output
		
		//DYLAN please start abstract factory here
		
		
		
		//right now day is cut short as it ends as randomEvent ends it
		
		
		System.out.println("Changing back to normal state..");//tester output
		NormalDay norm = new NormalDay();
		state.setState(norm);
		
	}
	

}
