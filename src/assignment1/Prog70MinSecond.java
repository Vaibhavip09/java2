package assignment1;

import java.util.Scanner;

public class Prog70MinSecond {

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
		    
		    int firstMin=arr[0];
		    int secondMin=arr[0];
		    
		    
		    for(int i=1;i<n;i++) {
		    	if(arr[i]<firstMin) {
		    		firstMin = arr[i];
		    	}
		    }
		    
		    boolean findsecond=false;
		    for(int i=0;i<n;i++) {
		    	if(arr[i]>firstMin) {
		    		if(!findsecond|| arr[i]<secondMin) {
		    			secondMin=arr[i];
		    			findsecond = true;
		    		}
		    	}
		    }
		    
		    
		    
		   
		    System.out.println("Miniimum number is: " + firstMin);
	        if (findsecond) {
	            System.out.println("Second Smalller number is: " + secondMin);
	        } else {
	            System.out.println("No second largest number found.");
	        }		    
	}

}
