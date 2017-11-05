package drugizestawzadania;
import java.util.Scanner;
import java.util.Random;


public class Zadanie6 {

	public static void main(String[] args) {
	
		Scanner czytaj= new Scanner(System.in);
		
		Random r = new Random();
		 
		 int a=r.nextInt(101);
		 System.out.println(a);
		 
		 System.out.println("Zgadnij o jakiej liczbie pomysla³em");
		 
		 int b= czytaj.nextInt();
		 
		 do
		 {
			
			 
			 if(a>b)
			 {
				 
				 System.out.println("Poda³es za ma³¹ wartoœæ");
				  b= czytaj.nextInt();
			 }
			 
			 else
			 {
				 System.out.println("Poda³eœ za du¿¹ wartoœæ");
				  b= czytaj.nextInt();
			 }
		 }
		 
		 while(a!=b);
		 
		 System.out.println("Gratulacje, gra sie koñczy");
		 		System.out.println(a);
				 
		

	}

}
