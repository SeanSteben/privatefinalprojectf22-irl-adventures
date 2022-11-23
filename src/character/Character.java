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
	private int level;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int constitution;
	private int kindness;

	//Private constructor to ensure that only this class can create a Character.
	private Character() {
		level = 1;
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
	public int getLevel() {return level;}
	
	public int getStr() {return strength;}

	public int getDex() {return dexterity;}

	public int getIntel() {return intelligence;}

	public int getWis() {return wisdom;}

	public int getChr() {return charisma;}

	public int getCon() {return constitution;}

	public int getKnd() {return kindness;}

<<<<<<< HEAD
	public void setLevel(int lvl) {level = lvl;}
	
	public void setStr(int str) {strength = str;}
	
	public void setDex(int dex) {dexterity = dex;}
	
	public void setIntel(int intel) {intelligence = intel;}
	
	public void setWis(int wis) {wisdom = wis;}
	
	public void setChr(int chr) {charisma = chr;}
	
	public void setKnd(int knd) {kindness = knd;}
=======

>>>>>>> a78b1cb92a4d76a99101ef8216f7d40a99e61f8e
	
	//Adds a certain value to the current stat value.
	public void addStr(int amt) {strength += amt;}

	public void addDex(int amt) {dexterity += amt;}

	public void addIntel(int amt) {intelligence += amt;}

	public void addWis(int amt) {wisdom += amt;}

	public void addChr(int amt) {charisma += amt;}

	public void addCon(int amt) {constitution += amt;}

	public void addKnd(int amt) {kindness += amt;}
	
	public void levelUp() {level++;}
	
	public Memento save() {
		return new Memento();
	}
	
	public void load(Memento lastSave) {
		level = lastSave.getLevel();
		strength = lastSave.getStr();
		dexterity = lastSave.getDex();
		intelligence = lastSave.getIntel();
		constitution = lastSave.getCon();
		wisdom = lastSave.getWis();
		charisma = lastSave.getChr();
		kindness = lastSave.getKnd();
	}
	public class Memento{
		
		private int level, strength, intelligence, dexterity, constitution, wisdom, charisma, kindness;
		private Character player  = Character.getInstance();
		
		private Memento() {
			this.level = player.getLevel();
			this.strength = player.getStr();
			this.intelligence = player.getIntel();
			this.dexterity = player.getDex();
			this.constitution = player.getCon();
			this.wisdom = player.getWis();
			this.charisma = player.getChr();
			this.kindness = player.getKnd();
		}
		
		private int getLevel() {return level;}
		
		private int getStr() {return strength;}
		
		private int getDex() {return dexterity;}
		
		private int getIntel() {return intelligence;}
		
		private int getWis() {return wisdom;}
		
		private int getChr() {return charisma;}
		
		private int getCon() {return constitution;}
		
		private int getKnd() {return kindness;}
		
	}
}