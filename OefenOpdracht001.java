package ExtraOpdracht003OOP;



public class OefenOpdracht001 {
	public static void main(String[] args) {
		Mens mens1 = new Mens();
		System.out.println("====voor de doktor");
		mens1.status();
		mens1.naam = "Kees";
		mens1.status();
		mens1.ziek = false;
		System.out.println("====na de doktor");
		mens1.status();
		mens1.leeftijd = 64;
		if (mens1.leeftijd >= 65) {
			System.out.println("Risico patient, ziekenhuis bellen");
		} else {
			System.out.println("Paracetamol en rust is voldoende");
		}

	}
}
class Mens {
	String naam;
	boolean ziek = true;
	int leeftijd;
	void status() {
		System.out.println(naam + " is ziek :" + ziek);
	}
	
	
}
class Doktor {
	void genezen(Mens mens) {
		mens.ziek = true;
	}
}

// Tot zover gaat het wel goed maar misschien mis ik wat uitdaging?