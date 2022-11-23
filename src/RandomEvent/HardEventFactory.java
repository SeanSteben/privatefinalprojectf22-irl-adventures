package RandomEvent;


public class HardEventFactory extends AbstractFactory{

	public HardEventFactory(int type) {
		
	}
	
	public Event getEvent(int type){
		if (type == 0) {
			return (Event) new HardExerciseEvent();
		} else if (type == 1) {
			return (Event) new HardSocialEvent();
		} else if (type == 2) {
			return (Event) new HardStudyEvent();
		} else {
			return null;
		}
	}
}
