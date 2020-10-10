import java.util.Scanner;
public class JavaMusicplayer {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		
	    String  play  = "play" ; 
	    String stop = "stop";
		
		//1. 음악을 선택하잖아요? // 
		System.out.println("들으려는 음악을 선택해주세요");
		
	    System.out.println("1.a음악"+"2.b음악"+"3.c음악"+"4.d음악"+" stop버튼 . 현재 음악 중단하기 ");
	    //그 음악의 값을 받아 와야겠죠? //
	    
	    Scanner sc = new Scanner(System.in);
	    
	     int select = sc.nextInt();
	      String select2 =sc.nextLine();
	     
	     if(select == 1) {
	    	 System.out.println("a음악 재생중..");
	    	 System.out.println("음악을 정지하시려면 언제든지 stop 버튼을 눌러주세요.");
	    	 select2 = sc.nextLine();
	         
	    	if(select2 .equals(stop)) {
	    		System.out.println("음악 정지 ");
	    	    System.out.println("음악을 계속 들으시려면 play 버튼을 눌러주세요.");
	    	    select2 = sc.nextLine();
	    	    if(select2 .equals(play));
	    	    System.out.println("음악 실행..!");
	    	}
	     } else if (select ==2) {
	    	 System.out.println("b음악 재생중..");
	    	 System.out.println("음악을 정지하려면 언제든지 stop 버튼을 눌러주세요.  ");
	    	 select2 = sc.nextLine();
	    	 
	    	 if(select2.equals(stop)) {
	    		 System.out.println("음악 정지 ");
	    		 System.out.println("음악을 계속 들으시려면 play 버튼을 눌러주세요. ");
	    		 select2 = sc.nextLine();
	    		 if(select2 .equals(play));
	    		 System.out.println("음악 실행..!");
	    	 }
	     }else if (select ==3) {
	    	 System.out.println("c음악 재생중...");
	    	 System.out.println("음악을 정지하려면 언제든지 stop 버튼을 눌러주세요.");
	    	  select2 = sc.nextLine();
	    	  
	    	  
	    	  if(select2 .equals(stop)) {
	    		  System.out.println("음악 정지");
	    		  System.out.println("음악을 계속 들으시려면 play 버튼을 눌러주세요.");
	    		  select2 = sc.nextLine();
	    		  if(select2 .equals(play));
	    		  System.out.println("음악 실행...!");
	    	  }
	     }else if (select ==4) {
	    	 System.out.println("d음악 재생중...");
	    	 System.out.println("음악을 정지하려면 언제든지 stop 버튼을 눌러주세요.");
	    	  select2 = sc.nextLine();
	    	  
	    	  
	    	  if(select2 .equals(stop)) {
	    		  System.out.println("음악 정지");
	    		  System.out.println("음악을 계속 들으시려면 play 버튼을 눌러주세요.");
	    		  select2 = sc.nextLine();
	    		  if(select2 .equals(play));
	    		  System.out.println("음악 실행...!");
	    	  }
	     }
	   
	    
	     
	     
	     
	     
		
		
		
		

	}

}