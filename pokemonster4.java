import java.util.ArrayList;

public class bag {
	     //아이템 목록을 보여줄 전체 ArrayList();//
	ArrayList all = new ArrayList();
			//아이템목록//
	ArrayList posion = new ArrayList();
	ArrayList Monsterball= new ArrayList();
	ArrayList Techmachine= new ArrayList();
	
			//아이템수량//
	//포션수량//
	ArrayList p1 = new ArrayList();
	//몬스터볼수량//
	ArrayList m2 = new ArrayList();
	//기술머신수량//
	ArrayList t3 = new ArrayList();
	
	
	
	bag(){
			//수량 초기화 //
		all = new ArrayList();
		
		    // 모든 아이템 리스트 담기 //
		  all.addAll(posion);
		  
		
		
			//상처약 수량//
		
		p1 = new ArrayList();
		p1.add(4);
		
			//몬스터볼수량//
		m2 = new ArrayList();
		m2.add(2);
		m2.add(2);
		m2.add(1);
		
			//기술머신수량//
		t3 = new ArrayList();
		t3.add(1);
		t3.add(1);
		t3.add(1);
		
		
		//상처약(좋은 상처약)//
		posion = new ArrayList();
	    posion.add("좋은상처약 ");
	   
		
		//몬스터볼(몬스터볼 기본 2 개 퀵복 2개 넷볼 1개)//
		Monsterball = new ArrayList();
		Monsterball.add("몬스터볼");
		Monsterball.add("퀵볼");
		Monsterball.add("넷볼");
		
		//기술머신 1(바위깨기), 기술머신2(플래시), 기술머신4(하이드로펌프),
		
		Techmachine = new ArrayList();
		Techmachine.add("바위깨기");
		Techmachine.add("플래시");
		Techmachine.add("하이드로펌프");
		
		
	    
		
	}
	void AllItems() {
		System.out.println("1.상처약 2.몬스터볼 3.기술머신");
	}
	
   void Posion(){
	 System.out.println(posion);
	}
   
   void MonsterBall() {
	   System.out.println(Monsterball);
	   
   }
   
   void TechMachine() {
	   System.out.println(Techmachine);
	   
   }

}