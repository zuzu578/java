import java.util.ArrayList;
import java.util.Scanner;
public class Fuck {

	public static void main(String[] args) {
		
		
	 //우선 목록을 보여준다 ---> 배열을 만든다.//
	  ArrayList a = new ArrayList();//=====>목록(메뉴)<=====
	 //가격을 담을 배열을 만든다 //
	  ArrayList price = new ArrayList();//===>가격<====
	 //선택(주문)을 담을 배열을 만든다//
	  ArrayList order = new ArrayList();//====>주문<====
	 //수량을 담을 배열을 만든다 //
	  ArrayList count = new ArrayList();//====>수량<====
     
     //만든 배열안에 내용물을 넣는다.//
	 a.add("0.커피");
     a.add("1.주스");
     a.add("2.우유");
     a.add("3.콜라");
     //만든 내용물 의 가격을만든다.//
     price.add(1000);
     price.add(800);
     price.add(500);
     price.add(700);
     
     
     
       int i = 0 ;
     	while(i<3) {
    	  i++;
     
     System.out.println("상품을 선택해주세요.");
     System.out.println(a);//===>a 배열을 보여주고 , 선택지를 선택하게 만든다 //
     System.out.println(price);
     
     Scanner sc1 = new Scanner(System.in);//===>스캐너로 상품 선택 값을 입력받는다//
     
     int select = sc1.nextInt();
     order.add(select);// 그 값을 (스캐너에서 받은 주문을 order 라는 주문 배열에 넣는다)//
     
     System.out.println("수량을 입력해주세요.");
     Scanner sc2 = new Scanner(System.in);//====>스캐너로 선택한 상품의 수량을 입력받는다//
      
     int many = sc2.nextInt();
     
     count.add(many);///=====> 스캐너에서 입력받은 수량을 count라는배열에 저장한다는 뜻 //
     System.out.println(order+"번"+"상품"+count+"개 맞나요? ");
     System.out.println("1번 네.2번아니오. ");
     Scanner sc3 = new Scanner(System.in);
     int answer = sc3.nextInt();
     
     if(answer==1){
    	 System.out.println("결제되었습니다."+order+"번"+"상품"+count+"개"+"나왔습니다.");
     }else {
    	 System.out.println("취소되었습니다.");
     }
     

     
     
     
     
     
  
		
	
	    
		
		

     }
	   
		 
		 
	 
				
	    		
	}
}
	 		


	 