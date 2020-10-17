import java.util.Scanner;
import java.util.ArrayList;
public class idol {

	public static void main(String[] args) {
	  vend v1 = new vend();
	  v1.buildMenu();
	  v1.showMenu();
	  v1.takeOrder();
	  v1.showTotal();
	
	
	}
	
}
class vend{
	ArrayList <String>menu1 = new ArrayList<String>();
	ArrayList <Integer>price1 = new ArrayList<Integer>();
	ArrayList <String>takeOrder1 = new ArrayList<String>();
	ArrayList<Integer>count1 = new ArrayList<Integer>();
  
	
	
   Scanner sc1 = new Scanner(System.in);
   Scanner sc2 = new Scanner(System.in);
   Scanner sc3 = new Scanner(System.in);
   Scanner sc4 = new Scanner(System.in);
   
	vend(){
		menu1 = new ArrayList<String>();
		price1 = new ArrayList<Integer>();
		takeOrder1 = new ArrayList<String>();
		count1 = new ArrayList<Integer>();
	}
	

	public void showTotal() {
		System.out.println(takeOrder1+"총"+count1+"개"+"입니다.");
		
	}


	public void buildMenu() {
		menu1.add("사이다");
		menu1.add("물");
		menu1.add("주스 ");
		menu1.add("이온음료");
		
		price1.add(800);
		price1.add(600);
		price1.add(500);
		price1.add(1000);
		
		
	}

	public void takeOrder() {
		String choice = sc1.nextLine();
		takeOrder1.add(choice);
		System.out.println(choice+"맞으신가요?"+"네 아니오로 대답가능");
		String answer = sc3.nextLine();
		if(answer.equals("네")) {
			System.out.println("수량을 입력해주세요.");
			int count = sc4.nextInt();
			count1.add(count);
			
		 
			
		  
		}else {
			System.out.println("결제가 취소되었습니다.");
		}
	     
		
		
		
    
		
	}

	public void showMenu() {
		System.out.println("원하시는 상품을 골라주세요.");
		System.out.println(menu1);
		System.out.println(price1);
		
		
	}
	
	
	
	
	
}
