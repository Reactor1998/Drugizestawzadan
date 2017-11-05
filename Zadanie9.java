package drugizestawzadania;
import java.util.Scanner;
import java.lang.Math;



public class Zadanie9 {

	public static void main(String[] args)
	{
		Scanner czytaj= new Scanner(System.in);
		System.out.println("Podaj liczbe");
		int liczba=czytaj.nextInt();
		
		
		boolean pierwsza=true;
		
		 for(int i=2;i<= Math.sqrt(liczba);i++)
		{
			
			 if(liczba%i==0)
			{
				pierwsza=false;
				break;
				
			}
			
			pierwsza= true;
		}
		
		System.out.print(pierwsza);
}
}
