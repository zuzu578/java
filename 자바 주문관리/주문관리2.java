import java.util.ArrayList;
public class Menu {
	ArrayList b1 =new ArrayList();
	ArrayList c1 =new ArrayList();
	
	Menu(){
		b1= new ArrayList();
		c1= new ArrayList();
		
		b1.add("0.사이다");
		b1.add("1.물");
		b1.add("2.우유");
		c1.add(800);
		c1.add(500);
		c1.add(300);
		
		
	}
	void SetMenu() {
		System.out.println("1.주문 2.주문내역 3. 나가기");
	}
  
	void ShowMenu() {
		System.out.println(b1);
		System.out.println(c1);
		
		
	}
}