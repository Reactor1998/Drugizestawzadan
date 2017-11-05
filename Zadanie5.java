package drugizestawzadania;
import java.util.Scanner;


public class Zadanie5 {

	public static void main(String[] args)
	{
		
		

		
		Scanner reader = new Scanner(System.in);
		
		int suma=0;
		int a;
		int min;
		int max;
		int srednia=0;
		int licznik=0;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		
		 
		
		
				
		
		
		do
		{
			System.out.println("Podaj liczbê z ci¹gu");
		
			a= reader.nextInt();
			licznik=licznik+1;
			suma=suma+a;
			srednia=(suma)/licznik;
		
			
			
		if(a>max)
		{
			max=a;
		}
		if (a<min)
		{
			min=a;
		}
			
		
		}	
		while(a!=0);
		
		System.out.println("Suma liczb wynosi:");
		System.out.println(suma);
		System.out.println(max);
		System.out.println(min);
		System.out.println(srednia);
			
	}
}

