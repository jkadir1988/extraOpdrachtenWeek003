package ExtraOpdracht003OOP;

import java.util.ArrayList;

public class OefenOpdracht005 {
	public static void main(String[] args) {
		Persoon persoon1 = new Persoon();
		persoon1.naam = "Frits";
		Persoon persoon2 = new Persoon();
		persoon2.naam = "Jan";
		TicketSales ts = new TicketSales();
		Feest zeventies = new Feest();
		zeventies.feestNaam= "70s feest";
		zeventies.bezoekersBekijken();
		ts.kaartjeVerkopen(zeventies, persoon1);
		System.out.println("aantal personen zijn binnen: 1");
		zeventies.bezoekersBekijken();
		ts.kaartjeVerkopen(zeventies, persoon2);
		System.out.println("\naantal personen zijn binnen: 2");
		zeventies.bezoekersBekijken();
		Uitsmijter bouncer = new Uitsmijter();
		bouncer.verwijderen(persoon1.naam); //persoon1 wordt verwijderd
		Persoon persoon3 = new Persoon();
		persoon3.naam = "Klaas"; //persoon3 wordt toegevoegd
		ts.kaartjeVerkopen(zeventies, persoon3);
		System.out.println("\naantal personen zijn binnen: 2 en frits is weg");
		zeventies.bezoekersBekijken(); // persoon1 staat nog in de lijst
		
	}
}

class Feest {
	String feestNaam;
	Persoon DJ;
	ArrayList<Persoon> bezoekers = new ArrayList();
	Uitsmijter uitsmijter;

	void bezoekersBekijken() {
		for(Persoon visit : bezoekers) {
		System.out.println(visit.naam + ". Geniet van " + feestNaam);
		}
	}
}

class Persoon {
	String naam;
	int leeftijd;
}

class Uitsmijter {
	void verwijderen(String voornaam) {
		System.out.println("\n" + voornaam + " wordt eruit geschopt");
	}
}

class TicketSales {
	void kaartjeVerkopen(Feest feest, Persoon persoon) {
		feest.bezoekers.add(persoon);
	}
}
