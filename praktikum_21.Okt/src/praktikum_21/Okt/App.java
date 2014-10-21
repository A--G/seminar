package praktikum_21.Okt;

public class App {

	public static void main(String[] args) {
		
		Cat Will = new Cat();
		Cat Lucien = new Cat();
		
		Will.name = "Will";
		Lucien.name = "Lucien";
		
		Will.age = 16;
		Lucien.age = 12;
		
		Will.color = "black";
		Lucien.color = "white";
		
		System.out.println(Will.name + "'s color is " + Will.color + "." );
		
		Dog Felix = new Dog();
		
		Felix.name = "Felix";
		Felix.height = 25;
	
		System.out.println(Felix.name + " " + Felix.height);
		

	}

}
