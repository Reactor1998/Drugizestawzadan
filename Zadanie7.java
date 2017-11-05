package drugizestawzadania;
import java.util.Scanner;


public class Zadanie7 {

	public static void main(String[] args)
	{
		
		

		
		Scanner reader = new Scanner(System.in);
	
	int szerokosc;
	int dlugosc;
	int x;
	int y;
	char znak;
	
			System.out.println("Podaj d³ugoœæ a i b");
		
			szerokosc= reader.nextInt();
			dlugosc= reader.nextInt();
		
		
			System.out.println("Podaj pozycje x i y");
			x= reader.nextInt();
			y= reader.nextInt();
			
			System.out.println("Podaj znak z którego stworzyæ prostok¹t");
			
			 znak = reader.next().charAt(0);
			 
			 for(int i=0;i<y-1;i++)
			 {
				 System.out.println(">");
			 }
			 
			 for(int l=0;l<dlugosc;l++)
			 {
				 for (int j=0;j<x-1;j++)
				 {
					 System.out.print("_ ");
					 	 
				 }
				 for(int k=0;k<szerokosc;k++)
				 {
					 System.out.print(znak);
				 }
				 System.out.println();
			 }
	}
}

			