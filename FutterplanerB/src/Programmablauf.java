import java.util.ArrayList;
import java.util.Scanner;

import Futter.Futter;
import Tiere.Tier;

public class Programmablauf {
	
	public static void main(String[] args) {
		
		// Konsolen Willkommen mit Eingabenaufforderung
		System.out.println("W�hle dein Haustier:");
		System.out.println("\"Hund\", \"Katze\", \"Nagetier\" oder \"Vogel\" ");
		
		// Eingabe wird eingelesen/gespeichert
		Scanner sc = new Scanner(System.in);
		String tierEingabe = sc.next();
		sc.close();
		
		// Die "Fabrik" wird erstellt
		PlanerFabrik planerFabrik = new PlanerFabrik();
		
		// Ein Tier wird aus der Fabrik erstellt
		Tier tier = planerFabrik.getTier(tierEingabe);
		// passende Futter Liste wird aus Fabrik ermittelt
		ArrayList<Futter> passendeFutterSorten = planerFabrik.getFutter(tier.getName());
				
		// Ausgabe des Tiernamens und der passenden Futtersorten
		System.out.println("F�r dein Haustier "+ tier.getName()+ " eignet sich");
		for(Futter futterName: passendeFutterSorten) {
			System.out.print(futterName.getName()+" ");
		}
	}
}
