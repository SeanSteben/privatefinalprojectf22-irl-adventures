package character;

public class InitializeCharacter {

	public static void main(String[] args) {
		Character player = Character.getInstance();
		System.out.println(player.getStr());
	}
}
