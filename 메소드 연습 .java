import java.util.Scanner;
import java.util.ArrayList;
public class idol {

	public static void main(String[] args) {
		//메뉴를 입력하고 수량을 입력하는 것을 메소드와 클래스로 만들자//
		menuOrder m1 = new menuOrder();
		m1.inputMenu();
		m1.showMenu();
}

}
class menuOrder{
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	ArrayList<String> menu1 = new ArrayList<String>();
	ArrayList <Integer>price1 = new ArrayList<Integer>();
	
	menuOrder(){
		 menu1 = new ArrayList<String>();
		 price1 = new ArrayList<Integer>();
	}

	public void inputMenu() {
		System.out.println("메뉴를 입력해주세요.");
		String q1 = sc1.nextLine();
		while(!q1.equals("")){
			menu1.add(q1);
			System.out.println("수량을입력해주세요.");
			int q2 = sc2.nextInt();
			price1.add(q2);
			System.out.println("메뉴를입력해주세요.");
			q1 = sc1.nextLine();
		}
		 
		
		
		
	}

	public void showMenu() {
		System.out.println(menu1);
		System.out.println(price1);
		
	}

	
}
