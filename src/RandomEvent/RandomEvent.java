package RandomEvent;
import java.util.Random;
import irlPackage.*;
import NormalDay.*;
import character.Character;
/**
 * 
 * @author Sean, Dylan
 * Random Event is a class the starter of a random obstacle that happens during the players day
 *
 */
public class RandomEvent implements DayState {

	public void goAboutDay(Character player, PlayerDay state) {
		
		int level = player.getLevel();
		Random rand = new Random();
		int type = rand.nextInt(3);
		
		System.out.println("A random event happened!");//tester output
		
		AbstractFactory eventFactory = MakeEvent.getFactory(level);
		eventFactory.getEvent(type);
		
		//right now day is cut short as it ends as randomEvent ends it
		
		
		System.out.println("Changing back to normal state..");//tester output
		NormalDay norm = new NormalDay();
		state.setState(norm);
		
	}
	

}
