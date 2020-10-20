import java.util.Scanner;
public class NewWhi {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
	     Scanner sc4 =new Scanner(System.in);
	     
	     System.out.println("1.메뉴선택 2.오늘매출 3. 나가기");
	     int n1 = sc1.nextInt();
	     while(n1!=3) {
	     
	     
	    	 
	     if(n1==1) {
	    	 System.out.println("1.사이다 2.콜라 3.우유 4.이전화면");
		    int n2 =sc2.nextInt();
		    while(n2!=4) {
	   
	    	System.out.println("수량입력해주세요.");
	    	int n3 = sc3.nextInt();
	    	
	    		System.out.println("13.메뉴선택 2.오늘매출 3. 나가기");
	    		n1 = sc1.nextInt();
	    	  
	    }
		    
		    System.out.println("1.메뉴선 2.오늘매출 3. 나가기");
		      n1 = sc1.nextInt(); 
		   
	     }
	  
	     }
	     System.out.println("종료");
	  
	   
	   }
}
