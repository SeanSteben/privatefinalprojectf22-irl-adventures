package character;

/**
 * The Character class creates a player character and store's its stats along with methods that access
 * those stats and add to their values. This class implements the Singleton design pattern to ensure
 * that there is only one instance of this class.
 * 
 * @author Dylan Fassio
 *
 */

public class Character {
	
	private static Character player;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int constitution;
	private int kindness;
	
	//Private constructor to ensure that only this class can create a Character.
	private Character() {
		strength = 10;
		dexterity = 10;
		intelligence = 10;
		wisdom = 10;
		charisma = 10;
		constitution = 10;
		kindness = 10;
	}
	
	//Allows other classes to interact with single Character, creates one if it doesn't already exist. 
	public static Character getInstance() {
		if (player == null) {
			player = new Character();
		}
		return player;
	}
	
	//Access methods that return the current value of each stat.
	public int getStr() {return strength;}
	
	public int getDex() {return dexterity;}
	
	public int getIntel() {return intelligence;}
	
	public int getWis() {return wisdom;}
	
	public int getChr() {return charisma;}
	
	public int getCon() {return constitution;}
	
	public int getKnd() {return kindness;}
	
	//Adds a certain value to the current stat value.
	public void addStr(int amt) {
		strength += amt;
	}
	
	public void addDex(int amt) {
		dexterity += amt;
	}
	
	public void addIntel(int amt) {
		intelligence += amt;
	}
	
	public void addWis(int amt) {
		wisdom += amt;
	}
	
	public void addChr(int amt) {
		charisma += amt;
	}
	
	public void addCon(int amt) {
		constitution += amt;
	}
	
	public void addKnd(int amt) {
		kindness += amt;
	}
}
