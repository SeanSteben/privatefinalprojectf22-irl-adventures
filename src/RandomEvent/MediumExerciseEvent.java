package RandomEvent;
import character.Character;

/**
 * One of three medium events, checks the character's strength, dexterity, and constitution variables to see if the character has high enough stats. If the skill check is passed, the character gains a level.
 * @author Dylan
 *
 */

public class MediumExerciseEvent implements Event{

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
		if (player.getStr() > 30 && player.getDex() > 30 && player.getCon() > 30) {
			return true;
		}
		return false;
	}
}
