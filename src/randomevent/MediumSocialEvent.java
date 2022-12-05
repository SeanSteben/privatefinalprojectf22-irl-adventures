package randomevent;
import character.Character;

public class MediumSocialEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You're up next for karaoke. Go sing your heart out.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!\n");
			player.levelUp();
		} else {
			System.out.println("Skillcheck failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getChr() > 30 && player.getKnd() > 30) {
			return true;
		}
		return false;
	}
}
