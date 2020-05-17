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
	//
	
	System.out.println("Ok " + name + " Skulle du vilja k�ra i tv�spelarl�ge eller enspelarel�ge? (En/Two)");
	Scanner input = new Scanner(System.in);
	String svar = input.nextLine();
	
	if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		oneOrTwoPlayers = true;
	    secondPlayerName(name,true);
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
		
		twoPlayerSentencesOrWords(name, true, secondPlayerName);
		
	}
	
	
	
	public static void twoPlayerSentencesOrWords(String name, boolean oneOrTwoPlayers, String secondPlayerName) {
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		
		System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja gissa p� ord eller meningar? (Ord/Mening)" );
		
		Scanner input = new Scanner(System.in);
	    String svar = input.nextLine();
	    
	    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
	    	boolean sentencesOrWords = true;
	    	selfDefiningWords(name,true,secondPlayerName,true);
	    	
	    }
	    
	    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
	    	boolean sentencesOrWords = false;
	    }
	    
	 
	    
	}
	
	
	public static void sentencesOrWords(String name, boolean oneOrTwoPlayers) {
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
		
		if (oneOrTwoPlayers = false) {
			
		
		if (sentencesOrWords = true) {
			System.out.println("Ok " + name + " p� vilket sv�righets grad skulle du vilja gissa ord p�?");
			System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
			System.out.println("Efter att du har valt en, kommer ett av orden slumpas fram. Vilket kommer d� bli det ordet du ska gissa p�");
			System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0 > degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
				}
				else {
					System.out.println("Ok!");
					ifRandomized(name,true,degreeOfDifficulty,false);
				}
				
				
			}
			
		}
		
		if (sentencesOrWords = false) {
			System.out.println("Ok " + name + " p� vilket sv�righets grad skulle du vilja gissa meningar p�?");
			System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
			System.out.println("Efter att du har valt en, kommer ett av meingar slumpas fram. Vilket kommer d� bli det ordet du ska gissa p�");
			System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer fr�n 1 till 3, inte mer eller mindre!");
				}
				else {
					System.out.println("Ok!");
					ifRandomized(name,false,degreeOfDifficulty,false,true);
				}
				
				
			}
		}
		}
		
		if (oneOrTwoPlayers = true) {
			
			if (sentencesOrWords = true) {
				System.out.println("Ok " + name + " och " + secondPlayerName + "P� vilken sv�righetsgrad skulle ni vilja gissa p�? " );
				System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
				System.out.println("Efter att du har valt en, kommer ni v�lja om ni vill sj�lva v�lja ett ord eller slumpa ett ord fram. Vilket kommer d� bli det ordet ni/en av er ska gissa p�");
				System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
				
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
					
					
				}
				
			}
			
			if (sentencesOrWords = false) {
				System.out.println("Ok " + name + " och " + secondPlayerName + "P� vilken sv�righetsgrad skulle ni vilja gissa p�? " );
				System.out.println("Det kommer finnas 3 olika sv�righetsgrader, 1 = L�tt, 2 = Medium 3 = sv�rt");
				System.out.println("Efter att du har valt en, kommer ni v�lja om ni vill sj�lva v�lja ett mening eller slumpa ett mening fram. Vilket kommer d� bli det meniget ni/en av er ska gissa p�");
				System.out.println("Med det sagt, vilket sv�righetsgrad skulle du vilja gissa p�? (1/2/3)");
				
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
					
					
				}
			}
			
	
		}
		
	
		
	}
	
	public static void randomizedOrNot(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty) {
		String svar1A = "slumpa";
		String svar1B = "Slumpa";
		String svar2A = "v�lja";
		String svar2B = "V�lja";
		
		
		if (sentencesOrWords = true) {
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja sj�lva v�lja ett ord fr�n bibloteket som en av er ska gissa p�");
			System.out.println("Eller, skulle ni vilja slumpa fram ett ord? (slumpa/v�lja)");
			
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok!");
				ifRandomized(name,true,degreeOfDifficulty,true,secondPlayerName);
			
			}
			
			if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
				System.out.println("Ok!");
				ifNotRandomized(name,true,true,secondPlayerName,degreeOfDifficulty);
			}
			
			
		}
		
		if (sentencesOrWords = false) {
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
			}
		}
		
		
	}
	
	
	public static void ifNotRandomized(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty, String correctWord) {
		String svar1A = name;
    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
    	String svar2A = secondPlayerName;
    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
		
		
		if (sentencesOrWords = true) {
			System.out.println("Ok, " + name + " och " + secondPlayerName + " s� ni valde att sj�lva v�lja ett ord fr�n ordlistan i sv�righets graden " + degreeOfDifficulty);
			System.out.println("Nu skulle jag vilja att ni v�ljer en som ska gissa, och en som ska v�lja ett ord som den andra ska gissa p�");
			System.out.println("Jag ger er 30 sekunder att v�lja, sedan f�r ni inputa era svar!");
			System.out.println("timern k�r ig�ng..... NU!");
			
			try {
		    	TimeUnit.SECONDS.sleep(30);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("n�got gick fel");
		    	}
			
			System.out.println("Ok! S� vem ska gissa p� orden? ( " + name + " / " + secondPlayerName + " ) ");
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok! Innan jag vissar alla dinna val kommer jag ge " + secondPlayerName + " 20 sekunder att kolla bort eller n�got, s� " + secondPlayerName + " kan ej fuska!");
				System.out.println("Timern b�rjar........ NU");
				try {
			    	TimeUnit.SECONDS.sleep(20);

			    	}
			    	
			    	catch(Exception e) {
			    		System.out.println("n�got gick fel");
			    	}
				
				System.out.println("Nu antar jag att " + secondPlayerName + " �r borta");
				
				if (degreeOfDifficulty == 1) {
					boolean wordChossen = false;
					ArrayList<String> ordNiv�1 = new ArrayList<>();
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
					
					while(wordChossen != true) {
						System.out.println("Dina val �r: ");
						System.out.println(ordNiv�1);
						System.out.println("Vad tycker du " + secondPlayerName + " borde gissa p�?");
						int svar2 = input.nextInt();
						
						if (svar2>0 && svar2<=10) {
							Iterator<String> it = ordNiv�1.iterator();
							while(it.hasNext()) {
								
							}
							
							correctWord = ordNiv�1.get(svar2);
							
							System.out.println("ordet du har valt �r " + correctWord);
							for(int i = 0; i < 50; i++) {
				    			System.out.println(" ");
				    		}
							wordChossen = true;
						}
						else {
							System.out.println("Jag vill ha ett number som finns listan!, s� mellan 1 till 10! Inte mer eller mindre");
						}
					}
					
					System.out.println("Ok! Nu kan du tala om f�r " + secondPlayerName + " att hen kan kolla tillbacks! Jag ger er 20 sekunder");
					try {
				    	TimeUnit.SECONDS.sleep(20);

				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
				
					System.out.println("Ok! Nu har ordet valts, nu g�r vi vidare!");
					preMainGame(name,true,secondPlayerName,true,true,correctWord,true,degreeOfDifficulty);


				}
				
	            if (degreeOfDifficulty == 2) {
	            	

				}
	            
                if (degreeOfDifficulty == 3) {
					
				}
				
				
			}
			
			
			
		}
		
		if (sentencesOrWords = false) {
			
		}
		
	}
	
	
	
	
	public static void ifRandomized(String name, boolean sentencesOrWords, int degreeOfDifficulty, boolean oneOrTwoPlayers, String secondPlayerName) {
		
		if(sentencesOrWords == true) {
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
				
				String correctWord = ordNiv�1.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false);
				
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
				preMainGame(name,false,"nothing",true,false,correctWord,false);
            	
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
				preMainGame(name,false,"nothing",true,false,correctWord,false);
			}
			
			
		}
		
		
        if(sentencesOrWords == false) {
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
				preMainGame(name,false,"nothing",false,false,correctSentence,false);
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
   				preMainGame(name,false,"nothing",false,false,correctSentence,false);
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
  				preMainGame(name,false,"nothing",false,false,correctSentence,false);
			}
		}
		
		
		
	}
	
	
	
	    public static void selfDefiningWords(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords ) {
	    	String svar1A = "Sj�lv";
			String svar1B = "sj�lv";
			String svar2A = "Biblotek";
			String svar2B = "biblotek";
	    	
	    	System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja sj�lva ange ordet som den andra ska gissa p� eller v�lja bland en biblotek? (Sj�lv/Biblotek) " );
	    	
	    	Scanner input = new Scanner(System.in);
		    String svar = input.nextLine();
		    
		    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    	boolean selfDefining = false;
		    	defineTheWord(name,true,secondPlayerName,true,false,true);
		    	
		    }
		    
		    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    	boolean selfDefining = true;
		    }
		    
	    }
	    
	    
	    
	    	
		    
		    public static void defineTheWord(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing) {
		    	String svar1A = name;
		    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
		    	String svar2A = secondPlayerName;
		    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
		    	
		    	System.out.println("Ok " + name + " och " + secondPlayerName + " Ni valde att sj�lva definera ord!" );
		    	System.out.println("Nu ska ni best�mma vem ska d� definera ord f�r den andra! Jag kommer ge er nu 20 sekunder att best�ma vem det ska vara, k�r ig�ng!" );
		    	System.out.println("Timern b�rjar.... NU" );

		    	try {
		    	TimeUnit.SECONDS.sleep(20);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("n�got gick fel");
		    	}
		    	
		    	System.out.println("Ok! " + name + " och " + secondPlayerName + " Vem kommer definera orden? ( " + name + " / " + secondPlayerName + " ) ");
		    	Scanner input = new Scanner(System.in);
			    String svar = input.nextLine();
			    
			    
			    if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	playerGuessing = true;
			    	System.out.println("Ok! " + name + " Du f�r �ran att v�lja ordet som " + secondPlayerName + " Ska gissa p�!" );
			    	System.out.println("Jag kommer ge dig " + name + " 30 sekunder f�r att komma p� ett ord och f�r att " + secondPlayerName + " ska kolla bort!");
			    	System.out.println("timern b�rjar.... NU");
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("n�got gick fel");
				    	}
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + name + " har hittat p� ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha n�gra mellanrum mellan ord! Om du vill k�ra med meningar f�r du starta om programet och v�lja meningar ist�llet f�r ord");
			    	}
			    	
			    	else {
			    		
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" ");
			    		}
			    		System.out.println("Ok! Nu kan du tala om f�r " + secondPlayerName + " att han kan kola hit igen");
			    		String correctWord = svar2;
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,true);
			    		
			    	}
			    	
			   
			    }
			    
			    if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	playerGuessing = false;
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
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,false);
			    		
			    	}
			    	

		    	 }
			    
			    
		    	}
			    
		
		    public static void preMainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, int degreeOfDifficulty) {
		    	
		    	if (oneOrTwoPlayers == true ) {
		    		
		    		if (selfDefining == true) {
		    			 
		    			if (sentencesOrWords == true) {
		    				
		    			}
                        if (sentencesOrWords == false) {
		    				
		    			}
		    			
		    		}
		    		
		    		if (selfDefining == false) {
		    			
		    			if (sentencesOrWords == true && playerGuessing == true) {
		    				System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + secondPlayerName);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa ordet. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett ord d�, inga meningar");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    				mainGame1(name,true,secondPlayerName,true,false,correctWord,true,correctWord,0,0,0,0);
		    			}
		    			
                        if (sentencesOrWords == false && playerGuessing == true) {
                        	System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + secondPlayerName);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa meningen. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett mening d�, inte ord");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == false && playerGuessing == false) {
                        	System.out.println("Nu har du d� angett alla inst�llningar f�r spelet! Nu ska jag ber�tta hur spelet kommer k�ra till f�r " + name);
		    				System.out.println("du ska d� gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett h�ngd gubben komma upp p� sk�rmen");
		    				System.out.println("Om du skriver in ett r�tt bokstav kommer rutan med ord som fattas b�rja fylla in sig och om du har redan gjort fel kommer bilden g� tillbaks ett steg");
		    				System.out.println("Ditt m�l �r att gissa meningen. Innan gubben h�ngs.");
		    				System.out.println("Du ska gissa p� ett mening d�, inte ord");
		    				System.out.println("Med det s�ger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == true && playerGuessing == false) {
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
		    	
		    	
		    	
		    	
		    	
                if (oneOrTwoPlayers == false) {
		    		if (sentencesOrWords == true) {
		    			
		    		}
		    		
                    if (sentencesOrWords == false) {
		    			
		    		}
		    			
		    		
		    	}
		    	
		    	
		    }
		    
		    
		    
		    
		    public static void mainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong) {
		    	ArrayList<Character> guessedPos = new ArrayList<Character>();
		    	int guessed = 0;
		    	guessedPos.ensureCapacity(correctWord.length());
		    	while(guessedPos.size() < correctWord.length()) {
		    	    guessedPos.add('a');
		    	}
		    	while(guessed < correctWord.length()) {
		    	  System.out.println("ordet �r: ");
		    	  for(int i = 0; i < correctWord.length(); i++) {
		    	    char current = correctWord.charAt(i);
		    	    if(guessedPos.get(i) == current) {
		    	    	  System.out.print(current);
		    	    	} else {
		    	    	  System.out.print("_");
		    	    	} 
		    	  }
		    	  System.out.print("\n");                  
		    	  System.out.println("Skriv in ett bokstav");
		    	  Scanner input = new Scanner(System.in);
		    	  String c = input.nextLine();
		    	  if(correctWord.contains(c)) {
	                    for(int i = 0; i < correctWord.length(); i++) {
	                      if(correctWord.charAt(i) == c.charAt(0)) {
	                        guessedPos.set(i, c.charAt(0));
	                        guessed++;
	                      
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
                        wrong++;
                        
	                    }                
		    	  
		    	}
		    }
		    
		    
		    public static void feedback(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	
		    	if(wonOrNot = true) {
		    		if (oneOrTwoPlayers = true) {
		    			if(selfDefining = false) {
		    				if(playerGuessing = true) {
		    					System.out.println("Grattis!");
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + name + " definerade f�r oss!");
		    					
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
		    					if(sentencesOrWords = true) {
		    						System.out.println("Ord/meningar: Ord ");
		    					}
		    					if(sentencesOrWords = false) {
		    						System.out.println("Ord/meningar: Meningar");
		    					}
		    					System.out.println("Definerad av: " + name);
		    					System.out.println("Gissat fram av: " + secondPlayerName);
		    					
		    					
		    					
		    					
		    					
		    				}
                            if(playerGuessing = false) {
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
		    					if(sentencesOrWords = true) {
		    						System.out.println("Ord/meningar: Ord ");
		    					}
		    					if(sentencesOrWords = false) {
		    						System.out.println("Ord/meningar: Meningar");
		    					}
		    					System.out.println("Definerad av: " + secondPlayerName);
		    					System.out.println("Gissat fram av: " + name);
		    				}
		    			}
		    			if(selfDefining = true) {
		    				
		    			}
		    		}
		    		if (oneOrTwoPlayers = false) {
		    			
		    		}
		    		
		    	}
		    	
                if(wonOrNot = false) {
		    		
		    	}
		    	
		    	
		    	
		    }
		    
		    public static void restartOrNot(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing, int degreeOfDifficulty) {
		    	String svar1A = "Igen";
		        String svar1B = "igen";
		        String svar2A = "avsluta";
		        String svar2B = "Avsluta";
		    	
		    	System.out.println("Nu, �r spelet �ver, men vill ni avsluta spelet eller k�ra igen? (igen/avsluta)");
		    	
		    	Scanner input = new Scanner(System.in);
		    	String svar = input.nextLine();
		    	
		    	if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    		if (oneOrTwoPlayers = true) {
		    			if(sentencesOrWords = true ) {
		    				if(selfDefining = false) 
		    				System.out.println("Ok!");
		    			}
		    			
		    		}
		    		
		    		if (oneOrTwoPlayers = false) {
		    			System.out.println("Ok!");
		    		}
		    		
		    	}
		    	
		    	if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    		System.out.println("Ok! Hejd�!");
		    		 System.exit(0);
		    	}
		    	
		    }
		    
		    public static void restartButAtWhatPoint(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	System.out.println("Var vill du/ni b�rja om n�gonstans?");
		    	
		    }
		 
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
}
		    
            
	    		
		    	
	



	
	
	
	

	
	
	
