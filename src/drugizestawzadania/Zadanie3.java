package drugizestawzadania;
import java.util.Scanner;


public class Zadanie3 {

	public static void main(String[] args)
	{
		
		
		int a;
		
		System.out.println("Podaj liczb� ca�kowit�, do kt�rej mam liczy� pot�gi liczby 2");
		
		Scanner reader = new Scanner(System.in);
		a= reader.nextInt();
		
		int liczba=1;
		
		
		while(liczba<a/2)
		{
			
			liczba=liczba*2;
			
			System.out.println(liczba);
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
