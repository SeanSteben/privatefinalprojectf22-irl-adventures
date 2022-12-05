package randomevent;
import character.Character;

public class HardSocialEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You see Jeff Bezos walking down the street. Convince him to give you a job.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!\n");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getChr() > 50 && player.getKnd() > 50) {
			return true;
		}
		return false;
	}
}
