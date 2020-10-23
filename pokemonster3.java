import java.util.ArrayList;

		//포켓몬 관련 클래스//
public class pokemon1  {
	
	
	//포켓몬 객체들//
	ArrayList p1 = new ArrayList();
	ArrayList p2 = new ArrayList();
	ArrayList p3 = new ArrayList();
	ArrayList p4 = new ArrayList();
	

	 //포켓몬 전체객체//
    ArrayList p5 = new ArrayList();
	

	pokemon1(){
		//교체할 포켓몬//
		p1= new ArrayList();
		p1.add("꼬부기 lv20 ");
		p2= new ArrayList();
		p2.add("피카츄 lv10 ");
		p3= new ArrayList();
		p3.add("리자몽 lv 24");
		p4= new ArrayList();
		p4.add("이상해씨 lv 14");
		//포켓몬들 체력//
		p1.add(20);
		p2.add(10);
		p3.add(32);
		p4.add(13);
		//포켓몬 전체 보여주기 //
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);
		
	}
	
	
      void ShowPokemon1(){
	  System.out.println("어느 포켓몬과 교체할까?");
	  System.out.println(p5);
	  
	  
  }
      
      void change1() {
    	  System.out.println(p1+"은무엇을할까?");
      	
      }
      void change2() {
    	  System.out.println(p2+"은무엇을할까?");
      }
      void change3() {
    	  System.out.println(p3+"은무엇을할까?");
      }
      void change4() {
    	  System.out.println(p4+"은무엇을할까?");
      }
      
      
      
      void changeEvent1() {
    	  System.out.println("이미 필드에 있는 포켓몬이다!");
      }
      void changeEvent2() {
    	  System.out.println("피카츄로 교체되었다!");
      }
      void changeEvent3() {
    	  System.out.println("리자몽으로 교체되었다!");
      }
      void changeEvent4() {
    	  System.out.println("이상해씨로 교체되었다!");
      }
}