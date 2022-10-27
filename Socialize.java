package irlPackage;
//@Sean Steben
//Adds xp towards appropiate skills
public class Socialize extends DailyTask {
	public void updateChar(Character myPlayer)
	{
		myPlayer.addChr(xp);
		myPlayer.addKnd(xp);
		
	}

}
