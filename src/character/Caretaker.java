package character;

import character.Character.Memento;

/**
 * Caretaker class that stores and returns the last saved Memento object.
 * 
 * @author Dylan
 *
 */
public class Caretaker {

	Memento lastSave;
	Character player = Character.getInstance();
	
	//sets the local Memento object to the most recent version of the character.
	public void save() {
		lastSave = player.save();
	}
	
	//returns the stored Memento object
	public void load() {
		player.load(lastSave);
	}
}
