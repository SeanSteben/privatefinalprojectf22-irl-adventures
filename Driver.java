package irlPackage;
import java.util.Scanner;
/**
 * @author Sean Steben
 * Driver starts the program and provides a base to what the application will be doing as a whole
 */


public class Driver {

	public static void main(String[] args) {
		
		Character player = new Character();
		int choice;
		Scanner scan = new Scanner(System.in);
		char cont = 'y';
		while(cont == 'y'){
			System.out.println("Your current stats: " + "\n" + 
					"Strength: " + player.getStr() + "\n" +
					"Dexterity: " + player.getDex() + "\n" +
					"Intelligence: " + player.getIntel() + "\n" +
					"Wisdom: " + player.getWis() + "\n" +
					"Charisma: " + player.getChr() + "\n" +
					"Constituion: " + player.getCon() + "\n" +
					"Kindness: " + player.getKnd()+ "\n");
			System.out.println("What activity would you like to do?"+ "\n" +
					"1) Exercise" + "\n" +
					"2) Study" + "\n" + 
					"3) Socialize");
			choice = scan.nextInt();
			if(choice == 1) {
				Exercise ex = new Exercise();
				ex.doActivity();ex.updateChar(player);
			}
			if(choice == 2) {
				Study st = new Study();
				st.doActivity();st.updateChar(player);
			}
			if(choice == 3) {
				Socialize soc = new Socialize();
				soc.doActivity();soc.updateChar(player);
			}
			
			System.out.println("Continue?(y/n)");
			cont = scan.next().charAt(0);
		
		}
		

	}

}
