package randomevent;
import java.util.Random;



public class MakeEvent {

	Random rand = new Random();
	int type = rand.nextInt(3);
	
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
