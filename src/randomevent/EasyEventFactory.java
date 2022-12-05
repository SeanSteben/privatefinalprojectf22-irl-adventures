package randomevent;

public class EasyEventFactory extends AbstractFactory{
	
	public EasyEventFactory() {
		
	}
	
	public Event getEvent(int type){
		if (type == 0) {
			return (Event) new EasyExerciseEvent();
		} else if (type == 1) {
			return (Event) new EasySocialEvent();
		} else if (type == 2) {
			return (Event) new EasyStudyEvent();
		} else {
			return null;
		}
	}
	
}
