package character;
/**
 * The Character class stores the stats for the player character. This class utilizes the Singleton
 * design pattern to ensure that there is only one instance of a character. Includes get methods for 
 * each stat along with methods to add to the stat value.
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
	
	//Constructor for Character class, initializes all stats to 10.
	private Character() {
		strength = 10;
		dexterity = 10;
		intelligence = 10;
		wisdom = 10;
		charisma = 10;
		constitution = 10;
		kindness = 10;
	}
	
	//Allows other classes to access the singleton character class. Creates one if it doesn't
	//already exist.
	public static Character getInstance() {
		if (player == null) {
			player = new Character();
		}
		return player;
	}
	
	//getter methods for each stat.
	public int getStr() {return strength;}
	
	public int getDex() {return dexterity;}
	
	public int getIntel() {return intelligence;}
	
	public int getWis() {return wisdom;}
	
	public int getChr() {return charisma;}
	
	public int getCon() {return constitution;}
	
	public int getKnd() {return kindness;}
	
	//Methods that allow stats to be increased.
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
