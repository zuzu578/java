import java.util.Scanner;
public class Newnew1 {

	public static void main(String[] args) {
		 // atm 기기 // 
		
		
	 int insert = 1;
	 int draw = 2 ;
	 int account = 3; 
	 
	 
	 
	
	 
	 
		
		
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("원하시는 업무를 선택해주세요.");
	  System.out.println("1.입금"+"2.출금"+"3.계좌이체");
	  
	  	int a = sc.nextInt();
	  	
	  	
	  	if(a == 1) {
	  	
	  		System.out.println("입금할 계좌번호를 입력해주세요.");
	  		int myAccount = 0;
	  		
	  	   myAccount = sc.nextInt();
	  		if(myAccount==myAccount) {
	  			System.out.println("입금하실 금액을 입력해주세요.");
	  			
	  		  int myMoney = 0;
	  		  myMoney = sc.nextInt();
	  		  if(myMoney==myMoney) {
	  			  System.out.println(myMoney+"원"+"맞으십니까?예 1번 아니오 2번");
	  			  int myAnswer=0;
	  			  myAnswer = sc.nextInt();
	  			  if(myAnswer == 1) {
	  				  System.out.println("거래가 정상처리되었습니다. 명세표를 받으시겠습니까? 1번 예2번 아니오");
	  				  int myAnswer2 = 0 ;
	  				  myAnswer2 = sc.nextInt();
	  				 if(myAnswer2 == 1) {
	  					 System.out.println("명세표 여기있습니다. 거래가 정상처리되었습니다. 대단히 감사합니다.");
	  				 }else {
	  					 System.out.println("명세표받기가 취소되었습니다. 거래가 정상처리되었습니다.대단히 감사합니다.");
	  				 }
	  			  
	  			  
	  			  }else {
		  			  System.out.println("거래가 취소되었습니다. 처음부터 다시 거래 해주십시오.");
	  				 
	  			  
	  		  }
	  		  }
	  		
	  	}
	  
		
	
		
		
	}else if(a ==2) {
		System.out.println("통장,카드를 화살표방향으로 넣어주십시오.(넣엇다를 1로하고 안넣었음을 0 으로 한다.)");
		int in = 0;
		in = sc.nextInt();
		
		if(in == 1) {
			System.out.println("출금할 금액을 입력해주십시오.");
			
			int myDraw = 0;
			myDraw = sc.nextInt();
			if(myDraw == myDraw) {
				System.out.println(myDraw+"원"+"출금하시겠습니까?"+"예1번 아니오 2번");
			    int myAnswer3 = 0;
			    myAnswer3 = sc.nextInt();
			    if(myAnswer3 ==1) {
			    	System.out.println(myDraw+"원"+"출금되었습니다."+"거래가 정상처리되었습니다. 명세표를 받으시겠습니까? 예는 1번 아니오는 2번");
			    	int myAnswer4 = 0;
			    	myAnswer4 = sc.nextInt();
			    	if(myAnswer4==1) {
			    		System.out.println("명세표 여기있습니다. 거래가 정상처리되었습니다. 놓고가신 물건은 없는지 확인하여 주십시오.");
			    	}else {
			    		System.out.println("명세표 받기를 취소하였습니다. 거래가 정상처리되었습니다. 놓고가신 물건은 없는지 확인하여주십시오.");
			    	}
			    }else 
					System.out.println("거래가 취소되었습니다. 처음부터 다시 시도해주십시오.");
			}
			
				
			
				
			
		}else {
			System.out.println("거래가 취소되었습니다.처음부터 다시 시도해주십시오.");
		}
	  
		
	}else if(a == 3) {
		System.out.println("이체하실계좌번호를 입력해주십시오.");
		
		int ac4 =  0;
		ac4 = sc.nextInt();
		
		if(ac4 == ac4 ) {
			System.out.println("카드 또는 통장을 화살표방향으로 넣어주십시오. 0번은 안넣음으로간주, 1번은 넣음으로 간주 ");
			 int in5 = 0;
			 
			 in5 = sc.nextInt();
			 
			 if(in5 == 1) {
				 System.out.println("은행 명을 입력해주십시오.1.우리 2.신한 3. 농협" );
				 int bank = 0;
				 
				 bank = sc.nextInt();
				 if(bank ==bank ) {
					 System.out.println("이체하실 금액을 입력해주십시오.");
					 int in6 = 0 ;
					 in6= sc.nextInt();
					 
					 if(in6 ==in6) {
						 System.out.println(in6+"원 맞으십니까? 맞으면 1번 아니면 2번");
					   int myAnswer7 = 0 ;
					 
						 
					 
					   myAnswer7 = sc.nextInt();
					   if(myAnswer7==1) {
						   System.out.println(in6+"원 이체 되었습니다. 거래가 정상처리되었습니다. 명세표를 받겠습니까?");
						   System.out.println("예1번 아니오 2번");
					   }else {
							 System.out.println("거래가 취소되었습니다. 처음부터 다시 거래 해주십시오.");
							 
					 }
					 }
						   
						   int myAnswer8 = 0;
						   myAnswer8 =sc.nextInt();
						   if(myAnswer8 == 1) {
							   System.out.println("거래가 정상처리되었습니다. 명세표를 받으십시오.");
							   System.out.println("놓고가신 물건은 없는지 확인하여 주십시오 대단히 감사합니다.");
						   }else {
							   System.out.println("명세표발급을 취소하였습니다. 거래가 정상처리되었습니다.놓고가신 물건은 없는지 확인하여주십시오.");
							   
						   
					   }
					   }
					   
							 
						 
					 }
			 }else {
				 System.out.println("거래가 취소되었습니다. 처음부터  다시거래 해주십시오.");
			 }
				 
			 }else {
				 System.out.println("거래가 취소되었습니다. 1번2번3번중 선택해주십시오.");
			 }
		}
	
	

}	

	
		
	


   		  
   		  
   		
   	   
   	   

	
	
