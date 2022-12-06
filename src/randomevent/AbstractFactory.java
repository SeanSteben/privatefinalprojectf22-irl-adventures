package randomevent;


public interface AbstractFactory {

	abstract Event getEvent(int type);
	
}
