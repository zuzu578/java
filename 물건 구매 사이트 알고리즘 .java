import java.util.Scanner;
public class NE1 {

	public static void main(String[] args) {
		//상품을 구매하면 카카오톡으로 전송되는 프로그램 //
	  
	    
		Scanner sc = new Scanner(System.in);
		
		

				String user = "$user";
					int count = 0; //수량// 
					int a = 1000; //a 가격 1000원//
					int b = 2000; //b 가격 2000원//
					int c = 3000; //c 가격 3000원//
		
	   System.out.println("원하시는 상품을선택해주세요.");
	   System.out.println("1.상품a1000원 "+"2.상품b2000원 "+"3.상품c3000원 ");
	 //------>!상품 선택 스캐너!<------- //
		int p = sc.nextInt();
	   
	   	
	    if(p==1) {
	    	System.out.println("수량을 입력해주세요.(최대 100까지가능)");
	    	 //------->!수량 선택 스캐너!<------- //
        	int many = sc.nextInt();
	    	
                
            	many = sc.nextInt();
            	count = many;
            	
            	if(count==many && count<=100) {
            		System.out.println(count+"개 가 맞습니까? 1.yes 2. no");
            		 p = sc.nextInt();
            		 if(p ==1) {
            			 System.out.println("금액을 충전해주세요. ");
            			 p =sc.nextInt();
                 		if(p>=a) {
                 			System.out.println("금액이 충전되었습니다.");
                 			System.out.println("구매 하시겠습니까? Yes.1 No.2");
                 			p =sc.nextInt();
                 			if(p==1) {
                 				System.out.println("구매가 완료 되었습니다. ");
                 			
                 			    System.out.println(user+"님 구매가 완료되었습니다!");
                 				System.out.println("KAKAO TALK알림"+user+"님!"+"현재 상품 준비중입니다!");
                 			    System.out.println("구매내역을 확인하시려면 1번을 눌러주세요.");
                 			    p = sc.nextInt();
                 			   if(p == 1) {
                 				   System.out.println("구매내역: 현재 상품 준비중입니다..");
                 			   }
                 			}else {
                 				System.out.println("구매가 취소되었습니다. 처음부터 다시 시도해주세요. ");
                 			}
                 		}else {
                 			System.out.println("충전 금액이 부족합니다. ");
                 		}
                 		
            		 }else {
            			 System.out.println("처음부터 다시시도해주세요.");
            		 }
            		
            	}else {
            		System.out.println("수량은 100개 까지입니다. ");
            	}
            	
               
	 
	    	
	    	
	    
	   
	} else if(p==2) {
    	System.out.println("수량을 입력해주세요.(최대 100까지가능)");
   	 //------->!수량 선택 스캐너!<------- //
   	int many = sc.nextInt();
   	
           
       	many = sc.nextInt();
       	count = many;
       	
       	if(count==many && count<=100) {
       		System.out.println(count+"개 가 맞습니까? 1.yes 2. no");
       		 p = sc.nextInt();
       		 if(p ==1) {
       			 System.out.println("금액을 충전해주세요. ");
       			 p =sc.nextInt();
            		if(p>=b) {
            			System.out.println("금액이 충전되었습니다.");
            			System.out.println("구매 하시겠습니까? Yes.1 No.2");
            			p =sc.nextInt();
            			if(p==1) {
            				System.out.println("구매가 완료 되었습니다. ");
            			    System.out.println(user+"님 구매가 완료되었습니다!");
            				System.out.println("KAKAO TALK알림"+user+"님!"+"현재 상품 준비중입니다!");
            			    System.out.println("구매내역을 확인하시려면 1번을 눌러주세요.");
            			    p = sc.nextInt();
            			   if(p == 1) {
            				   System.out.println("구매내역: 현재 상품 준비중입니다..");
            			   }
            			}else {
            				System.out.println("구매가 취소되었습니다. 처음부터 다시 시도해주세요. ");
            			}
            		}else {
            			System.out.println("충전 금액이 부족합니다. ");
            		}
            		
       		 }else {
       			 System.out.println("처음부터 다시시도해주세요.");
       		 }
       		
       	}else {
       		System.out.println("수량은 100개 까지입니다. ");
       	}
       	
          
	} if(p==3) {
    	System.out.println("수량을 입력해주세요.(최대 100까지가능)");
   	 //------->!수량 선택 스캐너!<------- //
   	int many = sc.nextInt();
   	
           
       	many = sc.nextInt();
       	count = many;
       	
       	if(count==many && count<=100) {
       		System.out.println(count+"개 가 맞습니까? 1.yes 2. no");
       		 p = sc.nextInt();
       		 if(p ==1) {
       			 System.out.println("금액을 충전해주세요. ");
       			 p =sc.nextInt();
            		if(p>=c) {
            			System.out.println("금액이 충전되었습니다.");
            			System.out.println("구매 하시겠습니까? Yes.1 No.2");
            			p =sc.nextInt();
            			if(p==1) {
            				System.out.println("구매가 완료 되었습니다. ");
            			    System.out.println(user+"님 구매가 완료되었습니다!");
            				System.out.println("KAKAO TALK알림"+user+"님!"+"현재 상품 준비중입니다!");
            			    System.out.println("구매내역을 확인하시려면 1번을 눌러주세요.");
            			    p = sc.nextInt();
            			   if(p == 1) {
            				   System.out.println("구매내역: 현재 상품 준비중입니다..");
            			   }
            			}else {
            				System.out.println("구매가 취소되었습니다. 처음부터 다시 시도해주세요. ");
            			}
            		}else {
            			System.out.println("충전 금액이 부족합니다. ");
            		}
            		
       		 }else {
       			 System.out.println("처음부터 다시시도해주세요.");
       		 }
       		
       	}else {
       		System.out.println("수량은 100개 까지입니다. ");
       	}
       	
          
	}
	   
	   
	}
	   
	 

		
		
	
	
		
		
	   
		
		
		
	}
	



ㅍ