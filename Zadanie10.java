package drugizestawzadania;
import java.util.Scanner;
import java.lang.Math;



public class Zadanie10 
{

	public static void main(String[] args)
	{
		Scanner czytaj= new Scanner(System.in);
		System.out.println("Podaj liczbe ca³kowit¹");
		int a = czytaj.nextInt();
		int cyfra;
		int suma=0;
		double nieparzyste=0;
		double parzyste=0;
		int n=0;
		int p=0;
		double stosunek;
		
		
		{
			while(a!=0)
			{
			 
			cyfra= a%10;
			if(cyfra%2==0)
			{
				parzyste=parzyste+cyfra;
				p=p+1;
						
			}
			else
			{
				nieparzyste=nieparzyste + cyfra;
				n=n+1;
			}
			suma=suma+cyfra;
			System.out.println(cyfra);
			
			a=a/10;
			
			
		}
		
	}	
		//System.out.println("parzyste:"+parzyste);
		//System.out.println(p);
	//	System.out.println("nieparzyste:"+nieparzyste);
		//System.out.println(n);
		System.out.println("Suma cyfr wynosi: "+ suma);
		//System.out.println(parzyste/p);
		//System.out.println(nieparzyste/n);
		stosunek= (parzyste/p)/(nieparzyste/n);
		System.out.println("Stosunek wynosi: "+ stosunek);
		
	}
}