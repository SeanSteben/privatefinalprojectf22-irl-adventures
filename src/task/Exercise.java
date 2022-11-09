package task;

import character.Character;
//@Sean Steben
//Adds xp towards appropiate skills
public class Exercise extends DailyTask {

	public void updateChar(Character myPlayer)
	{
		myPlayer.addStr(xp);
		myPlayer.addCon(xp);
		myPlayer.addDex(xp);
		
	}
	
	
	
}
