package drugizestawzadania;
import java.util.Scanner;


public class Zadanie5 {

	public static void main(String[] args)
	{
		
		

		
		Scanner reader = new Scanner(System.in);
		
		int suma=0;
		int a=0;
		
		
		
		do
		{
			System.out.println("Podaj liczbê z ci¹gu");
		
			a= reader.nextInt();
			suma=suma+a;
		
		}	
		while(a!=0);
		
		System.out.println(suma);
			
	}
}

