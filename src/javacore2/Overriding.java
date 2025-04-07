package javacore2;
class Whatapp1{
	private int phoneNo;
	private String name;

   public Whatapp1(int phoneNo,String name) {
	 this.phoneNo = phoneNo;
	 this.name = name;
	   
   }
   
   public void APP() {
	   System.out.println("Welcome To Whatsapp!!");
	   System.out.println("Whatapp PhoneNo:"+phoneNo);
	   System.out.println("Whatapp Name:"+name);
   }
   //method overloading
   public void APP(String chat) {
	   System.out.println("Welcome To Whatsapp!!");
	   System.out.println("Whatapp PhoneNo:"+phoneNo);
	   System.out.println("Whatapp Name:"+name);
	   System.out.println("Your Chat Details:"+chat);
   }
   
   public void APP(int...call) {
	   int count=0;
	   for(int x: call) {
		   count++;
		   System.out.println("Recieved calls from:"+x);
	   }
	   System.out.println("Received calls:"+count);
   }
   
   public void APP(String name, String status) {
	System.out.println("WhatApp Name:"+name);
	System.out.println("WhatApp Status:"+status);
   }

}





public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Whatapp1 w1 = new Whatapp1(7643988,"Jemes Bond");
	      // w1.APP();
	       
	       System.out.println("***********");
	      // w1.APP("Hello How you are doing");
	       
	       w1.APP(627846,8399094);
	      
	       System.out.println("***********");
	       w1.APP("Neha", "Vaibhavi");
	}

}
