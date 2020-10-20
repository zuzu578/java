import java.util.ArrayList;
public class BuildMenu {
	ArrayList<String> b1 =new ArrayList<String>();
    ArrayList<Integer>p1 = new ArrayList<Integer>();
	
	
	BuildMenu(){
		
		b1=new ArrayList<String>();
		p1=new ArrayList<Integer>();
    	//메뉴//
    	
    	b1.add("0.콜라");
    	b1.add("1.사이다");
    	b1.add("2.주스");
    	b1.add("3.나가기");
    	//가격//
    	
    	p1.add(1000);
    	p1.add(700);
    	p1.add(600);
    	
		
		
	}
    void setMenu() {
    	System.out.println("1.주문 2.주문내역보기 3.오늘의 매출보기 4.나가기");
    }
  
 

    void Howmany() {
    	System.out.println("수량을 입력해주세요.");

    	
    }
    
    void showmenu() {
    	System.out.println(b1);
    	System.out.println(p1);
    	
    }
    void expense() {
    	
    	System.out.println();
    }
}