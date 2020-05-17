package hängaGubbeSpel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class HängaGubbeSpel {
 

public static void main(String[] args) {
	instruktionsNamn("namn");
	//Anropar den första metoden som ska vägleda genom hela programet
	
}


public static void instruktionsNamn(String namn) {
	System.out.println("Hej och välkomna till det BÄSTA hänga gubbe spel, vi kommer verkligen testa dina kunskaper när det gäller meningar och ord.");
	System.out.println("Jag kommer nu framöver i programet fråga dig/er några frågor för att forma denna hänge gubbespel på det sättet ni vill, och som passar er. Och sedan innan vi börjar ska jag förklara reglerna beroende på dom val ni har valt. ");
	System.out.println("På vägen kommer jag ochså berätta relevans till allt jag frågar er");
	System.out.println("Men innan vi börjar med all detta, var heter du?");
	//Välkomnings meddelande och några instruktioner till hur programet ska vara fram över. Sedan frågar programet om namn som skall senare användas över hela klassen.
	
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	
	System.out.println("Hej " + name + "! Hoppas att du kommer gilla min program");
	
	twoOnePlayers(name, false);
	//Namnet anges och sedan går det vidare till nästa metod, som ska definera om det ska vara en eller två spelare läge.
}

public static void twoOnePlayers(String name, boolean oneOrTwoPlayers) {
	String svar1A = "Two";
	String svar1B = "two";
	String svar2A = "En";
	String svar2B = "en";
	//
	
	System.out.println("Ok " + name + " Skulle du vilja köra i tvåspelarläge eller enspelareläge? (En/Two)");
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
		System.out.println("Ok " + name + " Nu skulle jag ochså vilja ha namnet på andra personen av samma skäl!");
		
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
		
		System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja gissa på ord eller meningar? (Ord/Mening)" );
		
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
		
		System.out.println("Ok " + name + " Skulle du vilja gissa på ord eller meningar?");
      
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
			System.out.println("Ok " + name + " på vilket svårighets grad skulle du vilja gissa ord på?");
			System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
			System.out.println("Efter att du har valt en, kommer ett av orden slumpas fram. Vilket kommer då bli det ordet du ska gissa på");
			System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0 > degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
				}
				else {
					System.out.println("Ok!");
					ifRandomized(name,true,degreeOfDifficulty,false);
				}
				
				
			}
			
		}
		
		if (sentencesOrWords = false) {
			System.out.println("Ok " + name + " på vilket svårighets grad skulle du vilja gissa meningar på?");
			System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
			System.out.println("Efter att du har valt en, kommer ett av meingar slumpas fram. Vilket kommer då bli det ordet du ska gissa på");
			System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
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
				System.out.println("Ok " + name + " och " + secondPlayerName + "På vilken svårighetsgrad skulle ni vilja gissa på? " );
				System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
				System.out.println("Efter att du har valt en, kommer ni välja om ni vill själva välja ett ord eller slumpa ett ord fram. Vilket kommer då bli det ordet ni/en av er ska gissa på");
				System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
				
				while(degreeOfDifficulty >= 1 && degreeOfDifficulty <= 3 ) {
					Scanner input = new Scanner(System.in);
					degreeOfDifficulty = input.nextInt();
					
					if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
						System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
					}
					else {
						System.out.println("Ok!");
						randomizedOrNot(name,true,true,secondPlayerName,degreeOfDifficulty);
					}
					
					
				}
				
			}
			
			if (sentencesOrWords = false) {
				System.out.println("Ok " + name + " och " + secondPlayerName + "På vilken svårighetsgrad skulle ni vilja gissa på? " );
				System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
				System.out.println("Efter att du har valt en, kommer ni välja om ni vill själva välja ett mening eller slumpa ett mening fram. Vilket kommer då bli det meniget ni/en av er ska gissa på");
				System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
				
				while(degreeOfDifficulty >= 1 && degreeOfDifficulty <= 3 ) {
					Scanner input = new Scanner(System.in);
					degreeOfDifficulty = input.nextInt();
					
					if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
						System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
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
		String svar2A = "välja";
		String svar2B = "Välja";
		
		
		if (sentencesOrWords = true) {
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja själva välja ett ord från bibloteket som en av er ska gissa på");
			System.out.println("Eller, skulle ni vilja slumpa fram ett ord? (slumpa/välja)");
			
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
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja själva välja ett mening från bibloteket som en av er ska gissa på");
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
			System.out.println("Ok, " + name + " och " + secondPlayerName + " så ni valde att själva välja ett ord från ordlistan i svårighets graden " + degreeOfDifficulty);
			System.out.println("Nu skulle jag vilja att ni väljer en som ska gissa, och en som ska välja ett ord som den andra ska gissa på");
			System.out.println("Jag ger er 30 sekunder att välja, sedan får ni inputa era svar!");
			System.out.println("timern kör igång..... NU!");
			
			try {
		    	TimeUnit.SECONDS.sleep(30);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("något gick fel");
		    	}
			
			System.out.println("Ok! Så vem ska gissa på orden? ( " + name + " / " + secondPlayerName + " ) ");
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok! Innan jag vissar alla dinna val kommer jag ge " + secondPlayerName + " 20 sekunder att kolla bort eller något, så " + secondPlayerName + " kan ej fuska!");
				System.out.println("Timern börjar........ NU");
				try {
			    	TimeUnit.SECONDS.sleep(20);

			    	}
			    	
			    	catch(Exception e) {
			    		System.out.println("något gick fel");
			    	}
				
				System.out.println("Nu antar jag att " + secondPlayerName + " är borta");
				
				if (degreeOfDifficulty == 1) {
					boolean wordChossen = false;
					ArrayList<String> ordNivå1 = new ArrayList<>();
					ordNivå1.add("1. frankrike");
					ordNivå1.add("2. göteborg");
					ordNivå1.add("3. juni");
					ordNivå1.add("4. duva");
					ordNivå1.add("5. tiger");
					ordNivå1.add("6. jakarta");
					ordNivå1.add("7. karlskoga");
					ordNivå1.add("8. fjällämmel");
					ordNivå1.add("9. maj");
					ordNivå1.add("10. gröngölning");
					
					while(wordChossen != true) {
						System.out.println("Dina val är: ");
						System.out.println(ordNivå1);
						System.out.println("Vad tycker du " + secondPlayerName + " borde gissa på?");
						int svar2 = input.nextInt();
						
						if (svar2>0 && svar2<=10) {
							Iterator<String> it = ordNivå1.iterator();
							while(it.hasNext()) {
								
							}
							
							correctWord = ordNivå1.get(svar2);
							
							System.out.println("ordet du har valt är " + correctWord);
							for(int i = 0; i < 50; i++) {
				    			System.out.println(" ");
				    		}
							wordChossen = true;
						}
						else {
							System.out.println("Jag vill ha ett number som finns listan!, så mellan 1 till 10! Inte mer eller mindre");
						}
					}
					
					System.out.println("Ok! Nu kan du tala om för " + secondPlayerName + " att hen kan kolla tillbacks! Jag ger er 20 sekunder");
					try {
				    	TimeUnit.SECONDS.sleep(20);

				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("något gick fel");
				    	}
				
					System.out.println("Ok! Nu har ordet valts, nu går vi vidare!");
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
				ArrayList<String> ordNivå1 = new ArrayList<>();
				
				ordNivå1.add("frankrike");
				ordNivå1.add("göteborg");
				ordNivå1.add("juni");
				ordNivå1.add("duva");
				ordNivå1.add("tiger");
				ordNivå1.add("jakarta");
				ordNivå1.add("karlskoga");
				ordNivå1.add("fjällämmel");
				ordNivå1.add("maj");
				ordNivå1.add("gröngölning");
				Collections.shuffle(ordNivå1);
				
				String correctWord = ordNivå1.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false);
				
			}
			
            if (degreeOfDifficulty == 2) {
            	ArrayList<String> ordNivå2 = new ArrayList<>();
           
            	ordNivå2.add("dominica");
				ordNivå2.add("riga");
				ordNivå2.add("västervik");
				ordNivå2.add("lördag");
				ordNivå2.add("entita");
				ordNivå2.add("hegemoni");
				ordNivå2.add("renegat");
				ordNivå2.add("anomali");
				ordNivå2.add("impertinent");
				ordNivå2.add("patgernalism");
				Collections.shuffle(ordNivå2);
				
				String correctWord = ordNivå2.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false);
            	
			}
            
            if (degreeOfDifficulty == 3) {
            	ArrayList<String> ordNivå3 = new ArrayList<>();
                
            	ordNivå3.add("mindervärdighetskomplex");
				ordNivå3.add("crackpundare");
				ordNivå3.add("flaggstångsknoppsmålare");
				ordNivå3.add("lörd");
				ordNivå3.add("entita");
				ordNivå3.add("hegemoni");
				ordNivå3.add("renegat");
				ordNivå3.add("anomali");
				ordNivå3.add("impertinent");
				ordNivå3.add("patgernalism");
				Collections.shuffle(ordNivå3);
				
				String correctWord = ordNivå3.get(0);
				preMainGame(name,false,"nothing",true,false,correctWord,false);
			}
			
			
		}
		
		
        if(sentencesOrWords == false) {
            if (degreeOfDifficulty == 1) {
              ArrayList<String> meningNivå1 = new ArrayList<>();
                
              meningNivå1.add("ju fler Desto Bättre");
              meningNivå1.add("kan du öppna dörren");
              meningNivå1.add("khalil har en katt");
              meningNivå1.add("sara studerar i skolan");
              meningNivå1.add("amela och Adam har två barn");
              meningNivå1.add("peter har tre pojkar");
              meningNivå1.add("titti talar i telefon med syster tove");
              meningNivå1.add("ylva är lycklig hon har en ny cykel");
              meningNivå1.add("han heter billy");
              meningNivå1.add("att skriva en adress");
				Collections.shuffle(meningNivå1);
				
				String correctSentence = meningNivå1.get(0);
				preMainGame(name,false,"nothing",false,false,correctSentence,false);
			}
			
            if (degreeOfDifficulty == 2) {
            	 ArrayList<String> meningNivå2 = new ArrayList<>();
                 
                 meningNivå2.add("det är så tomt för att det är helgen innan löning");
                 meningNivå2.add("det är helt sjukt att det är billigare att flyga");
                 meningNivå2.add("jag måste skynda mig, jag har bokat en tvättid");
                 meningNivå2.add("varför har du inte pluggat till läkare");
                 meningNivå2.add("de har en jättebra restaurang");
                 meningNivå2.add("jag har läst tyska i skolan, men jag kan ingenting");
                 meningNivå2.add("Så göra man på kontinenten");
                 meningNivå2.add("Jag gillar finlandssvenska");
                 meningNivå2.add("Vad är egentligen det nya söder");
                 meningNivå2.add("Jag känner jättemånga som har träffats på nätet");
   				Collections.shuffle(meningNivå2);
   				
   				String correctSentence = meningNivå2.get(0);
   				preMainGame(name,false,"nothing",false,false,correctSentence,false);
			}
            
            if (degreeOfDifficulty == 3) {
            	ArrayList<String> meningNivå3 = new ArrayList<>();
                
                meningNivå3.add("i en värld där smala väger tyngst övervikt som en medial konstruktion");
                meningNivå3.add("nej över huvud taget inte En kvantitativ och kvalitativ analys av diskreta och indirekta översättningsstrategier i de sveska översättningarna av två minimalitiska danska romaner");
                meningNivå3.add("är alla inkluderade en analys av förslag till svenska kyrkans kyrkohandbok ur ett andraspråksperspektiv");
                meningNivå3.add("svenska som andraspråk och svenska en jämförande av ämnena");
                meningNivå3.add("prepositionsbruk hos personer med annat hemspråk än svenska");
                meningNivå3.add("klädesborste eller skohorn en språklig och innehållslig jämförelse av jan guillous");
                meningNivå3.add("utländska läkares ordförstålsen");
                meningNivå3.add("en studie av bestämmelsens inverkan på offentlighetsprincipen");
                meningNivå3.add("i det förgångna bär oupplösligt mödan");
                meningNivå3.add("börda jag fåfäng sökt att lasta av");
  				Collections.shuffle(meningNivå3);
  				
  				String correctSentence = meningNivå3.get(0);
  				preMainGame(name,false,"nothing",false,false,correctSentence,false);
			}
		}
		
		
		
	}
	
	
	
	    public static void selfDefiningWords(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords ) {
	    	String svar1A = "Själv";
			String svar1B = "själv";
			String svar2A = "Biblotek";
			String svar2B = "biblotek";
	    	
	    	System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja själva ange ordet som den andra ska gissa på eller välja bland en biblotek? (Själv/Biblotek) " );
	    	
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
		    	
		    	System.out.println("Ok " + name + " och " + secondPlayerName + " Ni valde att själva definera ord!" );
		    	System.out.println("Nu ska ni bestämma vem ska då definera ord för den andra! Jag kommer ge er nu 20 sekunder att bestäma vem det ska vara, kör igång!" );
		    	System.out.println("Timern börjar.... NU" );

		    	try {
		    	TimeUnit.SECONDS.sleep(20);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("något gick fel");
		    	}
		    	
		    	System.out.println("Ok! " + name + " och " + secondPlayerName + " Vem kommer definera orden? ( " + name + " / " + secondPlayerName + " ) ");
		    	Scanner input = new Scanner(System.in);
			    String svar = input.nextLine();
			    
			    
			    if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	playerGuessing = true;
			    	System.out.println("Ok! " + name + " Du får äran att välja ordet som " + secondPlayerName + " Ska gissa på!" );
			    	System.out.println("Jag kommer ge dig " + name + " 30 sekunder för att komma på ett ord och för att " + secondPlayerName + " ska kolla bort!");
			    	System.out.println("timern börjar.... NU");
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("något gick fel");
				    	}
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + name + " har hittat på ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha några mellanrum mellan ord! Om du vill köra med meningar får du starta om programet och välja meningar istället för ord");
			    	}
			    	
			    	else {
			    		
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" ");
			    		}
			    		System.out.println("Ok! Nu kan du tala om för " + secondPlayerName + " att han kan kola hit igen");
			    		String correctWord = svar2;
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,true);
			    		
			    	}
			    	
			   
			    }
			    
			    if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	playerGuessing = false;
			    	System.out.println("Ok! " + secondPlayerName + " Du får äran att välja ordet som " + name + " Ska gissa på!" );
			    	System.out.println("Jag kommer ge dig " + secondPlayerName + " 30 sekunder för att komma på ett ord och för att " + name + " ska kolla bort!");
			    	System.out.println("timern börjar.... NU"); 
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("något gick fel");
				    	}
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + secondPlayerName + " har hittat på ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha några mellanrum mellan ord! Om du vill köra med meningar får du starta om programet och välja meningar istället för ord");
			    	}
			    	
			    	else { 
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" ");
			    		}
				    	System.out.println("Ok! Nu kan du tala om för " + name + " att han kan kola hit igen");
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
		    				System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + secondPlayerName);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa ordet. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett ord då, inga meningar");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    				mainGame1(name,true,secondPlayerName,true,false,correctWord,true,correctWord,0,0,0,0);
		    			}
		    			
                        if (sentencesOrWords == false && playerGuessing == true) {
                        	System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + secondPlayerName);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa meningen. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett mening då, inte ord");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == false && playerGuessing == false) {
                        	System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + name);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa meningen. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett mening då, inte ord");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == true && playerGuessing == false) {
                        	System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + name);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa ordet. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett ord då, inga meningar");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
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
		    	  System.out.println("ordet är: ");
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
	                        	System.out.println("Gubben hängdes :(");
	                        	 
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
                        	System.out.println("Gubben hängdes :(");
                        	
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
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + name + " definerade för oss!");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Det tog dig: ");
		    					System.out.print("\n"); 
		    					int totalAwnsers = wrongAnswers+rightAnswers;
		    					System.out.println("Totala försök: " + totalAwnsers);
		    					System.out.println("Fel svar: " + wrongAnswers);
		    					System.out.println("Rätt svar: " + rightAnswers);
		    					System.out.println("Du hade: " + triesLeft + " försök kvar");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Dina instälningar var:");
		    					System.out.print("\n"); 
		    					
		    					System.out.println("En/två-spelarsläge: Två");
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
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + secondPlayerName + " definerade för oss!");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Det tog dig: ");
		    					System.out.print("\n"); 
		    					int totalAwnsers = wrongAnswers+rightAnswers;
		    					System.out.println("Totala försök: " + totalAwnsers);
		    					System.out.println("Fel svar: " + wrongAnswers);
		    					System.out.println("Rätt svar: " + rightAnswers);
		    					System.out.println("Du hade: " + triesLeft + " försök kvar");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Dina instälningar var:");
		    					System.out.print("\n"); 
		    					
		    					System.out.println("En/två-spelarsläge: Två");
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
		    	
		    	System.out.println("Nu, är spelet över, men vill ni avsluta spelet eller köra igen? (igen/avsluta)");
		    	
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
		    		System.out.println("Ok! Hejdå!");
		    		 System.exit(0);
		    	}
		    	
		    }
		    
		    public static void restartButAtWhatPoint(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	System.out.println("Var vill du/ni börja om någonstans?");
		    	
		    }
		 
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
}
		    
            
	    		
		    	
	



	
	
	
	

	
	
	
