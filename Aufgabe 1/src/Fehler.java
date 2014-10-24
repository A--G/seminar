
public class Fehler { // 1. "public" fehlte

	public Integer variable1; // 2. Semikolon
	
	public Integer variable2; // 3. der Name des Attributs darf kein Leerzeichen enthalten 
	
	public String variable3;
	
	public Boolean variable4; //4. Attribut darf nicht "variable3" heißen, weil schon eine Attribut als "variable3" deklariert wurde
	
	
	public void methode1() { // 5. die runden Klammern haben gefehlt
		System.out.println("Methode 1 aufgerufen");
	}
	
	public void methode2() { 
		System.out.println("Methode 2 aufgerufen");
	} //6. schließende geschweifte Klammer fehlte
		
	public void methode3() { 
		System.out.println("Methode 3 aufgerufen");
	}
	
}
