package drugizestawzadania;
import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int suma=0;
		int licznik=0;
		int wynik=0;
	
System.out.println("Podaj pierwsz¹ liczbê");
		
		Scanner reader = new Scanner(System.in);
		  
        a = reader.nextInt();
        
        System.out.println("Podaj drug¹ liczbê");
       
        b = reader.nextInt();
        suma=0;
        wynik=0;
        licznik=0;
        
        
        while(wynik<b)
        {
        	wynik=a+licznik;
        	suma=suma+wynik;
        	licznik=licznik+1;
       
 	
        } 	
       
        System.out.println(suma);
       
        suma=0;
        wynik=0;
        licznik=0;
	
	do
	{
		wynik=a+licznik;
    	suma=suma+wynik;
    	licznik=licznik+1;
	}
	while(wynik<b);
		System.out.println(suma);
		
		
		licznik=0;
		suma=0;
		
		for(wynik=0;wynik<b;licznik++)
		{
		
			wynik=a+licznik;
	    	suma=suma+wynik;
		}
		System.out.println(suma);
		
	}		
}


		
	


