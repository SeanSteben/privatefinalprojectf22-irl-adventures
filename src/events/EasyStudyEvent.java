package events;

import character.Character;

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
	
	public boolean isPassed() {
		if (player.getIntel() > 20 && player.getWis() > 20) {
			return true;
		}
		return false;
	}
}
