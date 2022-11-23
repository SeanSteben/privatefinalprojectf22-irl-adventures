package character;

import character.Character.Memento;

public class Caretaker {

	Memento lastSave;
	Character player = Character.getInstance();
	
	public void Save() {
		lastSave = player.save();
	}
	
	public void Load() {
		player.load(lastSave);;
	}
}
