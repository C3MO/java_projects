//Erste Person
public class testclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int breite = 80;
		int hoehe = 10;
		int abstand = 40;

		// Name, Adresse1, Adresse2 für verschiedene Leute
		String name     = "Anna Alt";
		String adresse1 = "Spaß-Str. 123";
		String adresse2 = "13353 Berlin";

		/*String name2     = "Sebastian Wittenberg";
		String adresse3 = "Lange-Lange-Str. 200";
		String adresse4 = "06886 Wittenberg";

		String name3     = "Java Cafe";
		String adresse6 = "Am Campus 15";
		String adresse5 = "69115 Heidelberg";
		*/
		//-------------------------------------------







		// Waagerechter rand oben
		String waagerechterRand = "+";
		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand + "+";
		System.out.println(waagerechterRand);



		//-------------------------------------------
		// 4 Zeilen ohne Text
		String leereZeichen = " ";
		while (leereZeichen.length() < breite -2){
			leereZeichen = leereZeichen +" ";

		}
		leereZeichen = "|"+leereZeichen+"|";
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);

		//-------------------------------------------
		// Zeile für Name
		for (int i =0; i< abstand -2; i++){
			name = " " + name;

		}
		name = "|" + name;
		while (name.length() < breite - 1){
			name = name + " ";
		}
		name = name + "|";

		System.out.println(name);



		//-------------------------------------------
		// Zeile für 1. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse1 = " " + adresse1;

		}

		adresse1 = "|" + adresse1;
		while (adresse1.length() < breite - 1){
			adresse1 = adresse1 + " ";
		}
		adresse1 = adresse1 + "|";

		System.out.println(adresse1);
		//-------------------------------------------
		// Zeile für 2. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse2 = " " + adresse2;

		}

		adresse2 = "|" + adresse2;
		while (adresse2.length() < breite - 1){
			adresse2 = adresse2 + " ";
		}
		adresse2 = adresse2 + "|";

		System.out.println(adresse2);

		//-------------------------------------------
		// 1 Zeile ohne Text
		String leereZeichen2 = " ";
		while (leereZeichen2.length() < breite -2){
			leereZeichen2 = leereZeichen2 +" ";

		}
		leereZeichen2 = "|"+leereZeichen2+"|";
		System.out.println(leereZeichen2);

		//-------------------------------------------
		// Waagerechter rand unten

		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand;
		System.out.println(waagerechterRand);

	}

}



//Zweite Person
public class testclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int breite = 80;
		int hoehe = 10;
		int abstand = 40;

		/* Name, Adresse1, Adresse2 für verschiedene Leute
		String name     = "Anna Alt";
		String adresse1 = "Spaß-Str. 123";
		String adresse2 = "13353 Berlin";
		*/
		String name     = "Sebastian Wittenberg";
		String adresse1 = "Lange-Lange-Str. 200";
		String adresse2 = "06886 Wittenberg";
		/*
		String name3     = "Java Cafe";
		String adresse6 = "Am Campus 15";
		String adresse5 = "69115 Heidelberg";
		*/
		//-------------------------------------------

		// Waagerechter rand oben
		String waagerechterRand = "+";
		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand + "+";
		System.out.println(waagerechterRand);



		//-------------------------------------------
		// 4 Zeilen ohne Text
		String leereZeichen = " ";
		while (leereZeichen.length() < breite -2){
			leereZeichen = leereZeichen +" ";

		}
		leereZeichen = "|"+leereZeichen+"|";
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);

		//-------------------------------------------
		// Zeile für Name
		for (int i =0; i< abstand -2; i++){
			name = " " + name;

		}
		name = "|" + name;
		while (name.length() < breite - 1){
			name = name + " ";
		}
		name = name + "|";

		System.out.println(name);



		//-------------------------------------------
		// Zeile für 1. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse1 = " " + adresse1;

		}

		adresse1 = "|" + adresse1;
		while (adresse1.length() < breite - 1){
			adresse1 = adresse1 + " ";
		}
		adresse1 = adresse1 + "|";

		System.out.println(adresse1);
		//-------------------------------------------
		// Zeile für 2. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse2 = " " + adresse2;

		}

		adresse2 = "|" + adresse2;
		while (adresse2.length() < breite - 1){
			adresse2 = adresse2 + " ";
		}
		adresse2 = adresse2 + "|";

		System.out.println(adresse2);

		//-------------------------------------------
		// 1 Zeile ohne Text
		String leereZeichen2 = " ";
		while (leereZeichen2.length() < breite -2){
			leereZeichen2 = leereZeichen2 +" ";

		}
		leereZeichen2 = "|"+leereZeichen2+"|";
		System.out.println(leereZeichen2);

		//-------------------------------------------
		// Waagerechter rand unten

		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand;
		System.out.println(waagerechterRand);

	}




	}


//Dritte Person
public class testclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int breite = 80;
		int hoehe = 10;
		int abstand = 40;
		/*
		// Name, Adresse1, Adresse2 für verschiedene Leute
		String name     = "Anna Alt";
		String adresse1 = "Spaß-Str. 123";
		String adresse2 = "13353 Berlin";

		String name2     = "Sebastian Wittenberg";
		String adresse3 = "Lange-Lange-Str. 200";
		String adresse4 = "06886 Wittenberg";
		*/
		String name     = "Java Cafe";
		String adresse1 = "Am Campus 15";
		String adresse2 = "69115 Heidelberg";

		//-------------------------------------------







		// Waagerechter rand oben
		String waagerechterRand = "+";
		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand + "+";
		System.out.println(waagerechterRand);



		//-------------------------------------------
		// 4 Zeilen ohne Text
		String leereZeichen = " ";
		while (leereZeichen.length() < breite -2){
			leereZeichen = leereZeichen +" ";

		}
		leereZeichen = "|"+leereZeichen+"|";
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);
		System.out.println(leereZeichen);

		//-------------------------------------------
		// Zeile für Name
		for (int i =0; i< abstand -2; i++){
			name = " " + name;

		}
		name = "|" + name;
		while (name.length() < breite - 1){
			name = name + " ";
		}
		name = name + "|";

		System.out.println(name);



		//-------------------------------------------
		// Zeile für 1. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse1 = " " + adresse1;

		}

		adresse1 = "|" + adresse1;
		while (adresse1.length() < breite - 1){
			adresse1 = adresse1 + " ";
		}
		adresse1 = adresse1 + "|";

		System.out.println(adresse1);
		//-------------------------------------------
		// Zeile für 2. Adresse Zeile
		for (int i =0; i< abstand -2; i++){
			adresse2 = " " + adresse2;

		}

		adresse2 = "|" + adresse2;
		while (adresse2.length() < breite - 1){
			adresse2 = adresse2 + " ";
		}
		adresse2 = adresse2 + "|";

		System.out.println(adresse2);

		//-------------------------------------------
		// 1 Zeile ohne Text
		String leereZeichen2 = " ";
		while (leereZeichen2.length() < breite -2){
			leereZeichen2 = leereZeichen2 +" ";

		}
		leereZeichen2 = "|"+leereZeichen2+"|";
		System.out.println(leereZeichen2);

		//-------------------------------------------
		// Waagerechter rand unten

		while (waagerechterRand.length() < breite - 1){
			waagerechterRand = waagerechterRand + "-";
		}
		waagerechterRand = waagerechterRand;
		System.out.println(waagerechterRand);

	}

}
