package RandomEvent;
import character.Character;

/**
 * One of three medium events, checks character's charisma and kindness variables to see if the character has high enough stats. If the skill check is passed, the character gains a level.
 * @author Dylan
 *
 */

public class MediumSocialEvent implements Event{

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
		if (player.getChr() > 30 && player.getKnd() > 30) {
			return true;
		}
		return false;
	}
}
