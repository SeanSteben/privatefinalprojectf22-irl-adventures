package task;

import character.Character;
//@Sean Steben
//Adds xp towards appropiate skills
public class Socialize extends DailyTask {
	public void updateChar(Character myPlayer)
	{
		myPlayer.addChr(xp);
		myPlayer.addKnd(xp);
		
	}

}
