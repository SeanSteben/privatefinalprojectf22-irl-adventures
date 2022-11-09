package events;

import character.Character;

public class EasyExerciseEvent implements Event{

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
		if (player.getStr() > 20 && player.getDex() > 20 && player.getCon() > 20) {
			return true;
		}
		return false;
	}
}
