import java.util.Scanner;
public class NewWhi {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
	     Scanner sc4 =new Scanner(System.in);
	     System.out.println("1.메뉴선택 2.오늘매출 3. 나가기");
	   int s1 = sc1.nextInt();
	   while(s1!=3) {
	   if(s1==1) {
		   
			   System.out.println("1.커피 2.우유 3.물 4.초기화면으로");
		   
		   int s2 =sc2.nextInt();
		   //초기화면으로//
		   while(s2!=4) {
		   
		 
		   if(s2!=0) {
			   System.out.println("수량입력");
			   int s3 =sc3.nextInt();
			 
			   
			   
		   }
		   System.out.println("주문완료");
		   System.out.println("1.메뉴선택 2.오늘매출 3. 나가기");
	       s1 = sc1.nextInt();
		 
		   }
		   System.out.println("1.메뉴선택 2.오늘매출 3. 나가기");
	       s1 = sc1.nextInt();
		   }
	    System.out.println("1.메뉴선택 2.오늘매출 3. 나가기");
	   s1 = sc1.nextInt();
	   }
		 
	  
	   
	   }
}
