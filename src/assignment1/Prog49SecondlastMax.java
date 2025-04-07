package assignment1;

import java.util.Scanner;

public class Prog49SecondlastMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = new int[5];
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the Array size:");
		    int n = sc.nextInt();
		 
		    
		    System.out.println("Enter the Array Number:");
		    for(int i=0;i<n;i++) {
		    	arr[i] = sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++) { 	
		   System.out.println(arr[i]+" ");
		    }
		    
		    System.out.println();
		    
		    int firstMax=arr[0];
		    int secondMax=arr[0];
		    
		    
		    for(int i=1;i<n;i++) {
		    	if(arr[i]>firstMax) {
		    		firstMax = arr[i];
		    	}
		    }
		    
		    boolean findsecond=false;
		    for(int i=0;i<n;i++) {
		    	if(arr[i]<firstMax) {
		    		if(!findsecond|| arr[i]>secondMax) {
		    			secondMax=arr[i];
		    			findsecond = true;
		    		}
		    	}
		    }
		    
		    
		    
		   
		    System.out.println("Maximum number is: " + firstMax);
	        if (findsecond) {
	            System.out.println("Second largest number is: " + secondMax);
	        } else {
	            System.out.println("No second largest number found.");
	        }		    
		
		
	}

}
