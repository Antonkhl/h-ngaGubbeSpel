package h�ngaGubbeSpel;

import java.util.Scanner;

public class H�ngaGubbeSpel {

public static void main(String[] args) {
	instruktionsNamn("name");
}


public static void instruktionsNamn(String namn) {
	System.out.println("Hej och v�lkomna till det B�STA h�nga gubbe spel, vi kommer verkligen testa dina kunskaper n�r det g�ller meningar och ord.");
	System.out.println("Jag kommer nu fram�ver i programet fr�ga dig/er n�gra fr�gor f�r att forma denna h�nge gubbespel p� det s�ttet ni vill, och som passar er. Och sedan innan vi b�rjar ska jag f�rklara reglerna beroende p� dom val ni har valt. ");
	System.out.println("P� v�gen kommer jag ochs� ber�tta relevans till allt jag fr�gar er");
	System.out.println("Men innan vi b�rjar med all detta, var heter du?");
	
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
	
	System.out.println("Ok " + name + " Skulle du vilja k�ra i tv�spelarl�ge eller enspelarel�ge? (En/Two)");
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
		System.out.println("Ok " + name + " Nu skulle jag ochs� vilja ha namnet p� andra personen av samma sk�l!");
		
		Scanner input = new Scanner(System.in);
		String secondPlayerName = input.nextLine();
		
		System.out.println("Hej " + secondPlayerName + "! Hoppas du och " + name + " har det kul!");
		
		twoPlayerSentencesOrWords(name, true, secondPlayerName);
		
	}
	
	public static void twoPlayerSentencesOrWords(String name, boolean oneOrTwoPlayers, String secondPlayerName) {
		
	}
	
	
	
	
	

	
	
	
}
