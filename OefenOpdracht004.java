package ExtraOpdracht003OOP;
// drankje kopen
public class OefenOpdracht004 {
	public static void main(String[] args) {
		Klant jaap = new Klant();
		Winkel ah = new Winkel();
		jaap.kopen();
		ah.verkopen(jaap);
		jaap.kopen();

	}
}

class Klant {
	boolean dorst = true;
	
	void kopen() {
		System.out.println("Jaap heeft dorst : " + dorst);
	}
	
}

class Winkel {
	void verkopen(Klant klant) {
		klant.dorst = false;
	}
}