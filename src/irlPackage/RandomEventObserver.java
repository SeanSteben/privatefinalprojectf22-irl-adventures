package irlPackage;
import NormalDay.*;
/**
 * 
 * @author Sean Steben
 * This observer receives word of when random events happen. Changes the character's State of day into
 *
 */
public class RandomEventObserver extends Observer {
	private int eventCount  = 0;
	
	public RandomEventObserver(PlayerDay day) {
		this.day = day;
		this.day.attach(this);
	}
	@Override
	public void update() {
		
		eventCount++;
		if(eventCount >2)
		{
			System.out.println("Random Oberver has changed day state");//tester text for validation
			NormalDay norm = new NormalDay();
			day.setState(norm);
		}
		if(eventCount > 4)
		{
			System.out.println("Random Oberver has changed day state");//tester text for validation
			TiringDay tired = new TiringDay();
			day.setState(tired);
		}
		
	}

}
