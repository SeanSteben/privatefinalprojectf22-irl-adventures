package character;

import character.Character.Memento;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
	
	//returns the stored Memento object
	public void load() {
		
		try {
			File save = new File("SaveData.txt");
			Scanner loader = new Scanner(save);
			String saveData = loader.nextLine();
			loader.close();
			player.load(saveData);
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
			e.printStackTrace();
		}
		

	}
	
	
}
