package RandomEvent;
import character.Character;

/**
 * One of three hard events, checks the character's strength, dexterity, and constitution variables to see if the character has high enough stats. If the skill check is passed, the character gains a level.
 * @author Dylan
 *
 */

public class HardExerciseEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		//System.out.print("Add scenario here");
		if (isPassed()) {
			System.out.println("Skillcheck Passed!");
			player.levelUp();
		} else {
			System.out.println("Better luck next time.");
		}
	}
	
	private boolean isPassed() {
		if (player.getStr() > 50 && player.getDex() > 50 && player.getCon() > 50) {
			return true;
		}
		return false;
	}
}
