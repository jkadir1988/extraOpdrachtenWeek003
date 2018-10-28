package ExtraOpdracht003OOP;

public class OefenOpdracht001 {
	public static void main(String[] args) {
		Mens mens1 = new Mens();
		Dokter dokter = new Dokter();
		System.out.println("====voor de doktor");
		mens1.status();
		mens1.naam = "Kees";
		mens1.status();
		System.out.println("====na de doktor");
		dokter.genezen(mens1);
		mens1.status();
		mens1.leeftijd = 64;
		if (mens1.leeftijd >= 65) {
			System.out.println("\nRisico patient, ziekenhuis bellen");
		} else {
			System.out.println("\nParacetamol en rust is voldoende");
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
class Dokter {
	void genezen(Mens mens) {
		mens.ziek = false;
	}
}