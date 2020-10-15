import java.util.Scanner;
import java.util.ArrayList;
public class MenuTest {

	public static void main(String[] args) {
		 Menu m1 = new Menu();
		 m1.buildMenu();
		 m1.showMenu();

	}

}
		class Menu{
				//==>메뉴 배열 <==//
			ArrayList<String> menu = new ArrayList<String>();
			//==>가격 배열 <==//
			ArrayList<Integer> price = new ArrayList<Integer>();
	

	Menu(){	//생성자 ==> 초기값을 초기화 할때 기본값을 설정할때 사용 New 객체 쓰면 자동호출 //
		menu =new ArrayList<String>();
		price = new ArrayList<Integer>();
		
	}
      //메뉴를 넣는 기능을 하는 구간 (메소드임)//
	 void buildMenu() {
		 	  //메뉴를 입력받는 스캐너 //
		Scanner sc1 = new Scanner(System.in);
		     //수량을 입력받는 스캐너 //
		Scanner sc2 = new Scanner(System.in);
		System.out.println("메뉴를 입력해주세요.");
		String inputMenu = sc1.nextLine();
		
		while(!inputMenu.equals("")) {
		 menu.add(inputMenu);
		 System.out.println("수량을 입력해주세요.");
		 int inputCount = sc2.nextInt();
		 price.add(inputCount);
		 
		 System.out.println("메뉴를 입력해주세요.");
		 inputMenu = sc1.nextLine();
		 menu.add(inputMenu);
		 
			
			
			
		}
		
		
		
		
		 
		
	}

	 void showMenu() {
		 System.out.println(price);
		 System.out.println(menu);
		
		
	}
	
}