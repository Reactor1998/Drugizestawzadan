package drugizestawzadania;
import java.util.Scanner;
import java.util.Random;


public class Zadanie6 {

	public static void main(String[] args) {
	
		Scanner czytaj= new Scanner(System.in);
		
		Random r = new Random();
		 
		 int a=r.nextInt(101);
		 System.out.println(a);
		 
		 System.out.println("Zgadnij o jakiej liczbie pomysla�em");
		 
		 int b= czytaj.nextInt();
		 
		 do
		 {
			
			 
			 if(a>b)
			 {
				 
				 System.out.println("Poda�es za ma�� warto��");
				  b= czytaj.nextInt();
			 }
			 
			 else
			 {
				 System.out.println("Poda�e� za du�� warto��");
				  b= czytaj.nextInt();
			 }
		 }
		 
		 while(a!=b);
		 
		 System.out.println("Gratulacje, gra sie ko�czy");
		 		System.out.println(a);
				 
		

	}

}
