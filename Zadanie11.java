package drugizestawzadania;
import java.util.Scanner;



public class Zadanie11 {

	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner(System.in);
		
		System.out.println("Podaj dlugosc podstawy choinki");
		
		int wysokosc= czytaj.nextInt();
		
		
		for (int i = 0; i < wysokosc; i++) {
		      for (int j = 0; j < wysokosc - i; j++) {
		        System.out.print(" ");
		      }
		      for (int j = 0; j <= i*2 ; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }

	}

}
