package randomevent;
import character.Character;

public class HardExerciseEvent implements Event{

	Character player = Character.getInstance();
	
	public void skillCheck() {
		System.out.println("You are stranded in the wilderness after a plane crash. Fight off bears to survive!");
		if (isPassed()) {
			System.out.println("Skillcheck Passed! You level up!");
			player.levelUp();
		} else {
			System.out.println("Skill check failed :( Better luck next time.\n");
		}
	}
	
	public boolean isPassed() {
		if (player.getStr() > 50 && player.getDex() > 50 && player.getCon() > 50) {
			return true;
		}
		return false;
	}
}
