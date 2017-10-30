package drugizestawzadania;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args)
	{
		
		int a;
		
		System.out.println("Podaj dowoln¹, dodatni¹ liczbê ca³kowit¹");
		
		Scanner reader = new Scanner(System.in);
		  
        a = reader.nextInt();
		
		for (int suma=-1; suma<a-1;)
		{
			suma=suma+2;
			System.out.println(suma);
			
		}
		
		
		
	}

}

