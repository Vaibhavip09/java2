package javacore2;

import java.util.Scanner;

interface Resturent{
	void menu();
	void bill();
}
class SonshoDhaba implements Resturent{
	public void menu() {
		while(true) {
		System.out.println("Welcome To Menu!!");
		System.out.println("Press 1 for veg");
		System.out.println("Press 2 for chiynis");
		System.out.println("Press 3 for Exit");
		
	
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice:");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Welcome To Veg Menu!!");
			System.out.println("Puran Poli");
			System.out.println("Parata");
			System.out.println("Puri Bhajii");
			System.out.println("Gulabjamun");
			System.out.println("Chapati Bhaji");
			
			
		
		case 3 :
			System.exit(0);
			System.out.println("Exit");
			
		}
		}
	}
	public void bill() {
		
		System.out.println("Prize is");
		System.out.println("PuranPoli prize is:"+100);
		System.out.println("Puri Bhajii prize is:"+200);
		System.out.println("Gulabjamun prize is:"+300);
		System.out.println("Chapati Bhaji prize is:"+150);
		
	}
}

class SuhaniDhaba implements Resturent{
	public void menu() {
		System.out.println();
		while(true) {
			System.out.println("Welcome To Menu!!");
			System.out.println("Press 1 for veg");
			System.out.println("Press 2 for chiynis");
			System.out.println("Press 3 for Exit");
			
			int choice;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			switch(choice) {	
	case 2:
		System.out.println("Welcome To chiynis Menu!!");
		System.out.println("Pizza");
		System.out.println("Barger");
		System.out.println("Nuddles");
		System.out.println("Manchurian");
		System.out.println();
		
		
		}	
		}
	}
	
	public void menu(String Nonvej_Manchurian) {
		System.out.println();
		System.out.println("Welcome To chiynis Menu!!");
		System.out.println("Pizza");
		System.out.println("Barger");
		System.out.println("Nuddles");
		System.out.println("Manchurian");
		System.out.println(" NonVej_Manchurian");
		System.out.println();	
		
	}
	public void bill() {
		System.out.println("Pizza prize is:"+180);
		System.out.println("Barger prize is:"+250);
		System.out.println("Nuddles prize is:"+160);
		System.out.println("Manchurian prize is:"+190);
		
	}
	
	public void bill(int Nonvej_Manchurian) {
		System.out.println("Pizza prize is:"+180);
		System.out.println("Barger prize is:"+250);
		System.out.println("Nuddles prize is:"+160);
		System.out.println("vej_Manchurian prize is:"+190);
		System.out.println("Nonvej_Manchurian prize is:"+290);
		
	}
}
public class InterFacePro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SonshoDhaba obj3 = new SonshoDhaba();
		obj3.menu();
		obj3.bill();
		
		//SuhaniDhaba obj4 = new SuhaniDhaba();
		//obj4.menu();
		//obj4.bill();
		
		
		//Resturent obj1 = new SonshoDhaba();
		//obj1.menu();
		//obj1.bill();
		
		//Resturent obj2 = new SuhaniDhaba() ;
		//obj2.menu();
		//obj2.bill();
		
	}

}
