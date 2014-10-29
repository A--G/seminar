
public class Fehler2 { //10.
	
	Integer addValues(Integer a, Integer b) { //5. 11.
		Integer summe = a + b; //1. 4.
		return summe;
	}
	
	void printString(String string) { //3.
		System.out.println(string); //2. 6. 7.
	}
	
	void printNumber(Integer zahl1, Integer zahl2) { //9.
		System.out.println("Summe von " + zahl1 + " und " + zahl2 + " ist: " + addValues(zahl1, zahl2));//8. /13.
	} //14.
	
	
}
