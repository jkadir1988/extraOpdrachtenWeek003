package ExtraOpdracht003OOP;

import java.util.ArrayList;
import java.util.List;

public class OefenOpdracht002 {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Garage garage = new Garage();
		System.out.println("Voor de garage");
		auto.lijstMetAutoos();
		auto.kapot = true;
		System.out.println("\nNa de garage");
		auto.lijstMetAutoos();
		garage.apkKeuring(auto);
	}

}

class Auto {
	String merk;
	boolean kapot = false;
	
	void lijstMetAutoos() {
		ArrayList<String> autoos = new ArrayList<>();
		autoos.add("Audi");
		autoos.add("Alfa");
		autoos.add("BMW");
		autoos.add("Volvo");
		autoos.add("Porsche");
		autoos.add("Ford");
		for (String cars : autoos) {
			System.out.println(cars + "\t status \t" + kapot);
		}
	}
	
	
}

class Garage {
	void repareren(Auto mobiel) {
		mobiel.kapot = false;
	}
	void apkKeuring(Auto car) {
		if (car.merk.startsWith("a") != true){ // Ik probeer alle auto's met een A te onderscheiden in prijs. 
			System.out.println(car + "€50,00 betalen voor APK");
		} else {
			System.out.println(car + "€20,00 betalen voor APK");
		}
	}
}
