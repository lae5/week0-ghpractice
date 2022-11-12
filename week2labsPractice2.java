package labsPractice2;

import java.util.Scanner;

public class week2labsPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		System.out.println(age >= 16); //false
		
		age = 16;
		System.out.println(age >=16);
		
		boolean hasLicense = true;
		
		if(age >=16 && hasLicense) {
			System.out.println("You can drive!");
			
		}else {
			System.out.println("You cannot drive!");
		}
		double costOfMilk = 2.50;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please!");
			
		}else; 
			System.out.println("No thanks!");
	
	   
	    int numberOfCookies = 6;
		int numberOfChildren = 2;
 
		int remainingCookies = numberOfCookies % numberOfChildren;
		
        if (remainingCookies == 0) {
			System.out.println("Sad Face");
			
		}else if (remainingCookies < 2) {
			System.out.println("Yes!");
		}else if (remainingCookies < 5) {
			System.out.println("Whoohooo!");
		}  
        String loyaltyMemberStatus = "SILVER";
        double loyaltyMemberDiscount = 0.0;
        
        switch (loyaltyMemberStatus) {
        case "SILVER":
        		loyaltyMemberDiscount = .10;
        break;
        case "GOLD":
    		loyaltyMemberDiscount = .15;
    	break;
        case "PLATINUM":
    		loyaltyMemberDiscount = .25;
    	break;
        
        }
        double billTotal = 150.0;
        double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
        System.out.println(adjustedTotal);
        
        if (adjustedTotal > 50) {
        	if (loyaltyMemberStatus == "SILVER") {
        		loyaltyMemberStatus = "GOLD";
        	}else if (loyaltyMemberStatus == "GOLD") {
        		loyaltyMemberStatus = "PLATINUM";
        		
        }
        
        
        
}		  System.out.println(loyaltyMemberStatus);
		

		  String username = "Tommy123" ;
		  String password = "12345";
		  
		  if (username == "Tommy123" && password == "12345") {
			  System.out.println("Login successful");
			  
		  }else {
			  System.out.println("Access denied");
		  }
		  
		  
		  int i = 0;
		  
		  for (i = 0; i<9; i++) {
			  System.out.println(i);
		  }
		  for (i = 10; i >= 0; i--) {
			  System.out.println(i);
		  }
		  for (i = 0; i <= 100; i += 2) {
			  System.out.println(i);
		  }
		  for (i = 0; i <= 100; i++) {
			  if (i % 2 == 0 ) {
				  System.out.println(i + "EVEN");
			  }else {
				  System.out.println(i + "ODD");
			  }
		  }
//		  int x = 100;
//		  while (x > 0) {
//			  System.out.println(x);
//			  x--;
	//	  }
		  int x = 100;
		  while (x > 0) {
			  System.out.println(x + " " + (x % 3));
			  x--;}
	} }




