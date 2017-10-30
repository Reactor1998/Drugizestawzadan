package drugizestawzadania;
import java.util.Scanner;


public class Zadanie4 {

	public static void main(String[] args)
	{
		
		

		
		Scanner reader = new Scanner(System.in);
		
		int suma=0;
		int a=0;
		
		
		
		do
		{
			System.out.println("Podaj liczbê któr¹ chcesz dodac");
		
			a= reader.nextInt();
			suma=suma+a;
		
		}	
		while(a!=0);
		
		System.out.println(suma);
			
	}
}

