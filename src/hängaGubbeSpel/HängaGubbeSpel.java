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
	//Jag innan metoden ens börjar går några strings som ska då vara vad spelarna ska svara med. I både liten bokstav men ochså stor bokstav 
	//Detta gör jag för att det inte ska spela roll om man skriver in en stor bokstav eller liten för det är samma svar.
	
	System.out.println("Ok " + name + " Skulle du vilja köra i tvåspelarläge eller enspelareläge? (En/Two)");
	Scanner input = new Scanner(System.in);
	String svar = input.nextLine();
	
	if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		oneOrTwoPlayers = true; //Orsak att jag då sparar de i booleans är för att jag senare i metoder som preMainGame ska kunna lätt 
        //definera alla instälningar som spelarna har definerad och sedan basera mainGame på det. 
	    secondPlayerName(name,true);
	    //Här använder jag mig av contentEquals vilket är samma som vad jag använde mig i talspelet. Vad if-satsen gör är att den först kollar
	    //om svar är samma som svar1A, om den inte är det så gör den vidare till svar1B och om inga är santa går den till nästa if-satsen och kollar om det stämmer
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
		//Här helt enkelt frågar jag efter namnet på andra personen om det är då tvåspelarläge. Detta gör jag så att senare i spelet
		//programet ska kunna kommunicera med både spelarna beroende på omständigheterna. Men ochså senare när spelarena ska definera vem av dom som ska gissa/definera (om de då väljer det)
		
		twoPlayerSentencesOrWords(name, true, secondPlayerName);
		
	}
	
	
	
	public static void twoPlayerSentencesOrWords(String name, boolean oneOrTwoPlayers, String secondPlayerName) {
		String svar1A = "Ord";
		String svar1B = "ord";
		String svar2A = "Mening";
		String svar2B = "mening";
		//Jag gör samma sak som i twoOnePlayers
		
		System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja gissa på ord eller meningar? (Ord/Mening)" );
		
		Scanner input = new Scanner(System.in);
	    String svar = input.nextLine();
	    
	    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
	    	boolean sentencesOrWords = true;
	    	selfDefiningWords(name,true,secondPlayerName,true);
	    	
	    }
	    
	    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
	    	boolean sentencesOrWords = false;
	    	//Här finns inte någon metodanropning för att jag inte hade tid med att göra en sådan metod tack vare att jag var fokuserad på andra aspekter av projektet
	    }
	    
	 
	    
	}
	
	
	public static void sentencesOrWords(String name, boolean oneOrTwoPlayers) {
		//Den här metoden är i princip samma sak som twoPlayerSentencesOrWords, enda skillnaden här är att det är för enspelareläge och inte tvåspelarläge 
		
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
		//Jag skapar själva degreeOfDificulty i starten så att jag kan sen använda den genom hela metoden utan att behöva definera det i if-satserna
		//Detta är ganska roligt med tanke om hur mina metoder ser senare i koden, men oh well 
		
		if (oneOrTwoPlayers = false) { //Detta är ett exempel på vad jag pratade om tidigare, att det blir mycket mer lättare att definera inställningar som spelaren har angett och basera spelet på det. 
			
		
		if (sentencesOrWords = true) { //Om det är enspelareläge & det är ord som hen ska gissa på. Jag ville orginelt ha det som if(oneOrTwoPlayers = (condition) && sentencesOrWords = (condition)), men jag insåg det skulle vara aldeles för förvirande 
			//för pers som skulle läsa min kod.
			System.out.println("Ok " + name + " på vilket svårighets grad skulle du vilja gissa ord på?");
			System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
			System.out.println("Efter att du har valt en, kommer ett av orden slumpas fram. Vilket kommer då bli det ordet du ska gissa på");
			System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
			//Instruktioner till hur programet ska fungera framöver
			
			while(degreeOfDifficulty < 1 || degreeOfDifficulty > 3 ) { //Medans degreeOfDificulty är mindre än 1 eller större än 3 ska koden gälla
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0 > degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
					//Om inputen är större än 3 eller minde än 0 ska då detta medelande komma upp och while loopen ska fortsätta
				}
				else {
					System.out.println("Ok!"); //Annars ska programet fortsätta
					ifRandomized(name,true,degreeOfDifficulty,false,"name"); //"name" finns där så att det ska gå att anropa, för att ifRandomized har ochså string secondPlayerName även om det är enspelareläge
				}
				
				
			}
			
		}
		
		if (sentencesOrWords = false) { //Om det är enspelareläge och man ska gissa på meningar. 
			System.out.println("Ok " + name + " på vilket svårighets grad skulle du vilja gissa meningar på?");
			System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
			System.out.println("Efter att du har valt en, kommer ett av meingar slumpas fram. Vilket kommer då bli det ordet du ska gissa på");
			System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
			//instruktioner men ändrat lite till "mening" istället
			
			while(degreeOfDifficulty < 1 && degreeOfDifficulty > 3 ) {
				Scanner input = new Scanner(System.in);
				degreeOfDifficulty = input.nextInt();
				
				if (degreeOfDifficulty>3 || 0>degreeOfDifficulty  ) {
					System.out.println("Jag vill ha ett nummer från 1 till 3, inte mer eller mindre!");
				}
				else {
					System.out.println("Ok!");
					ifRandomized(name,false,degreeOfDifficulty,false,"name");
				}
				//samma system som jag använde förut
				
				
			}
		}
		}
		
		if (oneOrTwoPlayers = true) { //om det är tvåspelareläge
			
			if (sentencesOrWords = true) { // om det är tvåspelareläge och det är ord
				System.out.println("Ok " + name + " och " + secondPlayerName + "På vilken svårighetsgrad skulle ni vilja gissa på? " );
				System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
				System.out.println("Efter att du har valt en, kommer ni välja om ni vill själva välja ett ord eller slumpa ett ord fram. Vilket kommer då bli det ordet ni/en av er ska gissa på");
				System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
				//instruktioner
				
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
					
					//samma system som jag använde på dom andra ifsatserna
					
					
				}
				
			}
			
			if (sentencesOrWords = false) { // om det är tvåspelareläge och det ska gissas på meningar
				System.out.println("Ok " + name + " och " + secondPlayerName + "På vilken svårighetsgrad skulle ni vilja gissa på? " );
				System.out.println("Det kommer finnas 3 olika svårighetsgrader, 1 = Lätt, 2 = Medium 3 = svårt");
				System.out.println("Efter att du har valt en, kommer ni välja om ni vill själva välja ett mening eller slumpa ett mening fram. Vilket kommer då bli det meniget ni/en av er ska gissa på");
				System.out.println("Med det sagt, vilket svårighetsgrad skulle du vilja gissa på? (1/2/3)");
				//instruktioner
				
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
					//samma system som jag använda på dom andra ifsatserna
					
					
				}
			}
			
	
		}
		
	
		
	}
	
	public static void randomizedOrNot(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty) { //Anledning till varför jag har så mycket parametrar med mig speciellt när det gäller senare i koden är tack vare att jag ville att 
		// alla instälningar ska sparas och visas i feedback, dessutom kommer ochså dessa instälningar användas för att bestämma var spelet ska börja om senare vid slutet.
		String svar1A = "slumpa";
		String svar1B = "Slumpa";
		String svar2A = "välja";
		String svar2B = "Välja";
		//Här gör jag exakt samma sak som jag gjorde förut, enda skillnad är att det är 
		
		
		if (sentencesOrWords = true) { //Orsak till varför jag har sentecnesOrWords boolean ifsatesner är för att jag vill att instruktioner ska vara olika beronnde på om
			// man väljer ord eller meningar. Enda skilnaden mellan dessa två ifsatser är att en säger "ord" i instruktioner och den andra säger "meningar". 
			System.out.println("Ok! " + name + " och " + secondPlayerName + " Skulle ni vilja själva välja ett ord från bibloteket som en av er ska gissa på");
			System.out.println("Eller, skulle ni vilja slumpa fram ett ord? (slumpa/välja)");
			
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
				System.out.println("Ok!");
				ifRandomized(name,true,degreeOfDifficulty,true,secondPlayerName);
				//samma system som innan, här finns ochså en annan "crossroad" som går antigen till ifRandomized eller ifNotRandomized
			
			}
			
			if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
				System.out.println("Ok!");
				ifNotRandomized(name,true,true,secondPlayerName,degreeOfDifficulty,"word");
				//Här går det till en metod där man kan ange vilket ord den andra ska gissa på
			}
			
			
		}
		
		if (sentencesOrWords = false) { //Om man ska gissa på meningar, här kan vi ser mer ändrigar i texten ochså
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
				//Samma system som övan
			}
		}
		
		
	}
	
	
	public static void ifNotRandomized(String name, boolean sentencesOrWords, boolean oneOrTwoPlayers, String secondPlayerName, int degreeOfDifficulty, String correctWord) {
		String svar1A = name;
    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
    	String svar2A = secondPlayerName;
    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
    	//Här är det exakt samma men lite ändrigar, här vill jag ju ha svar i form av namn på pers, så jag sätter svar1a-svar2b till dessa personerns namn
    	// toUpperCase har jag med då så att det inte ska spela roll om man svarar i storbokstav form eller litenbokstav form 
    	//Men jag inser nu att det kommer inte riktigt fungera, för att vad om en av spelarna anger namnet med stor bokstav i början av spelet?
    	//Då skulle programet inte fungera, skule ha haft det i åtanke!
		
		
		if (sentencesOrWords = true) { //Om spelarna ska välja från en lista av ord,
			System.out.println("Ok, " + name + " och " + secondPlayerName + " så ni valde att själva välja ett ord från ordlistan i svårighets graden " + degreeOfDifficulty);
			System.out.println("Nu skulle jag vilja att ni väljer en som ska gissa, och en som ska välja ett ord som den andra ska gissa på");
			System.out.println("Jag ger er 30 sekunder att välja, sedan får ni inputa era svar!");
			System.out.println("timern kör igång..... NU!");
			//Instruktioner
			
			try {
		    	TimeUnit.SECONDS.sleep(30); //Här skapar jag en delay på 30 sekunde rså att spelarna ska bestämma vem det är som ska välja och vem som ska gissa

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("något gick fel"); //Om av någon orsak delayen inte fungerar, så kommer denna medelande
		    	}
			
			System.out.println("Ok! Så vem ska gissa på orden? ( " + name + " / " + secondPlayerName + " ) ");
			Scanner input = new Scanner(System.in);
			String svar = input.nextLine();
			//Här ska spelarna skriva in deras namn som dom angett i början av spelet, namnen då och inte "name" eller "secondPlayernName"
			
			if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) { // Samma system som innan
				System.out.println("Ok! Innan jag vissar alla dinna val kommer jag ge " + secondPlayerName + " 20 sekunder att kolla bort eller något, så " + secondPlayerName + " kan ej fuska!");
				System.out.println("Timern börjar........ NU");
				try {
			    	TimeUnit.SECONDS.sleep(20);

			    	}
			    	
			    	catch(Exception e) {
			    		System.out.println("något gick fel");
			    	}
				//Här lägger jag samma delay så att att en av spelarna har tid att kolla bort innan jag ger en lista på alla ord till den andra spelaren
				
				System.out.println("Nu antar jag att " + secondPlayerName + " är borta");
				
				//Nu beroende på vad man svarade på degreeOfDifficulty ska olika ord komma upp, 
				if (degreeOfDifficulty == 1) {
					boolean wordChossen = false; //Här skapar jag en ny boolean som ska bara vara aktiv för dessa ifsatser. den är här så att while looperna ska kunna fungera,
                  //ochså för felhantering om man skrev något som är mer än 10 eller mindre än 1
					ArrayList<String> ordNivå1 = new ArrayList<>(); //skapar en ny lista av lätta ord som jag hittade på nätet
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
					
					while(wordChossen != true) { //Det ska loopa om och om igen tills den blir true
						System.out.println("Dina val är: ");
						System.out.println(ordNivå1); //Jag printar ut alla ord i det ordet som vi kan se i arraylisten, 
						System.out.println("Vad tycker du " + secondPlayerName + " borde gissa på?");
						int svar2 = input.nextInt();
						
						if (svar2>0 && svar2<=10) {
							Iterator<String> it = ordNivå1.iterator(); //Här skapar jag en ny iterator, som helt enkelt ska gå igenom hela listan och ta bort alla nummer, punkter och blanka spots. 
							//Men tyvärr som man kan se hann jag aldrig så lång, fast detta är vad jag lämmnade det på,
							while(it.hasNext()) {
								
							}
							
							System.out.println("ordet du har valt är " + correctWord); //Efter att iteratorn har gjort sitt jobb ska ordet displayas till spelaren, så hen vet vad det är säkert
							for(int i = 0; i < 50; i++) {
				    			System.out.println(" ");
				    		} //Sedan printar consolen ut massor av tomma rutor så att när den andra spelaren är tillbaka kan hen inte fuska genom att bara kolla upp i konsolen.
							wordChossen = true; // ordet har angeets så det blir till true.
						}
						else {
							System.out.println("Jag vill ha ett number som finns listan!, så mellan 1 till 10! Inte mer eller mindre"); //Om spelaren anger ett number som är för liten eller för stor kommer denna medelande poppa ut
							// och while loopen fortsätter.
						}
					}
					
					System.out.println("Ok! Nu kan du tala om för " + secondPlayerName + " att hen kan kolla tillbacks! Jag ger er 20 sekunder");
					try {
				    	TimeUnit.SECONDS.sleep(20);

				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("något gick fel");
				    	}
					//En annan delay så att den andra spelaren kan komma tillbaka
				
					System.out.println("Ok! Nu har ordet valts, nu går vi vidare!");
					preMainGame(name,true,secondPlayerName,true,true,correctWord,true,degreeOfDifficulty);
					//går till nästa metod som ska då berätta alla regler för spelet innan det starter


				}
				
	            if (degreeOfDifficulty == 2) {
	            	//Ska göra samma sak som degreeOfDificulty == 1, bara att det ska vara andra ord som är svårare

				}
	            
                if (degreeOfDifficulty == 3) {
                	//Ska göra samma sak som degreeOfDificulty == 1, bara att det ska vara andra ord som är svårare
				}
				
				
			}
			
			
			
		}
		
		if (sentencesOrWords = false) {
			//Ska göra samma sak som setnecnesorwords = true, bara att det är meningar och lite ändrade kod så att mellan rum är tillåtna
		}
		
	}
	
	
	
	
	public static void ifRandomized(String name, boolean sentencesOrWords, int degreeOfDifficulty, boolean oneOrTwoPlayers, String secondPlayerName) {
		//Metoden ska vara aktiv om spelarena vill att ett ord ska slumpa fram för de/hen, mycket är samma som i ifNotRandomized men bara några små ändringar. 
		if(sentencesOrWords == true) { //Om de/hen ska gissa på ord 
			//Sedan beroende på vilken ordnivå det är ska det gå till olika if-satser som ska ge olika ord beroende på det
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
				//Här använder jag mig av collections.shuffle för att det ska ändra ordningen i listan. så att det blandas lite
				
				String correctWord = ordNivå1.get(0); //Sedan tar jag bokstaven som hammnar på toppen som det correctWord, vilket gör samma funktion som new.random.
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
				
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
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
            	
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
				preMainGame(name,false,"nothing",true,false,correctWord,false,degreeOfDifficulty);
			}
			
			
		}
		
		
        if(sentencesOrWords == false) { //Här är det då om man vill gissa på meningar,
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
				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
				//jag gör exakt samma sak som innan ända skillnaden är då att jag istället för ord har meningar som slumpas
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
   				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
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
  				preMainGame(name,false,"nothing",false,false,correctSentence,false,degreeOfDifficulty);
			}
		}
		
		
		
	}
	
	
	
	    public static void selfDefiningWords(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords ) {
	    	String svar1A = "Själv";
			String svar1B = "själv";
			String svar2A = "Biblotek";
			String svar2B = "biblotek";
			//Jag gör exakt samma sak som förut men med olika ord 
	    	
	    	System.out.println("Ok " + name + " och " + secondPlayerName + " Skulle ni vilja själva ange ordet som den andra ska gissa på eller välja bland en biblotek? (Själv/Biblotek) " );
	    	
	    	Scanner input = new Scanner(System.in);
		    String svar = input.nextLine();
		    
		    if (svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    	boolean selfDefining = false;
		    	defineTheWord(name,true,secondPlayerName,true,false,true);
		    	
		    }
		    
		    if (svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    	boolean selfDefining = true;
		    	//Har inte någon anropning till den andra metoden däår man ska välja, för jag inte hann det
		    }
		    
	    }
	    
	    
	    
	    	
		    
		    public static void defineTheWord(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing) {
		    	String svar1A = name;
		    	String svar1B = name.substring(0, 1).toUpperCase() + name.substring(1);
		    	String svar2A = secondPlayerName;
		    	String svar2B = secondPlayerName.substring(0, 1).toUpperCase() + secondPlayerName.substring(1);
		    	//gör exakt samma som jag gjorde i ifNotRandomized metoden, jag inser nu att det kanske inte fungerar ochså
		    	
		    	System.out.println("Ok " + name + " och " + secondPlayerName + " Ni valde att själva definera ord!" );
		    	System.out.println("Nu ska ni bestämma vem ska då definera ord för den andra! Jag kommer ge er nu 20 sekunder att bestäma vem det ska vara, kör igång!" );
		    	System.out.println("Timern börjar.... NU" );

		    	try {
		    	TimeUnit.SECONDS.sleep(20);

		    	}
		    	
		    	catch(Exception e) {
		    		System.out.println("något gick fel");
		    	}
		    	//en delay för att spelarena ska kunna få tid att bestämma mellan varandra vem det är som ska gissa och vem som ska definera det för programet
		    	
		    	System.out.println("Ok! " + name + " och " + secondPlayerName + " Vem kommer definera orden? ( " + name + " / " + secondPlayerName + " ) ");
		    	Scanner input = new Scanner(System.in);
			    String svar = input.nextLine();
			    
			    
			    if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
			    	playerGuessing = true; //Playerguessing är här för att hålla koll vem det är som ska definera orden, och ochså vem som ska gissa
			    	System.out.println("Ok! " + name + " Du får äran att välja ordet som " + secondPlayerName + " Ska gissa på!" );
			    	System.out.println("Jag kommer ge dig " + name + " 30 sekunder för att komma på ett ord och för att " + secondPlayerName + " ska kolla bort!");
			    	System.out.println("timern börjar.... NU");
			    	
			    	try {
				    	TimeUnit.SECONDS.sleep(30);
				    	}
				    	
				    	catch(Exception e) {
				    		System.out.println("något gick fel");
				    	}
			    	//en annan delay så att spelarena ska kunna kolla bort och den andra ska kunna definera
			    	
			    	System.out.println("Ok! Nu hoppas jag att du " + name + " har hittat på ett ord, kan du ange det?");
			    	String svar2 = input.nextLine();
			    	
			    	if(svar2.contains(" ")) {
			    		System.out.println("Sorry! Men jag vill inte ha några mellanrum mellan ord! Om du vill köra med meningar får du starta om programet och välja meningar istället för ord");
			    	}
			    	//Här är det en annan felhanterings metod, som om spelaren har inkluderad några mellanrum mellan ord ska det då printa ut denna medelande, jag inser nu att detta kommer inte
			    	//riktigt fungera på det sättet jag tänkte mig för att det inte finns någon while loop. jag borde ha inkluderad det.
			    	
			    	else {
			    		//annars om ordet har inga mellanrum och allt är helt enkelt bra går den hit
			    		for(int i = 0; i < 50; i++) {
			    			System.out.println(" "); //spammar massor av mellanrum så att den andra spelaren inte ska fuska
			    		}
			    		System.out.println("Ok! Nu kan du tala om för " + secondPlayerName + " att han kan kola hit igen");
			    		String correctWord = svar2; //anger ordet till  vad spelaren har skrivit in
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,true,0);
			    		
			    	}
			    	
			   
			    }
			    
			    if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
			    	playerGuessing = false; //False är då om secondPlayerName ska gissa.
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
			    		preMainGame(name,true,secondPlayerName,true,false,correctWord,false,0);
			    		
			    	}
			    	
			    	
			    	//samma saker som den andra ifsatsen,

		    	 }
			    
			    
		    	}
			    
		
		    public static void preMainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, int degreeOfDifficulty) {
		    	//Här är metoden innan maingame då, där allar regler ska anges
		    	if (oneOrTwoPlayers == true ) { //Om det är då tvåspelareläge
		    		
		    		if (selfDefining == true) { //Om de vill INTE själv definera orden
		    			 
		    			if (sentencesOrWords == true) { //Om det är ett ord 
		    				//hann inte men instruktioner
		    			}
                        if (sentencesOrWords == false) {//Om det är ett mening
                        	//hann inte men instruktioner
		    			}
		    			
		    		}
		    		
		    		if (selfDefining == false) { //om man själv definerar orden
		    			//Här har jag flera olika alternativ som skulle berätta reglerna baserad på  vilka inställningar man har vallt, hann inte med alla men i alla fall alla i selfdefining=false
		    			
		    			if (sentencesOrWords == true && playerGuessing == true) { //Om det är då om det är ord och att name definerade orden.
		    				System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + secondPlayerName);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom ordet som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa ordet. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett ord då, inga meningar");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    				mainGame(name,true,secondPlayerName,true,false,correctWord,true,correctWord,0,0,0,0);
		    				//anger till själva spelet där spelet ska köras.
		    			}
		    			
                        if (sentencesOrWords == false && playerGuessing == true) {//Om det är då om det är då mening och att name definerade orden.
                        	System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + secondPlayerName);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + name + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa meningen. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett mening då, inte ord");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == false && playerGuessing == false) {//Om det är då om det är då mening och att secondPlayerName
                        	System.out.println("Nu har du då angett alla inställningar för spelet! Nu ska jag berätta hur spelet kommer köra till för " + name);
		    				System.out.println("du ska då gissa ett ord i taget, efter varje gissning kommer vi kolla igenom meningen som " + secondPlayerName + " har gett oss");
		    				System.out.println("Om du skriver in ett fel bokstav kommer delar av ett hängd gubben komma upp på skärmen");
		    				System.out.println("Om du skriver in ett rätt bokstav kommer rutan med ord som fattas börja fylla in sig och om du har redan gjort fel kommer bilden gå tillbaks ett steg");
		    				System.out.println("Ditt mål är att gissa meningen. Innan gubben hängs.");
		    				System.out.println("Du ska gissa på ett mening då, inte ord");
		    				System.out.println("Med det säger jag GLHF och vi tar oss vidare till spelet");
		    			}
                        
                        if (sentencesOrWords == true && playerGuessing == false) {//Om det är då om det är då ord och att secondPlayerName
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
		    	
		    	
		    	
		    	
		    	
                if (oneOrTwoPlayers == false) { //om det är då enspelareläge, vilket ska då definera om det är ord eller mening för att det är den enda som spelar roll här
		    		if (sentencesOrWords == true) {
		    			
		    		}
		    		
                    if (sentencesOrWords == false) {
		    			
		    		}
		    			
		    		
		    	}
		    	
		    	
		    }
		    
		    
		    
		    
		    public static void mainGame(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong) {
		    	ArrayList<Character> guessedPos = new ArrayList<Character>(); //Jag skapar en tom lista som jag skall senare använda för att göra min progress ____ grej fungerade
		    	int guessed = 0; //skapar guessed som skall användas för att spara antal gånger man har gissat
		    	guessedPos.ensureCapacity(correctWord.length()); //Här använder jag ensureCapacity för att säkerställa att guessedPos listan jag har skapat är lika stor som correctWord
		    	while(guessedPos.size() < correctWord.length()) {
		    	    guessedPos.add('a'); //Nu spammar jag listan med massor av "a" så att listan är inte tom, annars kommer det inte fungera
		    	}
		    	while(guessed < correctWord.length()) { //här kommer själva spelet, while loopen är för att när du gissat alla tecken i ordet ska det ta dig ur while-loopen
		    		//Och ska gå vidare till feedback metoden
		    	  System.out.println("ordet är: ");
		    	  for(int i = 0; i < correctWord.length(); i++) {
		    	    char current = correctWord.charAt(i); //här får det tecken man har gissat på på indexen i, så helt enkelt om vår ord är: exempel och vi gissar på p så kommer tecknet att justera baserad på det
		    	    if(guessedPos.get(i) == current) {
		    	    	  System.out.print(current); //Skriver ut tecknet
		    	    	} else {
		    	    	  System.out.print("_"); //på dom andra positioner som inte har gissats skriver den ut massor av ___ då
		    	    	} 
		    	  }
		    	  System.out.print("\n"); //ny linje         
		    	  System.out.println("Skriv in ett bokstav");
		    	  Scanner input = new Scanner(System.in);
		    	  String c = input.nextLine(); //Skriver in sin gissning som ska senare användas i spelet
		    	  if(correctWord.contains(c)) { //om man har gissat rätt
	                    for(int i = 0; i < correctWord.length(); i++) {
	                      if(correctWord.charAt(i) == c.charAt(0)) { //ifsatsen här kolla vad ordning på denna ordet är 
	                        guessedPos.set(i, c.charAt(0));
	                        guessed++;
	                       //Här helt enkelt loopar det tecknet genom hela ordet för att se om det finns mer av det, och ökar på guessed.
	                      
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
	                        //Sedan har jag ochså massor av grafik som ska repsentera vad man är, om man är då på wrong == 6 ska spelet gå vidare till feedback. 
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
                        	System.out.println("Gubben hängdes :(");
                        	
                        }
                        //Samma grafik som innan, av någon orsak så fungearde det inte i if satsen och jag kunde inte fixa det så jag la det både i else och if satserna och det verkade att fungera
                        wrong++;
                        //ökar på wrong, men jag har ingen system för att det ska gå ner för att jag hittade ingen bra system att om det skulle gå under 0 skulle det gå tillbaka till 0.
                        
	                    }                
		    	  
		    	}
		    }
		    
		    
		    public static void feedback(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	//Nu när spelet är över var tanken att man ska gå till feedback, där ska i maingame vara en till boolean som skulle heta wonOrNot, beroened på om van eller inte skulle det vara antigen falsk eller sant
		    	if(wonOrNot = true) { //Om man van spelet
		    		if (oneOrTwoPlayers = true) { //Om det är tvåspelare läge
		    			if(selfDefining = false) { // Om en av spelarena själv definerade ordet
		    				if(playerGuessing = true) { //Om det var personen i name som definerade det
		    					System.out.println("Grattis!");
		    					System.out.println("Du van och gissade att ordet var " + correctWord + " som " + name + " definerade för oss!");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Det tog dig: ");
		    					System.out.print("\n"); 
		    					int totalAwnsers = wrongAnswers+rightAnswers; //Jag ursrungligen tänkte att guessed och wrong skulle getter rightawnser och wrogn awnsers, men av två orsak att jag inte använde mig av dessa variabler var att först det skulle vara 
		    					//stökikgt med såna långa namn och att jag helt enkelt glömde att använda dom. Men jag ville när jag var klar med hela programet ändra dom tillbaka, men tyvärr hade jag inte tid då.
		    					System.out.println("Totala försök: " + totalAwnsers); //här är det info som kommer
		    					System.out.println("Fel svar: " + wrongAnswers);
		    					System.out.println("Rätt svar: " + rightAnswers);
		    					System.out.println("Du hade: " + triesLeft + " försök kvar");
		    					
		    					System.out.print("\n"); 
		    					System.out.println("Dina instälningar var:");
		    					System.out.print("\n"); 
		    					
		    					System.out.println("En/två-spelarsläge: Två");
		    					if(sentencesOrWords = true) { //baserad på vilka instälningar man har valt ska inställningar ochså visas som feedback så man kan se dom.
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
		    					if(sentencesOrWords = true) { //Om det är ord som man angett
		    						System.out.println("Ord/meningar: Ord ");
		    					}
		    					if(sentencesOrWords = false) { //Om det är meningar som man angett
		    						System.out.println("Ord/meningar: Meningar");
		    					}
		    					System.out.println("Definerad av: " + secondPlayerName);
		    					System.out.println("Gissat fram av: " + name);
		    					//samma kod som som förrut
		    				}
		    			}
		    			if(selfDefining = true) { //om spelarena slumpade eller valde ett ord
		    				//måste ha fler ifsatser men hann inte med det och koden ochså
		    			}
		    		}
		    		if (oneOrTwoPlayers = false) { //om det är enspelare läge
		    			//måste ha fler ifsatser men hann inte med det och koden ochså
		    		}
		    		
		    	}
		    	
                if(wonOrNot = false) { //om man inte vann
		    		//blev inte klar med koden för den, men mycket samma som true bara olika outputs av inställningar
		    	}
		    	
		    	
		    	
		    }
		    
		    public static void restartOrNot(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, boolean playerGuessing, int degreeOfDifficulty) {
		    	String svar1A = "Igen";
		        String svar1B = "igen";
		        String svar2A = "avsluta";
		        String svar2B = "Avsluta";
		    	
		    	System.out.println("Nu, är spelet över, men vill ni avsluta spelet eller köra igen? (igen/avsluta)");
		    	//Nu ska man välja om man vill köra igen eller avsluta spelet, använder samma metod som jag gjorde innan
		    	
		    	Scanner input = new Scanner(System.in);
		    	String svar = input.nextLine();
		    	
		    	if(svar.contentEquals(svar1A) || svar.contentEquals(svar1B)) {
		    		if (oneOrTwoPlayers = true) {
		    			if(sentencesOrWords = true ) {
		    				if(selfDefining = false) //här skulle det vara fler ifsatser som skulle bestämma vad metodanropningen till restartButAtWhatPoint ska vara, men hann aldrig så långt
		    				System.out.println("Ok!");
		    			}
		    			
		    		}
		    		
		    		if (oneOrTwoPlayers = false) {
		    			System.out.println("Ok!"); //samma saker som övan
		    		}
		    		
		    	}
		    	
		    	if(svar.contentEquals(svar2A) || svar.contentEquals(svar2B)) {
		    		System.out.println("Ok! Hejdå!");
		    		 System.exit(0); //Om spelarna/spelare vill avsluta programet avslutas spelet här då.
		    	}
		    	
		    }
		    
		    public static void restartButAtWhatPoint(String name, boolean oneOrTwoPlayers, String secondPlayerName, boolean sentencesOrWords, boolean selfDefining, String correctWord, boolean playerGuessing, String progress, int wrongAnswers, int rightAnswers, int triesLeft, int wrong, int degreeOfDifficulty, boolean wonOrNot ) {
		    	System.out.println("Var vill du/ni börja om någonstans?");
		    	//här ska det vara olika val beroende på vilka inställningar man har angett, beroende på dessa svar ska spelet startas om vid en punkt där man vill.
		    	
		    }
		 
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
}
		    
            
	    		
		    	
	



	
	
	
	

	
	
	
