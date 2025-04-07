package javacore2;

class Whatapp{
	private int phoneNo;
	private String name;

   public Whatapp(int phoneNo,String name) {
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

}



public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Whatapp w1 = new Whatapp(7643988,"Jemes Bond");
      // w1.APP();
       
       System.out.println("***********");
       w1.APP("Hello How you are doing");
	}

}
