

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your id");
	   
		String id = sc.nextLine();
		
		if(id.equals("dlwnghks6821")) {
			System.out.println("Please input your password");
			
		String pwd = sc.nextLine();
		  if(pwd.equals("1111")){
			  	  System.out.println("Login Successful.");
		  }  else {
			  System.out.println("incorrect your password");
			  
		  }
			
			
 
    
      
		} else {
			System.out.println("incorrect your id");
		}
	
	}
}

