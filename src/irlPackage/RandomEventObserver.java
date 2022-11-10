package irlPackage;
/**
 * 
 * @author Sean Steben
 * This observer receives word of the state change into a random event
 *
 */
public class RandomEventObserver extends Observer {
	
	public RandomEventObserver(PlayerDay day) {
		this.day = day;
		this.day.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Random Oberver knows state change");//tester text for validation
		
		day.getState();
	}

}
