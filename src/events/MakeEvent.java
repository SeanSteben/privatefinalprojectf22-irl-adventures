package events;

public class MakeEvent {

	public AbstractFactory getFactory(int level) {
		if(level < 10) {
			return new EasyEventFactory();
		} else if(level < 25) {
			return new MediumEventFactory();
		} else {
			return new HardEventFactory();
		}
	}
}
