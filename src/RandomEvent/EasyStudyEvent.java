package RandomEvent;
import character.Character;

/**
 * One of three easy events, checks the character's intelligence and wisdom variables to see if the character has high enough stats. If the skill check is passed, the character gains a level.
 * @author Dylan
 *
 */

public class EasyStudyEvent implements Event{
	
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
		if (player.getIntel() > 20 && player.getWis() > 20) {
			return true;
		}
		return false;
	}
}
