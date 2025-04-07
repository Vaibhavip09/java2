package assignment1;

import java.util.Scanner;

public class Prog12AMINMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] M = new int[5];
		
		for(int i=0;i<=4;i++) {
			System.out.print("Enter the Array elements:");
			M[i] = sc.nextInt();
		}
		
		for(int i=0;i<=4;i++) {
			System.out.print(M[i]+ " ");
			
		}
		System.out.println();
		
		int MAX = M[0];
		int MIN=M[0];
		int MaxIdex =0;
		int MinIdex =0;
		
		for(int i=1;i<=4;i++) {
			if(M[i]>MAX) {	
			MAX =M[i];
			MaxIdex=i;
			}
			
			if(M[i]<MIN) {	
				MIN =M[i];
				MinIdex=i;
				}
			
			
		}
		 System.out.println("Max number is:"+MAX +" at index:"+MaxIdex);	
		 
	
		 System.out.println("MIN number is:"+MIN +" at index:"+MinIdex );	
	}

}
