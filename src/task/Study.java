package task;

import character.Character;
//@Sean Steben
//Adds xp towards appropiate skills
public class Study extends DailyTask {
	public void updateChar(Character myPlayer)
	{
		myPlayer.addIntel(xp);
		myPlayer.addWis(xp);
		
	}

}
