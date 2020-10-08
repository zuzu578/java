import java.util.Scanner;

public class javascript {

	
	public static void main(String[] args) {
		  
		
	   int   a = 90;
		//입력받은 성적에대해 학점을 부여하는 프로그램 //
		//90점 이상은a 80점 이상 90미만은 b 70이상 80 미만 c 60 이상 70미만은 d//
	   //60미만 은 f//
	    
		//1)성적 을 입력 받기위해서는 스캐너 필요 //
		 Scanner sc = new Scanner(System.in);
		 
		 //2)질문을 해야겠죠?
		  System.out.println("성적을 입력해주세요.");
		  int  d = sc.nextInt();
		  
		  if(90<=d) {
			 
			  System.out.println("A입니다.");
		  }else if(80<=d) {
			  System.out.println("B입니다.");
		  }else if(70<=d) {
			  System.out.println("c입니다.");
		  }else if(60<=d) {
			  System.out.println("d입니다.");
		  }else {
			  System.out.println("f입니다.");
		  }
		  
		  
		  
		  
		  
		  
		  
	}
    	  
    	  
 
    	
    	  
    	
      
	   
	   
		
		}
	     
	   
	  
	     
				
			
	
				
			
				 
			 

		 
	
	      
	 
	

		
	

			
		
		 
