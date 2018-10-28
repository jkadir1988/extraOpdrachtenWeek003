package ExtraOpdracht003OOP;

import java.util.ArrayList;
import java.util.List;

public class OefenOpdracht002 {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Garage garage = new Garage();
		System.out.println("Voor de garage");
		garage.lijstMetAutoos();
		System.out.println(garage.autoos + "\t is kapot:  \t" + auto.kapot);
		System.out.println("\nNa de garage");
		System.out.println(garage.autoos + "\t is kapot:  \t" + garage.repareren(auto));
		garage.apkKeuring(auto);
	}

}

class Auto {
	String merk;
	boolean kapot = true;
	
}

class Garage {
	List<String> autoos = new ArrayList<>();

	boolean repareren(Auto mobiel) {
		return false;
	}
	void apkKeuring(Auto car) {
		lijstMetAutoos();
		if (car.merk.startsWith("A")){ // Ik probeer alle auto's met een A te onderscheiden in prijs. 
			System.out.println(car + "€50,00 betalen voor APK");
		} else {
			System.out.println(car + "€20,00 betalen voor APK");
		}
	}
	void lijstMetAutoos() {
		autoos.add("Audi");
		autoos.add("Alfa");
		autoos.add("BMW");
		autoos.add("Volvo");
		autoos.add("Porsche");
		autoos.add("Ford");
	}
}
