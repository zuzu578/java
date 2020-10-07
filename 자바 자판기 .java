import java.util.Scanner;//1.스캐너를 호출//


public class javascript {

	
	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);//2.스캐너 객체를 생성//
   //3.필요한 요소들의변수를 생성 //
	int money = 0;
	int change = 0;
   int  choice = 0;
	
	int milk = 700;
	int water = 500;
	int cola = 1000;
	
	  System.out.println("돈을넣어주세요.");
	  money = sc.nextInt();//4.스캐너 객체 불러오기 (변수에다담아서 불러오기)//
	  System.out.println("상품을 선택해주세요.");//4. 에서 불러와서 응답을 할수있도록함//
	  System.out.println("1번째.milk"+"2번째.water"+"3번째.cola");
	  choice = sc.nextInt();//5.스캐너 객체를 불러와서 선택을 할수있도록 했고, 그 스캐너 객체를 
	  //choice 라는변수에 담았다.//
	  
	  if(choice == 1 && money > milk) {//if 문 시작 //
		  System.out.println("milk나왔습니다.");//if = true//
		  System.out.println("거스름돈"+(money-milk));
	  }else if(choice == 2 && money > water) {//if = false//
		  System.out.println("water나왔습니다.");
		  System.out.println("거스름돈"+(money-water));
	  }else if(choice ==3 && money > cola) {//if= false//
		  System.out.println("cola 나왔습니다.");
		  System.out.println("거스름돈"+(money-cola));
	  }else {     //if =false(잔액이 부족할때) If문을 종결시키는 역할을 함.
		  
		  System.out.println("잔액이 부족합니다.");
		  System.out.println("돈을 다시 받아주세요."+(money));
	  }
	  
	  
	
	
	  
	  
				
			
		
			
		
		    
		
		 
		}
}






	
	   	
	   		
	   		
           
	 
	
	 
	 	
	  
	
	  
	  
				
			
		
			
		
		    
		
		 
		}
}




