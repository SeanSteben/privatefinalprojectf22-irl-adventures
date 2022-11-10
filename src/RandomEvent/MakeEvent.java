package RandomEvent;

/**
 * Generates factories for the AbstractFactory class. The type of factory used
 *  will be determined by the character's level, which is passed into the getFactory method.
 * @author Dylan
 *
 */

public class MakeEvent {
	
	public static AbstractFactory getFactory(int level) {
		if(level < 10) {
			return new EasyEventFactory();
		} else if(level < 25) {
			return new MediumEventFactory();
		} else {
			return new HardEventFactory();
		}
	}
}
