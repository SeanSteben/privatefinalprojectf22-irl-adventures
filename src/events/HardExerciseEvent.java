package events;

import character.Character;

public class HardExerciseEvent {

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
		if (player.getStr() > 50 && player.getDex() > 50 && player.getCon() > 50) {
			return true;
		}
		return false;
	}
}
