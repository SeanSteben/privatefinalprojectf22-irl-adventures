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
	public void Save() {
		lastSave = player.save();
	}
	
	//returns the stored Memento object
	public void Load() {
		player.load(lastSave);
	}
}
