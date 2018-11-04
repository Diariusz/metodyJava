package pakiet_kurs;

import java.util.Arrays;
import java.util.Scanner;
public class Metody {

	//1
	static int age;
	static String name;
	static double liczba1;
	static double liczba2;
	static int liczba3;
	//5
	static double liczba4;
	//6
	double liczba5 = -76.9;
	//7
	
	
	public static void main(String[] args) {
		
		  
		  Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		  System.out.println("Podaj Twoje imiê ...");
		 // String imie = odczyt.nextLine();
		 // name = imie;
		 // System.out.println("jeszcze Twój wiek jako liczba ca³kowita ");
		 // age = odczyt.nextInt();
		 // System.out.println("Czeœæ "+getName()+", masz "+getAge()+" lat, staruszku ;)");
		  System.out.println("Podaj dwie liczby a podam Ci ich sumê, ró¿nicê i iloczyn");
		  System.out.print("Pierwsza liczba ...");
		  liczba1 = odczyt.nextDouble();
		  System.out.print("Druga liczba ...");
		  liczba2 = odczyt.nextDouble();
		  System.out.println("Suma liczb "+getSuma(liczba1,liczba2));
		  System.out.println("Róznica liczb "+getRoznica(liczba1,liczba2));
		  System.out.println("Iloczyn liczb "+getIloczyn(liczba1,liczba2));
		  System.out.print("Teraz sprawdzê czy poda³eœ mi liczbê parzyst¹ - wpisz liczbê ...");
		  liczba3 = odczyt.nextInt();
		  System.out.println("Twoja liczba jest "+getStan(liczba3));
		  System.out.print("Kolejnym krokiem bêdzie sprawdzenie podzielnoœci przez 3 i przez 5 tylko musisz mi podaæ liczbê ...");
		  liczba3 = odczyt.nextInt();
		  System.out.println("Twoja liczba jest "+getStanPodzielnosc(liczba3));
		  System.out.print("Podaj liczbê to podniosê j¹ do trzeciej potêgi ");
		  liczba2 = odczyt.nextDouble();
		  System.out.println("Liczba "+liczba2+" do 3 potêgi = "+getPow(liczba2));
		  System.out.println("Pierwiastek kwadratowy z liczby "+liczba2+" "+getSqrt(liczba2));
		  System.out.println("Podaj trzy odcinki boków trójk¹ta - sprawdzê czy da siê z nich zbudowaæ trójk¹t prostok¹tny");
		  System.out.print("Pierwszy odcinek ...");
		  liczba1 = odczyt.nextDouble();
		  System.out.print("Drugi odcinek ...");
		  liczba2 = odczyt.nextDouble();
		  System.out.print("trzeci odcinek  ...");
		  liczba4 = odczyt.nextDouble();
		  System.out.println(getPitagoras(liczba1,liczba2,liczba4));
		  
	}
	
	public static String getPitagoras(double liczba1, double liczba2, double liczba4) {
		String wynik = "";
		
		double[] liczby = {liczba1, liczba2, liczba4};
		Arrays.sort(liczby);
		
		if ((liczby[0]>0)&&(liczby[1]>0)&&(liczby[2]>0)) {
			double a = getIloczyn(liczby[0],liczby[0]);
			double b = getIloczyn(liczby[1],liczby[1]);
			double c = getIloczyn(liczby[2],liczby[2]);
			if ((a+b)==c) {
				wynik = "Z podanych boków mo¿na stworzyæ trójk¹t prostok¹tny";
			} else {
				wynik = "Z podanych boków nie mo¿na stworzyæ trójk¹ta prostok¹tnego";
			}
			
		} else {
			wynik = "¯aden z boków nie mo¿e byæ ujemny :) ";
		}
		return wynik;
	}

	public static String getName() {
		return name;
	}

	public static int getAge() {
		return age;
	}
	
	public static double getSuma(double liczba1, double liczba2) {
		double suma = liczba1 + liczba2; 
		return suma;
	}
	
	public static double getRoznica(double liczba1, double liczba2) {
		double roznica = liczba1 - liczba2; 
		return roznica;
	}
	
	public static double getIloczyn(double liczba1, double liczba2) {
		double iloczyn = liczba1 * liczba2; 
		return iloczyn;
	}
	
	public static String getStan(int liczba) {
		
		String wynik = "";
		int reszta = liczba%2;
		if (reszta==1) {
			wynik = "nieparzysta";
		} else {
			wynik = "parzysta";
		}
		
		return wynik;
	}
	
	public static String getStanPodzielnosc(int liczba) {
		
		String wynik = "";
		int reszta = liczba%15;
		int reszta3 = liczba%3;
		int reszta5 = liczba%5;
		if (reszta==0) { wynik = "Liczba da siê podzieliæ jednoczeœnie przez 3 i 5";	}
		else if (reszta3==0){ wynik = "Liczba da siê podzieliæ tylko przez 3, przez 5 niestety ";}
		else if (reszta5==0){ wynik = "Liczba da siê podzieliæ tylko przez 5, przez 3 niestety";}
		else {wynik = "Liczba niepodzielna przez 3 lub 5";}	

		return wynik;
	}
	
	public static String getSqrt(double liczba) {
		
		String wynik = "";
		if (liczba >=0) {
			double pierwiastek = Math.sqrt(liczba);
			wynik = "wynosi "+pierwiastek;	
			}
		else {
			wynik = "nie istnieje w dziedzinie liczb rzeczywistych. ";
		}

		return wynik;
	}
		
	public static double getPow(double liczba1) {
		double wynik = Math.pow(liczba1, 3); 
		return wynik;
	}

	
}
