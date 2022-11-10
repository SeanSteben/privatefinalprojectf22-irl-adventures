package RandomEvent;

/**
 * Interface that is implemented by concrete classes EasyEventFactory, MediumEventFactory, and HardEventFactory
 * @author Dylan
 *
 */
public abstract class AbstractFactory {

	abstract Event getEvent(int type);
	
}
