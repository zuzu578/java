import java.util.Scanner;
import java.util.ArrayList;
public class MenuTest {

	public static void main(String[] args) {

		Menu m1 =new Menu();
		m1.buildMenu();
		m1.showMenu();
	    m1.choice();
	    m1.total();
	   
	    
	    
	}

}
   class Menu{
	   Object a= 0 ;
	   Object b= 0 ;
	   ArrayList Menu = new ArrayList();
	   ArrayList Price = new ArrayList();
	   ArrayList order= new ArrayList();
	   ArrayList count= new ArrayList();
	 

	  Menu(){ 	
		  Menu = new ArrayList();
		  Price = new ArrayList();
		  count = new ArrayList();
		  order = new ArrayList();
		  
		  
		  
   }
	 void total() {
		 System.out.println("메뉴"+order+"수량"+count+"입니다.");
	
		
	}



	void choice() {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
	   
		System.out.println("메뉴를 선택해주세요.");
		int m= sc1.nextInt();
		
			order.add(m);
		  System.out.println("수량을 입력해주세요.");
		  int c = sc2.nextInt();
		  count.add(c);
		  
		 
		  
		  
		}
		
	
   	 void buildMenu() {
	 Menu.add("0번 카페라떼");
	 Menu.add("1번 아메리카노 ");
	 Menu.add("2번  스무디 ");
	 Menu.add("3번 주스 ");
	 
	 Price.add(2400);
	 Price.add(2000);
	 Price.add(2800);
	 Price.add(3000);
		
		
	}

	 void showMenu() {
	  System.out.println(Menu);
	  System.out.println(Price);
		
		
	}
	   
   }
