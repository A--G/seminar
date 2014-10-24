
public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler(); // 7. runde Klamern
		f.variable1 = 10; //8. "1" hat gefehlt
		f.variable2 = 10; //9. Semikolon
		f.variable3 = "20"; //10. variable3 ist vom Datentyp String, daher kann ihr kein Integer zugewiesen werden
		f.methode1();
		f.methode2();
		f.methode3(); // 11. Leerzeichen
		System.out.println("Alle Fehler sind verschwunden!");
	}

}
