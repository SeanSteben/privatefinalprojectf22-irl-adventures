package irlPackage;

import java.util.Scanner;
/*@Sean Steben
Daily Task is an abstract class that provides common functionality for it's child classes events. The template method provides a hook
for the child classes to use. Each child class provides their own implementation of update as they will be updating different statistics*/
public abstract class DailyTask {
	protected int xp;
	 protected void calcTime()
	 {
		 int time;
		System.out.println("How long would you like to this activity for?(in minutes)");
		Scanner scan = new Scanner(System.in);
		time = scan.nextInt();
		xp = time / 10;//for every 10 minutes of activity, +1 in related stats
		
			
	 }
	 protected void showResults()
	 {
		 System.out.println("You've earned "+ xp + " xp!");
		 
	 }
	 /*Each activity will update character stats differently so each activity will implement
	  * their own version of updateChar*/
	 abstract void updateChar(Character myPlayer);
	 public void doActivity()//template method
	 {
		calcTime();
		showResults();
	 }
	

}
