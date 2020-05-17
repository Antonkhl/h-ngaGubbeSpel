package h�ngaGubbeSpel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class H�ngaGubbeSpel {
 

public static void main(String[] args) {
	instruktionsNamn("namn");
	//Anropar den f�rsta metoden som ska v�gleda genom hela programet
	
}


public static void instruktionsNamn(String namn) {
	System.out.println("Hej och v�lkomna till det B�STA h�nga gubbe spel, vi kommer verkligen testa dina kunskaper n�r det g�ller meningar och ord.");
	System.out.println("Jag kommer nu fram�ver i programet fr�ga dig/er n�gra fr�gor f�r att forma denna h�nge gubbespel p� det s�ttet ni vill, och som passar er. Och sedan innan vi b�rjar ska jag f�rklara reglerna beroende p� dom val ni har valt. ");
	System.out.println("P� v�gen kommer jag ochs� ber�tta relevans till allt jag fr�gar er");
	System.out.println("Men innan vi b�rjar med all detta, var heter du?");
	//V�lkomnings meddelande och n�gra instruktioner till hur programet ska vara fram �ver. Sedan fr�gar programet om namn som skall senare anv�ndas �ver hela klassen.
	
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	
	System.out.println("Hej " + name + "! Hoppas att du kommer gilla min program");
	
	twoOnePlayers(name, false);
	//Namnet anges och sedan g�r det vidare till n�sta metod, som ska definera om det ska vara en eller tv� spelare l�ge.
}

public static void twoOnePlayers(String name, boolean oneOrTwoPlayers) {
	String svar1A = "Two";
	String svar1B = "two";
	String svar2A = "En";
	String svar2B = "en";
	//Jag innan metoden ens b�rjar g�r n�gra strings som ska d� vara vad spelarna ska svara med. I b�de liten bokstav men ochs� stor bokstav 
	//Detta g�r jag f�r att det inte ska spela roll om man skriver in en stor bokstav eller liten f�r det �r samma svar.
	
	System.out.println("Ok " + name + " Skulle du vilja k�ra i tv�spelarl�ge eller enspelarel�ge? (En/Two)");
	Scanner input = new Scanner(System.in);
	String svar = input.nextLine();
	
	if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		oneOrTwoPlayers = true; //Orsak att jag d� sparar de i booleans �r f�r att jag senare i metoder som preMainGame ska kunna l�tt 
        //definera alla inst�lningar som spelarna har definerad och sedan basera mainGame p� det. 
	    secondPlayerName(name,true);
	    //H�r anv�nder jag mig av contentEquals vilket �r samma som vad jag anv�nde mig i talspelet. Vad if-satsen g�r �r att den f�rst kollar
	    //om svar �r samma som svar1A, om den inte �r det s� g�r den vidare till svar1B och om inga �r santa g�r den till n�sta if-satsen och kollar om det st�mmer
	}
	
	if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		oneOrTwoPlayers = false;
		sentencesOrWords(name,false);

	}
}
	
	public static void secondPlayerName(String name, boolean oneOrTwoPlayers) {
		System.out.println("Ok " + name + " Nu skulle jag ochs� vilja ha namnet p� andra personen av samma sk�l!");
		
		Scanner input = new Scanner(System.in);
		String secondPlayerName = input.nextLine();
		
		System.out.println("Hej " + secondPlayerName + "! Hoppas du och " + name + " har det kul!");
		//H�r helt enkelt fr�gar jag efter namnet p� andra personen om det �r d� tv�spelarl�ge. Detta g�r jag s� att senare i spelet
		//programet ska kunna kommunicera med b�de spelarna beroende p� omst�ndigheterna. Men ochs� senare n�r spelarena ska definera vem av dom som ska gissa/definera (om de d� v�ljer det)
		
		twoPlayerSentencesOrWords(name, true, secondPlayerName);
		
	}
	
	
	
	public static void twoPlayerSentencesOrWords(String name, boolean oneOrTwoPlayers, String secondPlayerName) {
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		//Jag g�r samma sak som i twoOnePlayers
		
		System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja gissa p� ord eller meningar? (Ord/Mening)" );
		
		Scanner input = new Scanner(System.in);
	    String svar = input.nextLine();
	    
	    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
	    	boolean sentencesOrWords = true;
	    	selfDefiningWords(name,true,secondPlayerName,true);
	    	
	    }
	    
	    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
	    	boolean sentencesOrWords = false;
	    	//H�r finns inte n�gon metodanropning f�r att jag inte hade tid med att g�ra en s�dan metod tack vare att jag var fokuserad p� andra aspekter av projektet
	    }
	    
	 
	    
	}
	
	
	public static void sentencesOrWords(String name, boolean oneOrTwoPlayers) {
		//Den h�r metoden �r i princip samma sak som twoPlayerSentencesOrWords, enda skillnaden h�r �r att det �r f�r enspelarel�ge och inte tv�spelarl�ge 
		
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		
		System.out.println("Ok " + name + " Skulle du vilja gissa p� ord eller meningar?");
      
		Scanner input = new Scanner(System.in);
		String svar = input.nextLine();
		
			   if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	boolean sentencesOrWords = true;
			    	theDegreesOfDifficulty(name,true,false,"nothing");
			    	
			    }
			   
			   if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	boolean sentencesOrWords = false;
			    	
			    }
		

	}
	
	
	public static void theDegreesOfDifficulty(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName) {
		int degreeOfDifficulty = 0;
		//Jag skapar sj�lva degreeOfDificulty i starten s� att jag kan sen anv�nda den genom hela metoden utan att beh�va definera det i if-satserna
		//Detta �r ganska roligt med tanke om hur mina metoder ser senare i koden, men oh well 
		
		if (oneOrTwoPlayers = false) { //Detta �r ett exempel p� vad jag pratade om tidigare, att det blir mycket mer l�ttare att definera inst�llningar som spelaren har angett och basera spelet p� det. 
			
		
		if (sentencesOrWords = true) { //Om det �r enspelarel�ge & det �r ord som hen ska gissa p�. Jag ville orginelt ha det som if(oneOrTwoPlayers = (condition) && sentencesOrWords = (condition)), men jag ins�g det skulle vara aldeles f�r f�rvirande 
			//f�r pers som skulle l�sa min kod.
			System.out.println("Ok " + name + " p� vilket sv�righets grad skulle du vilja gissa ord p�?");
			System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
			System.out.println("Efter att du har valt en, kommer ett av orden slumpas fram. Vilket kommer d� bli det ordet du ska gissa p�");
			System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
			//Instruktioner till hur programet ska fungera fram�ver
			
			while(degreeOfDifficulty < 1 || degreeOfDifficulty > 3 ) { //Medans degreeOfDificulty �r mindre �n 1 eller st�rre �n 3 ska koden g�lla
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0 > degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
					//Om inputen �r st�rre �n 3 eller minde �n 0 ska d� detta medelande komma upp och while loopen ska forts�tta
				}
				else {
					System.out.println("Ok!"); //Annars ska programet forts�tta
					ifRandomized(name,true,degreeOfDifficulty,false,"name"); //"name" finns d�r s� att det ska g� att anropa, f�r att ifRandomized har ochs� string secondPlayerName �ven om det �r enspelarel�ge
				}
				
				
			}
			
		}
		
		if (sentencesOrWords = false) { //Om det �r enspelarel�ge och man ska gissa p� meningar. 
			System.out.println("Ok " + name + " p� vilket sv�righets grad skulle du vilja gissa meningar p�?");
			System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
			System.out.println("Efter att du har valt en, kommer ett av meingar slumpas fram. Vilket kommer d� bli det ordet du ska gissa p�");
			System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
			//instruktioner men �ndrat lite till "mening" ist�llet
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
				}
				else {
					System.out.println("Ok!");
					ifRandomized(name,false,degreeOfDifficulty,false,"name");
				}
				//samma system som jag anv�nde f�rut
				
				
			}
		}
		}
		
		if (oneOrTwoPlayers = true) { //om det �r tv�spelarel�ge
			
			if (sentencesOrWords = true) { // om det �r tv�spelarel�ge och det �r ord
				System.out.println("Ok " + name + " och " + secondPlayerName + "P� vilken sv�righetsgrad skulle ni vilja gissa p�? " );
				System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
				System.out.println("Efter att du har valt en, kommer ni v�lja om ni vill sj�lva v�lja ett ord eller slumpa ett ord fram. Vilket kommer d� bli det ordet ni/en av er ska gissa p�");
				System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
				//instruktioner
				
				while(degreeOfDifficulty >= 1 && degreeOfDifficulty <= 3 ) {
					Scanner input = new Scanner(System.in);
					degreeOfDifficulty = input.nextInt();
					
					if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
						System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
					}
					else {
						System.out.println("Ok!");
						randomizedOrNot(name,true,true,secondPlayerName,degreeOfDifficulty);
					}
					
					//samma system som jag anv�nde p� dom andra ifsatserna
					
					
				}
				
			}
			
			if (sentencesOrWords = false) { // om det �r tv�spelarel�ge och det ska gissas p� meningar
				System.out.println("Ok " + name + " och " + secondPlayerName + "P� vilken sv�righetsgrad skulle ni vilja gissa p�? " );
				System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
				System.out.println("Efter att du har valt en, kommer ni v�lja om ni vill sj�lva v�lja ett mening eller slumpa ett mening fram. Vilket kommer d� bli det meniget ni/en av er ska gissa p�");
				System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
				//instruktioner
				
				while(degreeOfDifficulty >= 1 && degreeOfDifficulty <= 3 ) {
					Scanner input = new Scanner(System.in);
					degreeOfDifficulty = input.nextInt();
					
					if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
						System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
					}
					else {
						System.out.println("Ok!");
						randomizedOrNot(name,false,true,secondPlayerName,degreeOfDifficulty);
					}
					//samma system som jag anv�nda p� dom andra ifsatserna
					
					
				}
			}
			
	
		}
		
	
		
	}
	
	public static void randomizedOrNot(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty) { //Anledning till varf�r jag har s� mycket parametrar med mig speciellt n�r det g�ller senare i koden �r tack vare att jag ville att 
		// alla inst�lningar ska sparas och visas i feedback, dessutom kommer ochs� dessa inst�lningar anv�ndas f�r att best�mma var spelet ska b�rja om senare vid slutet.
		String svar1A = "slumpa";
		String svar1B = "Slumpa";
		String svar2A = "v�lja";
		String svar2B = "V�lja";
		//H�r g�r jag exakt samma sak som jag gjorde f�rut, enda skillnad �r att det �r 
		
		
		if (sentencesOrWords = true) { //Orsak till varf�r jag har sentecnesOrWords boolean ifsatesner �r f�r att jag vill att instruktioner ska vara olika beronnde p� om
			// man v�ljer ord eller meningar. Enda skilnaden mellan dessa tv� ifsatser �r att en s�ger "ord" i instruktioner och den andra s�ger "meningar". 
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja sj�lva v�lja ett ord fr�n bibloteket som en av er ska gissa p�");
			System.out.println("Eller, skulle ni vilja slumpa fram ett ord? (slumpa/v�lja)");
			
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok!");
				ifRandomized(name,true,degreeOfDifficulty,true,secondPlayerName);
				//samma system som innan, h�r finns ochs� en annan "crossroad" som g�r antigen till ifRandomized eller ifNotRandomized
			
			}
			
			if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
				System.out.println("Ok!");
				ifNotRandomized(name,true,true,secondPlayerName,degreeOfDifficulty,"word");
				//H�r g�r det till en metod d�r man kan ange vilket ord den andra ska gissa p�
			}
			
			
		}
		
		if (sentencesOrWords = false) { //Om man ska gissa p� meningar, h�r kan vi ser mer �ndrigar i texten ochs�
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja sj�lva v�lja ett mening fr�n bibloteket som en av er ska gissa p�");
			System.out.println("Eller, skulle ni vilja slumpa fram ett mening?");
			
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok!");
				ifRandomized(name,false,degreeOfDifficulty,true,secondPlayerName);
			
			}
			
			if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
				System.out.println("Ok!");
				ifNotRandomized(name,false,true,secondPlayerName,degreeOfDifficulty,"word");
				//Samma system som �van
			}
		}
		
		
	}
	
	
	public static void ifNotRandomized(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty, String correctWord) {
		String svar1A = name;
    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
    	String svar2A = secondPlayerName;
    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
    	//H�r �r det exakt samma men lite �ndrigar, h�r vill jag ju ha svar i form av namn p� pers, s� jag s�tter svar1a-svar2b till dessa personerns namn
    	// toUpperCase har jag med d� s� att det inte ska spela roll om man svarar i storbokstav form eller litenbokstav form 
    	//Men jag inser nu att det kommer inte riktigt fungera, f�r att vad om en av spelarna anger namnet med stor bokstav i b�rjan av spelet?
    	//D� skulle programet inte fungera, skule ha haft det i �tanke!
		
		
		if (sentencesOrWords = true) { //Om spelarna ska v�lja fr�n en lista av ord,
			System.out.println("Ok, " + name + " och " + secondPlayerName + " s� ni valde att sj�lva v�lja ett ord fr�n ordlistan i sv�righets graden " + degreeOfDifficulty);
			System.out.println("Nu skulle jag vilja att ni v�ljer en som ska gissa, och en som ska v�lja ett ord som den andra ska gissa p�");
			System.out.println("Jag ger er 30 sekunder att v�lja, sedan f�r ni inputa era svar!");
			System.out.println("timern k�r ig�ng..... NU!");
			//Instruktioner
			
			try {
		    	TimeUnit.SECONDS.sleep(30); //H�r skapar jag en delay p� 30 sekunde rs� att spelarna ska best�mma vem det �r som ska v�lja och vem som ska gissa

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("n�got gick fel"); //Om av n�gon orsak delayen inte fungerar, s� kommer denna medelande
		    	}
			
			System.out.println("Ok! S� vem ska gissa p� orden? ( " + name + " / " + secondPlayerName + " ) ");
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			//H�r ska spelarna skriva in deras namn som dom angett i b�rjan av spelet, namnen d� och inte "name" eller "secondPlayernName"
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) { // Samma system som innan
				System.out.println("Ok! Innan jag vissar alla dinna val kommer jag ge " + secondPlayerName + " 20 sekunder att kolla bort eller n�got, s� " + secondPlayerName + " kan ej fuska!");
				System.out.println("Timern b�rjar........ NU");
				try {
			    	TimeUnit.SECONDS.sleep(20);

			    	}
			    	
			    	catch(Exception e) {
			    		System.out.println("n�got gick fel");
			    	}
				//H�r l�gger jag samma delay s� att att en av spelarna har tid att kolla bort innan jag ger en lista p� alla ord till den andra spelaren
				
				System.out.println("Nu antar jag att " + secondPlayerName + " �r borta");
				
				//Nu beroende p� vad man svarade p� degreeOfDifficulty ska olika ord komma upp, 
				if (degreeOfDifficulty == 1) {
					boolean wordChossen = false; //H�r skapar jag en ny boolean som ska bara vara aktiv f�r dessa ifsatser. den �r h�r s� att while looperna ska kunna fungera,
                  //ochs� f�r felhantering om man skrev n�got som �r mer �n 10 eller mindre �n 1
					ArrayList<String> ordNiv�1 = new ArrayList<>(); //skapar en ny lista av l�tta ord som jag hittade p� n�tet
					ordNiv�1.add("1. frankrike");
					ordNiv�1.add("2. g�teborg");
					ordNiv�1.add("3. juni");
					ordNiv�1.add("4. duva");
					ordNiv�1.add("5. tiger");
					ordNiv�1.add("6. jakarta");
					ordNiv�1.add("7. karlskoga");
					ordNiv�1.add("8. fj�ll�mmel");
					ordNiv�1.add("9. maj");
					ordNiv�1.add("10. gr�ng�lning");
					
					while(wordChossen != true) { //Det ska loopa om och om igen tills den blir true
						System.out.println("Dina val �r: ");
						System.out.println(ordNiv�1); //Jag printar ut alla ord i det ordet som vi kan se i arraylisten, 
						System.out.println("Vad tycker du " + secondPlayerName + " borde gissa p�?");
						int svar2 = input.nextInt();
						
						if (svar2>0 && svar2<=10) {
							Iterator<String> it = ordNiv�1.iterator(); //H�r skapar jag en ny iterator, som helt enkelt ska g� igenom hela listan och ta bort alla nummer, punkter och blanka spots. 
							//Men tyv�rr som man kan se hann jag aldrig s� l�ng, fast detta �r vad jag l�mmnade det p�,
							while(it.hasNext()) {
								
							}
							
							System.out.println("ordet du har valt �r " + correctWord); //Efter att iteratorn har gjort sitt jobb ska ordet displayas till spelaren, s� hen vet vad det �r s�kert
							for(int i = 0; i < 50; i++) {
				    			System.out.println(" ");
				    		} //Sedan printar consolen ut massor av tomma rutor s� att n�r den andra spelaren �r tillbaka kan hen inte fuska genom att bara kolla upp i konsolen.
							wordChossen = true; // ordet har angeets s� det blir till true.
						}
						else {
							System.out.println("Jag vill ha ett number som finns listan!, s� mellan 1 till 10! Inte mer eller mindre"); //Om spelaren anger ett number som �r f�r liten eller f�r stor kommer denna medelande poppa ut
							// och while loopen forts�tter.
						}
					}
					
					System.out.println("Ok! Nu kan du tala om f�r " + secondPlayerName + " att hen kan kolla tillbacks! Jag ger er 20 sekunder");
					try {
				    	TimeUnit.SECONDS.sleep(20);

				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
					//En annan delay s� att den andra spelaren kan komma tillbaka
				
					System.out.println("Ok! Nu har ordet valts, nu g�r vi vidare!");
					preMainGame(name,true,secondPlayerName,true,true,correctWord,true,degreeOfDifficulty);
					//g�r till n�sta metod som ska d� ber�tta alla regler f�r spelet innan det starter


				}
				
	            if (degreeOfDifficulty == 2) {
	            	//Ska g�ra samma sak som degreeOfDificulty == 1, bara att det ska vara andra ord som �r sv�rare

				}
	            
                if (degreeOfDifficulty == 3) {
                	//Ska g�ra samma sak som degreeOfDificulty == 1, bara att det ska vara andra ord som �r sv�rare
				}
				
				
			}
			
			
			
		}
		
		if (sentencesOrWords = false) {
			//Ska g�ra samma sak som setnecnesorwords = true, bara att det �r meningar och lite �ndrade kod s� att mellan rum �r till�tna
		}
		
	}
	
	
	
	
	public static void ifRandomized(String name, boolean sentencesOrWords, int degreeOfDifficulty, boolean oneOrTwoPlayers, String secondPlayerName) {
		//Metoden ska vara aktiv om spelarena vill att ett ord ska slumpa fram f�r de/hen, mycket �r samma som i ifNotRandomized men bara n�gra sm� �ndringar. 
		if(sentencesOrWords == true) { //Om de/hen ska gissa p� ord 
			//Sedan beroende p� vilken ordniv� det �r ska det g� till olika if-satser som ska ge olika ord beroende p� det
			if (degreeOfDifficulty == 1) {
				ArrayList<String> ordNiv�1 = new ArrayList<>();
				
				ordNiv�1.add("frankrike");
				ordNiv�1.add("g�teborg");
				ordNiv�1.add("juni");
				ordNiv�1.add("duva");
				ordNiv�1.add("tiger");
				ordNiv�1.add("jakarta");
				ordNiv�1.add("karlskoga");
				ordNiv�1.add("fj�ll�mmel");
				ordNiv�1.add("maj");
				ordNiv�1.add("gr�ng�lning");
				Collections.shuffle(ordNiv�1);
				//H�r anv�nder jag mig av collections.shuffle f�r att det ska �ndra ordningen i listan. s� att det blandas lite
				
				String correctWord = ordNiv�1.get(0); //Sedan tar jag bokstaven som hammnar p� toppen som det correctWord, vilket g�r samma funktion som new.random.
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
				
			}
			
            if (degreeOfDifficulty == 2) {
            	ArrayList<String> ordNiv�2 = new ArrayList<>();
           
            	ordNiv�2.add("dominica");
				ordNiv�2.add("riga");
				ordNiv�2.add("v�stervik");
				ordNiv�2.add("l�rdag");
				ordNiv�2.add("entita");
				ordNiv�2.add("hegemoni");
				ordNiv�2.add("renegat");
				ordNiv�2.add("anomali");
				ordNiv�2.add("impertinent");
				ordNiv�2.add("patgernalism");
				Collections.shuffle(ordNiv�2);
				
				String correctWord = ordNiv�2.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
            	
			}
            
            if (degreeOfDifficulty == 3) {
            	ArrayList<String> ordNiv�3 = new ArrayList<>();
                
            	ordNiv�3.add("minderv�rdighetskomplex");
				ordNiv�3.add("crackpundare");
				ordNiv�3.add("flaggst�ngsknoppsm�lare");
				ordNiv�3.add("l�rd");
				ordNiv�3.add("entita");
				ordNiv�3.add("hegemoni");
				ordNiv�3.add("renegat");
				ordNiv�3.add("anomali");
				ordNiv�3.add("impertinent");
				ordNiv�3.add("patgernalism");
				Collections.shuffle(ordNiv�3);
				
				String correctWord = ordNiv�3.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
			}
			
			
		}
		
		
        if(sentencesOrWords == false) { //H�r �r det d� om man vill gissa p� meningar,
            if (degreeOfDifficulty == 1) {
              ArrayList<String> meningNiv�1 = new ArrayList<>();
                
              meningNiv�1.add("ju fler Desto B�ttre");
              meningNiv�1.add("kan du �ppna d�rren");
              meningNiv�1.add("khalil har en katt");
              meningNiv�1.add("sara studerar i skolan");
              meningNiv�1.add("amela och Adam har tv� barn");
              meningNiv�1.add("peter har tre pojkar");
              meningNiv�1.add("titti talar i telefon med syster tove");
              meningNiv�1.add("ylva �r lycklig hon har en ny cykel");
              meningNiv�1.add("han heter billy");
              meningNiv�1.add("att skriva en adress");
				Collections.shuffle(meningNiv�1);
				
				String correctSentence = meningNiv�1.get(0);
				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
				//jag g�r exakt samma sak som innan �nda skillnaden �r d� att jag ist�llet f�r ord har meningar som slumpas
			}
			
            if (degreeOfDifficulty == 2) {
            	 ArrayList<String> meningNiv�2 = new ArrayList<>();
                 
                 meningNiv�2.add("det �r s� tomt f�r att det �r helgen innan l�ning");
                 meningNiv�2.add("det �r helt sjukt att det �r billigare att flyga");
                 meningNiv�2.add("jag m�ste skynda mig, jag har bokat en tv�ttid");
                 meningNiv�2.add("varf�r har du inte pluggat till l�kare");
                 meningNiv�2.add("de har en j�ttebra restaurang");
                 meningNiv�2.add("jag har l�st tyska i skolan, men jag kan ingenting");
                 meningNiv�2.add("S� g�ra man p� kontinenten");
                 meningNiv�2.add("Jag gillar finlandssvenska");
                 meningNiv�2.add("Vad �r egentligen det nya s�der");
                 meningNiv�2.add("Jag k�nner j�ttem�nga som har tr�ffats p� n�tet");
   				Collections.shuffle(meningNiv�2);
   				
   				String correctSentence = meningNiv�2.get(0);
   				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
			}
            
            if (degreeOfDifficulty == 3) {
            	ArrayList<String> meningNiv�3 = new ArrayList<>();
                
                meningNiv�3.add("i en v�rld d�r smala v�ger tyngst �vervikt som en medial konstruktion");
                meningNiv�3.add("nej �ver huvud taget inte En kvantitativ och kvalitativ analys av diskreta och indirekta �vers�ttningsstrategier i de sveska �vers�ttningarna av tv� minimalitiska danska romaner");
                meningNiv�3.add("�r alla inkluderade en analys av f�rslag till svenska kyrkans kyrkohandbok ur ett andraspr�ksperspektiv");
                meningNiv�3.add("svenska som andraspr�k och svenska en j�mf�rande av �mnena");
                meningNiv�3.add("prepositionsbruk hos personer med annat hemspr�k �n svenska");
                meningNiv�3.add("kl�desborste eller skohorn en spr�klig och inneh�llslig j�mf�relse av jan guillous");
                meningNiv�3.add("utl�ndska l�kares ordf�rst�lsen");
                meningNiv�3.add("en studie av best�mmelsens inverkan p� offentlighetsprincipen");
                meningNiv�3.add("i det f�rg�ngna b�r ouppl�sligt m�dan");
                meningNiv�3.add("b�rda jag f�f�ng s�kt att lasta av");
  				Collections.shuffle(meningNiv�3);
  				
  				String correctSentence = meningNiv�3.get(0);
  				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
			}
		}
		
		
		
	}
	
	
	
	    public static void selfDefiningWords(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords ) {
	    	String svar1A = "Sj�lv";
			String svar1B = "sj�lv";
			String svar2A = "Biblotek";
			String svar2B = "biblotek";
			//Jag g�r exakt samma sak som f�rut men med olika ord 
	    	
	    	System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja sj�lva ange ordet som den andra ska gissa p� eller v�lja bland en biblotek? (Sj�lv/Biblotek) " );
	    	
	    	Scanner input = new Scanner(System.in);
		    String svar = input.nextLine();
		    
		    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    	boolean selfDefining = false;
		    	defineTheWord(name,true,secondPlayerName,true,false,true);
		    	
		    }
		    
		    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    	boolean selfDefining = true;
		    	//Har inte n�gon anropning till den andra metoden d��r man ska v�lja, f�r jag inte hann det
		    }
		    
	    }
	    
	    
	    
	    	
		    
		    public static void defineTheWord(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing) {
		    	String svar1A = name;
		    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
		    	String svar2A = secondPlayerName;
		    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
		    	//g�r exakt samma som jag gjorde i ifNotRandomized metoden, jag inser nu att det kanske inte fungerar ochs�
		    	
		    	System.out.println("Ok " + name + " och " + secondPlayerName + " Ni valde att sj�lva definera ord!" );
		    	System.out.println("Nu ska ni best�mma vem ska d� definera ord f�r den andra! Jag kommer ge er nu 20 sekunder att best�ma vem det ska vara, k�r ig�ng!" );
		    	System.out.println("Timern b�rjar.... NU" );

		    	try {
		    	TimeUnit.SECONDS.sleep(20);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("n�got gick fel");
		    	}
		    	//en delay f�r att spelarena ska kunna f� tid att best�mma mellan varandra vem det �r som ska gissa och vem som ska definera det f�r programet
		    	
		    	System.out.println("Ok! " + name + " och " + secondPlayerName + " Vem kommer definera orden? ( " + name + " / " + secondPlayerName + " ) ");
		    	Scanner input = new Scanner(System.in);
			    String svar = input.nextLine();
			    
			    
			    if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	playerGuessing = true; //Playerguessing �r h�r f�r att h�lla koll vem det �r som ska definera orden, och ochs� vem som ska gissa
			    	System.out.println("Ok! " + name + " Du f�r �ran att v�lja ordet som " + secondPlayerName + " Ska gissa p�!" );
			    	System.out.println("Jag kommer ge dig " + name + " 30 sekunder f�r att komma p� ett ord och f�r att " + secondPlayerName + " ska kolla bort!");
			    	System.out.println("timern b�rjar.... NU");
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
			    	//en annan delay s� att spelarena ska kunna kolla bort och den andra ska kunna definera
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + name + " har hittat p� ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha n�gra mellanrum mellan ord! Om du vill k�ra med meningar f�r du starta om programet och v�lja meningar ist�llet f�r ord");
			    	}
			    	//H�r �r det en annan felhanterings metod, som om spelaren har inkluderad n�gra mellanrum mellan ord ska det d� printa ut denna medelande, jag inser nu att detta kommer inte
			    	//riktigt fungera p� det s�ttet jag t�nkte mig f�r att det inte finns n�gon while loop. jag borde ha inkluderad det.
			    	
			    	else {
			    		//annars om ordet har inga mellanrum och allt �r helt enkelt bra g�r den hit
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" "); //spammar massor av mellanrum s� att den andra spelaren inte ska fuska
			    		}
			    		System.out.println("Ok! Nu kan du tala om f�r " + secondPlayerName + " att han kan kola hit igen");
			    		String correctWord = svar2; //anger ordet till  vad spelaren har skrivit in
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,true,0);
			    		
			    	}
			    	
			   
			    }
			    
			    if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	playerGuessing = false; //False �r d� om secondPlayerName ska gissa.
			    	System.out.println("Ok! " + secondPlayerName + " Du f�r �ran att v�lja ordet som " + name + " Ska gissa p�!" );
			    	System.out.println("Jag kommer ge dig " + secondPlayerName + " 30 sekunder f�r att komma p� ett ord och f�r att " + name + " ska kolla bort!");
			    	System.out.println("timern b�rjar.... NU"); 
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
			    	
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + secondPlayerName + " har hittat p� ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha n�gra mellanrum mellan ord! Om du vill k�ra med meningar f�r du starta om programet och v�lja meningar ist�llet f�r ord");
			    	}
			    	
			    	else { 
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" ");
			    		}
				    	System.out.println("Ok! Nu kan du tala om f�r " + name + " att han kan kola hit igen");
			    		String correctWord = svar2;
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,false,0);
			    		
			    	}
			    	
			    	
			    	//samma saker som den andra ifsatsen,

		    	 }
			    
			    
		    	}
			    
		
		    public static void preMainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, int degreeOfDifficulty) {
		    	//H�r �r metoden innan maingame d�, d�r allar regler ska anges
		    	if (oneOrTwoPlayers == true ) { //Om det �r d� tv�spelarel�ge
		    		
		    		if (selfDefining == true) { //Om de vill INTE sj�lv definera orden
		    			 
		    			if (sentencesOrWords == true) { //Om det �r ett ord 
		    				//hann inte men instruktioner
		    			}
                        if (sentencesOrWords == false) {//Om det �r ett mening
                        	//hann inte men instruktioner
		    			}
		    			
		    		}
		    		
		    		if (selfDefining == false) { //om man sj�lv definerar orden
		    			//H�r har jag flera olika alternativ som skulle ber�tta reglerna baserad p�  vilka inst�llningar man har vallt, hann inte med alla men i alla fall alla i selfdefining=false
		    			
		    			if (sentencesOrWords == true && playerGuessing == true) { //Om det �r d� om det �r ord och att name definerade orden.
		    				System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + secondPlayerName);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa ordet. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett ord d�, inga meningar");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    				mainGame(name,true,secondPlayerName,true,false,correctWord,true,correctWord,0,0,0,0);
		    				//anger till sj�lva spelet d�r spelet ska k�ras.
		    			}
		    			
                        if (sentencesOrWords == false && playerGuessing == true) {//Om det �r d� om det �r d� mening och att name definerade orden.
                        	System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + secondPlayerName);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa meningen. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett mening d�, inte ord");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == false && playerGuessing == false) {//Om det �r d� om det �r d� mening och att secondPlayerName
                        	System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + name);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa meningen. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett mening d�, inte ord");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == true && playerGuessing == false) {//Om det �r d� om det �r d� ord och att secondPlayerName
                        	System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + name);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa ordet. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett ord d�, inga meningar");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
		    		}
		    	}
		    	
		    	
		    	
		    	
		    	
                if (oneOrTwoPlayers == false) { //om det �r d� enspelarel�ge, vilket ska d� definera om det �r ord eller mening f�r att det �r den enda som spelar roll h�r
		    		if (sentencesOrWords == true) {
		    			
		    		}
		    		
                    if (sentencesOrWords == false) {
		    			
		    		}
		    			
		    		
		    	}
		    	
		    	
		    }
		    
		    
		    
		    
		    public static void mainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong) {
		    	ArrayList<Character> guessedPos = new ArrayList<Character>(); //Jag skapar en tom lista som jag skall senare anv�nda f�r att g�ra min progress ____ grej fungerade
		    	int guessed = 0; //skapar guessed som skall anv�ndas f�r att spara antal g�nger man har gissat
		    	guessedPos.ensureCapacity(correctWord.length()); //H�r anv�nder jag ensureCapacity f�r att s�kerst�lla att guessedPos listan jag har skapat �r lika stor som correctWord
		    	while(guessedPos.size() < correctWord.length()) {
		    	    guessedPos.add('a'); //Nu spammar jag listan med massor av "a" s� att listan �r inte tom, annars kommer det inte fungera
		    	}
		    	while(guessed < correctWord.length()) { //h�r kommer sj�lva spelet, while loopen �r f�r att n�r du gissat alla tecken i ordet ska det ta dig ur while-loopen
		    		//Och ska g� vidare till feedback metoden
		    	  System.out.println("ordet �r: ");
		    	  for(int i = 0; i < correctWord.length(); i++) {
		    	    char current = correctWord.charAt(i); //h�r f�r det tecken man har gissat p� p� indexen i, s� helt enkelt om v�r ord �r: exempel och vi gissar p� p s� kommer tecknet att justera baserad p� det
		    	    if(guessedPos.get(i) == current) {
		    	    	  System.out.print(current); //Skriver ut tecknet
		    	    	} else {
		    	    	  System.out.print("_"); //p� dom andra positioner som inte har gissats skriver den ut massor av ___ d�
		    	    	} 
		    	  }
		    	  System.out.print("\n"); //ny linje         
		    	  System.out.println("Skriv in ett bokstav");
		    	  Scanner input = new Scanner(System.in);
		    	  String c = input.nextLine(); //Skriver in sin gissning som ska senare anv�ndas i spelet
		    	  if(correctWord.contains(c)) { //om man har gissat r�tt
	                    for(int i = 0; i < correctWord.length(); i++) {
	                      if(correctWord.charAt(i) == c.charAt(0)) { //ifsatsen h�r kolla vad ordning p� denna ordet �r 
	                        guessedPos.set(i, c.charAt(0));
	                        guessed++;
	                       //H�r helt enkelt loopar det tecknet genom hela ordet f�r att se om det finns mer av det, och �kar p� guessed.
	                      
	                        if(wrong  == 1) {  
		                          System.out.print("+---+\r\n" + 
			                          		"  |   |\r\n" + 
			                          		"      |\r\n" + 
			                          		"      |\r\n" + 
			                          		"      |\r\n" + 
			                          		"      |\r\n" + 
			                          		"=========''', '''");
		                         
		                        }
	                       
	                        if(wrong == 1) { 
		                          System.out.print("+---+\r\n" + 
		                          		"  |   |\r\n" + 
		                          		"  O   |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"=========''', '''");
		                          
		                        }
	                        
	                        if(wrong == 2) { 
		                          System.out.print("+---+\r\n" + 
		                          		"  |   |\r\n" + 
		                          		"  O   |\r\n" + 
		                          		"  |   |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"=========''', ''");
		                          
		                        }
	                        if(wrong == 3) { 
		                          System.out.print("+---+\r\n" + 
		                          		"  |   |\r\n" + 
		                          		"  O   |\r\n" + 
		                          		" /|   |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"=========''', '''");
		                          
		                        }
	                        
	                        if(wrong == 4) {
	                        	System.out.println("+---+\r\n" + 
	                        			"  |   |\r\n" + 
	                        			"  O   |\r\n" + 
	                        			" /|\\  |\r\n" + 
	                        			"      |\r\n" + 
	                        			"      |\r\n" + 
	                        			"=========''', '''");
	                        
	                        }
	                        if(wrong == 5) {
	                        	System.out.println(" +---+\r\n" + 
	                        			"  |   |\r\n" + 
	                        			"  O   |\r\n" + 
	                        			" /|\\  |\r\n" + 
	                        			" /    |\r\n" + 
	                        			"      |\r\n" + 
	                        			"=========''', '''");
	                        	
	                        		                        }
	                        
	                        if(wrong == 6) {
	                        	System.out.println(" +---+\r\n" + 
	                        			"  |   |\r\n" + 
	                        			"  O   |\r\n" + 
	                        			" /|\\  |\r\n" + 
	                        			" / \\  |\r\n" + 
	                        			"      |\r\n" + 
	                        			"========='''");
	                        	System.out.println("Gubben h�ngdes :(");
	                        	 
	                        }
	                        //Sedan har jag ochs� massor av grafik som ska repsentera vad man �r, om man �r d� p� wrong == 6 ska spelet g� vidare till feedback. 
	                        //Men jag hann inte med det. 
	                      }
	                      
	                    } 
		    	  }
	                    else {
	                     System.out.println("Du svarade fel!");
	                      
	                     
	                     if(wrong == 0) {  
	                          System.out.print("+---+\r\n" + 
		                          		"  |   |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"      |\r\n" + 
		                          		"=========''', '''");
	                          
	                        }
                        
                        if(wrong == 1) { 
	                          System.out.print("+---+\r\n" + 
	                          		"  |   |\r\n" + 
	                          		"  O   |\r\n" + 
	                          		"      |\r\n" + 
	                          		"      |\r\n" + 
	                          		"      |\r\n" + 
	                          		"=========''', '''");
	                         
	                        }
          
                        
                        if(wrong == 2) { 
	                          System.out.print("+---+\r\n" + 
	                          		"  |   |\r\n" + 
	                          		"  O   |\r\n" + 
	                          		"  |   |\r\n" + 
	                          		"      |\r\n" + 
	                          		"      |\r\n" + 
	                          		"=========''', ''");
	                         
	                        }
                        if(wrong == 3) { 
	                          System.out.print("+---+\r\n" + 
	                          		"  |   |\r\n" + 
	                          		"  O   |\r\n" + 
	                          		" /|   |\r\n" + 
	                          		"      |\r\n" + 
	                          		"      |\r\n" + 
	                          		"=========''', '''");
	                        
	                        }
                        
                        if(wrong == 4) {
                        	System.out.println("+---+\r\n" + 
                        			"  |   |\r\n" + 
                        			"  O   |\r\n" + 
                        			" /|\\  |\r\n" + 
                        			"      |\r\n" + 
                        			"      |\r\n" + 
                        			"=========''', '''");
                        	
                        }
                        if(wrong == 5) {
                        	System.out.println(" +---+\r\n" + 
                        			"  |   |\r\n" + 
                        			"  O   |\r\n" + 
                        			" /|\\  |\r\n" + 
                        			" /    |\r\n" + 
                        			"      |\r\n" + 
                        			"=========''', '''");
                        	
                        }
                        
                        if(wrong == 6) {
                        	System.out.println(" +---+\r\n" + 
                        			"  |   |\r\n" + 
                        			"  O   |\r\n" + 
                        			" /|\\  |\r\n" + 
                        			" / \\  |\r\n" + 
                        			"      |\r\n" + 
                        			"========='''");
                        	System.out.println("Gubben h�ngdes :(");
                        	
                        }
                        //Samma grafik som innan, av n�gon orsak s� fungearde det inte i if satsen och jag kunde inte fixa det s� jag la det b�de i else och if satserna och det verkade att fungera
                        wrong++;
                        //�kar p� wrong, men jag har ingen system f�r att det ska g� ner f�r att jag hittade ingen bra system att om det skulle g� under 0 skulle det g� tillbaka till 0.
                        
	                    }                
		    	  
		    	}
		    }
		    
		    
		    public static void feedback(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	//Nu n�r spelet �r �ver var tanken att man ska g� till feedback, d�r ska i maingame vara en till boolean som skulle heta wonOrNot, beroened p� om van eller inte skulle det vara antigen falsk eller sant
		    	if(wonOrNot = true) { //Om man van spelet
		    		if (oneOrTwoPlayers = true) { //Om det �r tv�spelare l�ge
		    			if(selfDefining = false) { // Om en av spelarena sj�lv definerade ordet
		    				if(playerGuessing = true) { //Om det var personen i name som definerade det
		    					System.out.println("Grattis!");
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + name + " definerade f�r oss!");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Det tog dig: ");
		    					System.out.print("\n"); 
		    					int totalAwnsers = wrongAnswers+rightAnswers; //Jag ursrungligen t�nkte att guessed och wrong skulle getter rightawnser och wrogn awnsers, men av tv� orsak att jag inte anv�nde mig av dessa variabler var att f�rst det skulle vara 
		    					//st�kikgt med s�na l�nga namn och att jag helt enkelt gl�mde att anv�nda dom. Men jag ville n�r jag var klar med hela programet �ndra dom tillbaka, men tyv�rr hade jag inte tid d�.
		    					System.out.println("Totala f�rs�k: " + totalAwnsers); //h�r �r det info som kommer
		    					System.out.println("Fel svar: " + wrongAnswers);
		    					System.out.println("R�tt svar: " + rightAnswers);
		    					System.out.println("Du hade: " + triesLeft + " f�rs�k kvar");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Dina inst�lningar var:");
		    					System.out.print("\n"); 
		    					
		    					System.out.println("En/tv�-spelarsl�ge: Tv�");
		    					if(sentencesOrWords = true) { //baserad p� vilka inst�lningar man har valt ska inst�llningar ochs� visas som feedback s� man kan se dom.
		    						System.out.println("Ord/meningar: Ord ");
		    					}
		    					if(sentencesOrWords = false) {
		    						System.out.println("Ord/meningar: Meningar");
		    					}
		    					System.out.println("Definerad av: " + name);
		    					System.out.println("Gissat fram av: " + secondPlayerName);
		    					
		    					
		    					
		    					
		    					
		    				}
                            if(playerGuessing = false) { //Om det var personen i secondPlayerName som definerade det
                            	System.out.println("Grattis!");
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + secondPlayerName + " definerade f�r oss!");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Det tog dig: ");
		    					System.out.print("\n"); 
		    					int totalAwnsers = wrongAnswers+rightAnswers;
		    					System.out.println("Totala f�rs�k: " + totalAwnsers);
		    					System.out.println("Fel svar: " + wrongAnswers);
		    					System.out.println("R�tt svar: " + rightAnswers);
		    					System.out.println("Du hade: " + triesLeft + " f�rs�k kvar");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Dina inst�lningar var:");
		    					System.out.print("\n"); 
		    					
		    					System.out.println("En/tv�-spelarsl�ge: Tv�");
		    					if(sentencesOrWords = true) { //Om det �r ord som man angett
		    						System.out.println("Ord/meningar: Ord ");
		    					}
		    					if(sentencesOrWords = false) { //Om det �r meningar som man angett
		    						System.out.println("Ord/meningar: Meningar");
		    					}
		    					System.out.println("Definerad av: " + secondPlayerName);
		    					System.out.println("Gissat fram av: " + name);
		    					//samma kod som som f�rrut
		    				}
		    			}
		    			if(selfDefining = true) { //om spelarena slumpade eller valde ett ord
		    				//m�ste ha fler ifsatser men hann inte med det och koden ochs�
		    			}
		    		}
		    		if (oneOrTwoPlayers = false) { //om det �r enspelare l�ge
		    			//m�ste ha fler ifsatser men hann inte med det och koden ochs�
		    		}
		    		
		    	}
		    	
                if(wonOrNot = false) { //om man inte vann
		    		//blev inte klar med koden f�r den, men mycket samma som true bara olika outputs av inst�llningar
		    	}
		    	
		    	
		    	
		    }
		    
		    public static void restartOrNot(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing, int degreeOfDifficulty) {
		    	String svar1A = "Igen";
		        String svar1B = "igen";
		        String svar2A = "avsluta";
		        String svar2B = "Avsluta";
		    	
		    	System.out.println("Nu, �r spelet �ver, men vill ni avsluta spelet eller k�ra igen? (igen/avsluta)");
		    	//Nu ska man v�lja om man vill k�ra igen eller avsluta spelet, anv�nder samma metod som jag gjorde innan
		    	
		    	Scanner input = new Scanner(System.in);
		    	String svar = input.nextLine();
		    	
		    	if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    		if (oneOrTwoPlayers = true) {
		    			if(sentencesOrWords = true ) {
		    				if(selfDefining = false) //h�r skulle det vara fler ifsatser som skulle best�mma vad metodanropningen till restartButAtWhatPoint ska vara, men hann aldrig s� l�ngt
		    				System.out.println("Ok!");
		    			}
		    			
		    		}
		    		
		    		if (oneOrTwoPlayers = false) {
		    			System.out.println("Ok!"); //samma saker som �van
		    		}
		    		
		    	}
		    	
		    	if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    		System.out.println("Ok! Hejd�!");
		    		 System.exit(0); //Om spelarna/spelare vill avsluta programet avslutas spelet h�r d�.
		    	}
		    	
		    }
		    
		    public static void restartButAtWhatPoint(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	System.out.println("Var vill du/ni b�rja om n�gonstans?");
		    	//h�r ska det vara olika val beroende p� vilka inst�llningar man har angett, beroende p� dessa svar ska spelet startas om vid en punkt d�r man vill.
		    	
		    }
		 
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
}
		    
            
	    		
		    	
	



	
	
	
	

	
	
	
