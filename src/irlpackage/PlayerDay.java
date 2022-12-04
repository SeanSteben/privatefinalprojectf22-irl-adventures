package irlpackage;
import java.util.ArrayList;
import java.util.List;

import character.Character;
import normalday.*;

/**
 * 
 * @author Sean Steben
 * PlayerDay is the subject of the game play. It instantiates a "Normal Day"  state as a default while providing functionality
 * to utilize observers as well as changing the state of day
 */


//Subject class
public class PlayerDay {
	
	
	private DayState state = new RelaxedDay();//default state is normal day
	
	private List<Observer> observers = new ArrayList<Observer>();//list for other observers. as of now there is only 1

	public void doDay(Character player) {
		
		state.goAboutDay(player, this);
	}
	
	public DayState getState() {//only needed when state make explicit calls back to here
		return state;	 //will keep for now in case we change flow
	}
	public void eventOccured() {
		notifyObservers();
	}
	public void setState(DayState state) {
		this.state = state;
		//notifyObservers();
	}
	
	
	public void attach(Observer obs) {
		observers.add(obs);
		
	}
	public void notifyObservers() {
		for(Observer obs: observers)
			obs.update();
	}
}

