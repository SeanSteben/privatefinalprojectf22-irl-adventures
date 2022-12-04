package character;

import character.Character.Memento;
import java.io.FileWriter;
import java.io.IOException;

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
		
		try {
			FileWriter saver = new FileWriter("SaveData.txt");
			saver.write(lastSave.toString());
			saver.close();
			System.out.println("Character successfully saved!"); //integrate with UI
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	//returns the stored Memento object
	public void load() {
		player.load(lastSave);
	}
	
	
}
