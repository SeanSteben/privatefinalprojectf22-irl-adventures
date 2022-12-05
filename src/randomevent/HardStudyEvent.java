package randomevent;
import character.Character;

public class HardStudyEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("Finish the New York Times crossword in pen.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!\n");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getIntel() > 50 && player.getWis() > 50) {
			return true;
		}
		return false;
	}
}
