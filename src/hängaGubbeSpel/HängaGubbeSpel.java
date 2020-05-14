package h�ngaGubbeSpel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;

public class H�ngaGubbeSpel {
	

public static void main(String[] args) {
	mainGame1("anton",true,"anton2",true,true,"supercool",true,"progress",0,0,0);
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
	
	if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		oneOrTwoPlayers = true;
	    secondPlayerName(name,true);
	}
	
	if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		oneOrTwoPlayers = false;
		sentencesOrWords(name);
		

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
	
	
	public static void sentencesOrWords(String name) {
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		
		System.out.println("Ok " + name + " Skulle du vilja gissa p� ord eller meningar?");
      
		Scanner input = new Scanner(System.in);
		String svar = input.nextLine();
		
			   if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	boolean sentencesOrWords = true;
			    	
			    }
			   
			   if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	boolean sentencesOrWords = false;
			    	
			    }
		

	}
	
	
	public static void theDegreesOfDifficulty(String name, boolean sentencesOrWords) {
		int degreeOfDifficulty = 0;
		
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
				}
				
				
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
			    
		
		    public static void preMainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing) {
		    	
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
		    				mainGame1(name,true,secondPlayerName,true,false,correctWord,true,correctWord,0,0,0);
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
		    
		    
		    
		    
		    public static void mainGame1(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	System.out.println("'''\r\n" + 
		    			"  +---+\r\n" + 
		    			"  |   |\r\n" + 
		    			"      |\r\n" + 
		    			"      |\r\n" + 
		    			"      |\r\n" + 
		    			"      |\r\n" + 
		    			"=========''', '''");
		    	
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
		    	      }
		    	    }
		    	  } 
		    	  
		    	  else {
		    	    System.out.println("du gissade ej r�tt");
		    	  }      
		    	  
		    	}
		    	  
		    	
		

		    	
		    }
		    
            public static void mainGame2(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	
              
            	
		    }
            
            public static void mainGame3(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	
		    }
            
            public static void mainGame4(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	
		    }
            
            public static void mainGame5(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	
		    }
            
            public static void mainGame6(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft) {
		    	
		    }
		    
		    
		    }
	    		
		    	
	
	
	
	
	
	

	
	
	

