package drugizestawzadania;
import java.util.Scanner;



public class Zadanie12 {

	public static void main(String[] args) {
		
		Scanner czytaj = new Scanner(System.in);
		
		System.out.println("Podaj cenê w kolejnosci: ilosc zlotych, ilosc groszy");
		
		int zlotowki= czytaj.nextInt();
		int grosze=czytaj.nextInt();
		int ilosc_z;
		int ilosc_g;
	
		
		
		
		
		if(zlotowki>=5)
		{
			
			ilosc_z=zlotowki/5;
			
			System.out.println(ilosc_z+"*5zl");
			zlotowki=zlotowki-(ilosc_z*5);
		}
		
		if(zlotowki>=2)
		{
			ilosc_z=zlotowki/2;
			
			System.out.println(ilosc_z+"*2zl");
			zlotowki=zlotowki-(ilosc_z*2);
		}
		if(zlotowki>=1)
		{
			ilosc_z=zlotowki/1;
			System.out.println(ilosc_z+"*1z³");
		}
		
		if(grosze>=50)
		{
			ilosc_g=grosze/50;
			System.out.println(ilosc_g+"*50gr");
			grosze=grosze-(ilosc_g*50);
			
		}
		if(grosze>=20)
		{
			ilosc_g=grosze/20;
			System.out.println(ilosc_g+"*20gr");
			grosze=grosze-(ilosc_g*20);
			
		}
		if(grosze>=10)
		{
			ilosc_g=grosze/10;
			System.out.println(ilosc_g+"*10gr");
			grosze=grosze-(ilosc_g*10);
			
		}
		
		if(grosze>=5)
		{
			ilosc_g=grosze/5;
			System.out.println(ilosc_g+"*5gr");
			grosze=grosze-(ilosc_g*5);
			
		}
		if(grosze>=2)
		{
			ilosc_g=grosze/2;
			System.out.println(ilosc_g+"*2gr");
			grosze=grosze-(ilosc_g*2);
			
		}
		if(grosze>=1)
		{
			ilosc_g=grosze/1;
			System.out.println(ilosc_g+"*1gr");
			grosze=grosze-(ilosc_g*1);
			
		}
		
		
		
		
	}
}