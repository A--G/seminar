package Katze;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Katze kitty = new Katze();
		kitty.name = "Kitty";
		kitty.color = "weiß";
		
		System.out.println(kitty.name + " ist " + kitty.color +".");
		kitty.schnurren();

	}

}
