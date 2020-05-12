package h�ngaGubbeSpel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		
		System.out.println("Ok " + name + " och" + secondPlayerName + " Skulle ni vilja gissa p� ord eller meningar? (Ord/Mening)" );
		
		Scanner input = new Scanner(System.in);
	    String svar = input.nextLine();
	    
	    if (svar==svar1B || svar==svar1A ) {
	    	boolean sentencesOrWords = true;
	    	selfDefiningWords(name,true,secondPlayerName,true);
	    	
	    }
	    
	    if (svar==svar2B || svar==svar2A ) {
	    	boolean sentencesOrWords = false;
	    }
	    
	}
	    
	    public static void selfDefiningWords(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords ) {
	    	String svar1A = "Sj�lv";
			String svar1B = "sj�lv";
			String svar2A = "Biblotek";
			String svar2B = "biblotek";
	    	
	    	System.out.println("Ok " + name + " och" + secondPlayerName + " Skulle ni vilja sj�lva ange ordet som den andra ska gissa p� eller v�lja bland en biblotek? (Sj�lv/Biblotek) " );
	    	
	    	Scanner input = new Scanner(System.in);
		    String svar = input.nextLine();
		    
		    if (svar==svar1B || svar==svar1A ) {
		    	boolean selfDefining = false;
		    	defineTheWord(name,true,secondPlayerName,true,false);
		    	
		    }
		    
		    if (svar==svar2B || svar==svar2A ) {
		    	boolean selfDefining = true;
		    }
		    
	    }
	    	
		    
		    public static void defineTheWord(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining) {
		    	String svar1A = name;
		    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
		    	String svar2A = secondPlayerName;
		    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
		    	
		    	System.out.println("Ok " + name + " och" + secondPlayerName + "Ni valde att sj�lva definera ord!" );
		    	System.out.println("Nu ska ni best�mma vem ska d� definera ord f�r den andra! Jag kommer ge er nu 20 sekunder att best�ma vem det ska vara, k�r ig�ng!" );
		    	System.out.println("Timern b�rjar.... NU" );

		    	try {
		    	TimeUnit.SECONDS.sleep(20);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("n�got gick fel");
		    	}
		    	
		    	System.out.println("Ok! " + name + " och" + secondPlayerName + " Vem kommer definera orden? ( " + name + " / " + secondPlayerName + " ) ");
		    	Scanner input = new Scanner(System.in);
			    String svar = input.nextLine();
			    
			    
			    if(svar == svar1A || svar == svar1B ) {
			    	System.out.println("Ok! " + name + " Du f�r �ran att v�lja ordet som " + secondPlayerName + " Ska gissa p�!" );
			    	System.out.println("Jag kommer ge dig " + name + " 30 sekunder f�r att komma p� ett ord och f�r att " + secondPlayerName + " ska kolla bort!");
			    	System.out.println("timern b�rjar.... NU");
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + name + "har hittat p� ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha n�gra mellanrum mellan ord! Om du vill k�ra med meningar f�r du starta om programet och v�lja meningar ist�llet f�r ord");
			    	}
			    	
			    	else {
			    		String correctWord = svar2;
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord);
			    		
			    	}

			    
			    	
			    }
			    
			    
			    
		    	}
			    
	
		    	
		    
		    
	    	
			

		
		    public static void preMainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord) {
	    		
	    	}
	
	
	
	
	
	
	

	
	
	
}
