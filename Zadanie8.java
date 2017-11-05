package drugizestawzadania;
import java.util.Scanner;

public class Zadanie8 {

	public static void main(String[] args) 
	{

		System.out.println("Podaj liczbe ,  której chcesz wyœwietliæ dzielniki ");
		
		Scanner czytaj = new Scanner(System.in);
		
		int a=czytaj.nextInt();
		
		for(int i=1;i<a;i++)
		{
			
			if(a%i==0)
			{
				System.out.println(a/i);
			}
		}

	}

}
