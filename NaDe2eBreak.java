package JojoGangster;

import java.util.Scanner;

// het aantal letters van het woord in beeld zien
// het aantal punten zetten
// Hij vraagt om invoer en toont de letter die is ingegeven
// checken of de letter erin zit


class NaDe2eBreak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String hetWoord = "Lantaarn";
			int aantal = hetWoord.length();
			System.out.println(aantal);
			for(int x = 0; x < aantal ; x++) {
				System.out.print(".");
			}
			boolean doorspelen = true;
			while(doorspelen) {
			System.out.println("Welke letter wil je proberen?");
			String gegevenAntwoord = scanner.nextLine();
			if (gegevenAntwoord.equals("qq")) {
				doorspelen = false;
			}
			System.out.println(gegevenAntwoord);
			System.out.println(hetWoord.contains(gegevenAntwoord));
			}
			System.out.println("Bedankt voor het spelen");
			
	}

}
