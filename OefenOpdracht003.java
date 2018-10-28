package ExtraOpdracht003OOP;

// vrachtauto die lading vervoert
public class OefenOpdracht003 {
	public static void main(String[] args) {
		Vrachtauto va = new Vrachtauto();
		Lading lading = new Lading();
		lading.toonLading();
		va.uitladen(lading);
		lading.toonLading();
	}
}

class Vrachtauto {
	void uitladen(Lading lading) {
		lading.voorraad = true;
	}
}

class Lading {
	boolean voorraad = false;

	void toonLading() {
		System.out.println("voorraad is uitgeladen : " + voorraad);
	}
}
