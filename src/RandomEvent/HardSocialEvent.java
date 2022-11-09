package RandomEvent;
import character.Character;

public class HardSocialEvent {

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
	
	public boolean isPassed() {
		if (player.getChr() > 50 && player.getKnd() > 50) {
			return true;
		}
		return false;
	}
}
