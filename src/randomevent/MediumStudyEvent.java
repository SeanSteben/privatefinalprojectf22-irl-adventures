package randomevent;
import character.Character;

public class MediumStudyEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("Fix a bug in some legacy code.");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up! \n");
			player.levelUp();
		} else {
			System.out.println("Skillcheck failed :( Better luck next time.");
		}
	}
	
	public boolean isPassed() {
		if (player.getIntel() > 30 && player.getWis() > 30) {
			return true;
		}
		return false;
	}
}
