package assignment1;

import java.util.Scanner;

public class Prog60limitPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int limit = sc.nextInt();
		
        int count=0;
        System.out.println("ENter the perfect number "+limit+" is: ");
        
        for(int num=1;num<limit;num++) {
        
        	int sum=0;
        	
        	for(int i=1;i<=num/2;i++) {
        		if(num%i==0) {
        			sum+=i;
        		}
        	}
        	
        	if(sum==num) {
        		System.out.println(num+" ");
        		count++;
        		
        	}
        	
        }
        
        
        System.out.println("\nTotal perfect numbers found:"+count);
		
		
	}

}
