package RandomEvent;
import java.util.Random;



public class MakeEvent {

	Random rand = new Random();
	int type = rand.nextInt(3);
	
	public AbstractFactory getFactory(int level) {
		if(level < 10) {
			return new EasyEventFactory(type);
		} else if(level < 25) {
			return new MediumEventFactory(type);
		} else {
			return new HardEventFactory(type);
		}
	}
}
