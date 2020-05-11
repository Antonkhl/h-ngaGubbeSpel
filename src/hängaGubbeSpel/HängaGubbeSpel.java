package hängaGubbeSpel;

import java.util.Scanner;

public class HängaGubbeSpel {

public static void main(String[] args) {
	instruktionsNamn("name");
}


public static void instruktionsNamn(String namn) {
	System.out.println("Hej och välkomna till det BÄSTA hänga gubbe spel, vi kommer verkligen testa dina kunskaper när det gäller meningar och ord.");
	System.out.println("Jag kommer nu framöver i programet fråga dig/er några frågor för att forma denna hänge gubbespel på det sättet ni vill, och som passar er. Och sedan innan vi börjar ska jag förklara reglerna beroende på dom val ni har valt. ");
	System.out.println("På vägen kommer jag ochså berätta relevans till allt jag frågar er");
	System.out.println("Men innan vi börjar med all detta, var heter du?");
	
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	
	System.out.println("Hej " + name + "! Hoppas att du kommer gilla min program");
	
	twoOnePlayers(name, false);
}

public static void twoOnePlayers(String name, boolean oneOrTwoPlayers) {
	String svar1A = "Two";
	String svar1B = "two";
	String svar2A = "En";
	String svar2B = "en";
	
	System.out.println("Ok " + name + " Skulle du vilja köra i tvåspelarläge eller enspelareläge? (En/Two)");
	Scanner input = new Scanner(System.in);
	String svar = input.nextLine();
	
	if (svar == svar1A || svar == svar1B) {
		oneOrTwoPlayers = true;
	    secondPlayerName(name,true);
	}
	
	if (svar == svar2A || svar == svar2B) {
		oneOrTwoPlayers = false;

	}
}
	
	public static void secondPlayerName(String name, boolean oneOrTwoPlayers) {
		System.out.println("Ok " + name + " Nu skulle jag ochså vilja ha namnet på andra personen av samma skäl!");
		
		Scanner input = new Scanner(System.in);
		String secondPlayerName = input.nextLine();
		
		System.out.println("Hej " + secondPlayerName + "! Hoppas du och " + name + " har det kul!");
		
		twoPlayerSentencesOrWords(name, true, secondPlayerName);
		
	}
	
	public static void twoPlayerSentencesOrWords(String name, boolean oneOrTwoPlayers, String secondPlayerName) {
		
	}
	
	
	
	
	

	
	
	
}
