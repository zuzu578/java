 		//포켓몬 전투 빌드 클래스//

import java.util.ArrayList;

public class Fight extends pokemon1  {
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	ArrayList a3 = new ArrayList();
	ArrayList a4 = new ArrayList();
	ArrayList a5 = new ArrayList();
    ArrayList a6 = new ArrayList();
	
	//적 포켓몬//
	ArrayList p6= new ArrayList();
	
    ArrayList dm1 = new ArrayList();
    ArrayList dm2 = new ArrayList();
    ArrayList dm3 = new ArrayList();
    ArrayList dm4 = new ArrayList();
    ArrayList dm5 = new ArrayList();
    
    //교체될(포켓몬)을 담는 공간//
    //포켓몬이 교체될때 배열에있는 포켓몬을 따로만들고 교체한다음 그때마다 저장해준다//
    int pokemon = 0;
    
    
	
	Fight(){
		//공격대미지(그냥 고정된값으로 하자)//
		dm1.add(4);
		dm2.add(5);
		dm3.add(3);
		dm4.add(10);
		
		//포켓몬1 의 공격 기술 //
		//꼬부기 공격기술//
		a1= new ArrayList();
		a1.add("1.파도타기");
		
		a1.add("2.물대포");
	
		a1.add("3.울음소리");
		
		a1.add("4.몸통박치기");
	
		
		//포켓몬2 의 공격 기술//
		//피카츄 공격기술//
		a2= new ArrayList();
		a2.add("1.10만볼트");
		a2.add("2.100만볼트 ");
		a2.add("3.싸이코키네시스");
		a2.add("4.몸통박치기");
		
		//포켓몬3 의 공격 기술//
		//리자몽 공격기술//
		a3= new ArrayList();
		a3.add("1.불꽃세례");
		a3.add("2.화염방사 ");
		a3.add("3.울음소리");
		a3.add("4.몸통박치기");
		
		//포켓몬4 의 공격 기술//
	    //이상해씨의 공격기술//
		a4= new ArrayList();
		a4.add("1.풀베기");
		a4.add("2.참기");
		a4.add("3.몸통박치기");
		a4.add("4.잠자기");
		
		
		//적포켓몬//
	   	p6 = new ArrayList();
		p6.add("한카리아스 lv 16");
		//적포켓몬 체력//
		p6.add(30);
		
		a6 = new ArrayList();
		
		a6.add((p1+"(는)무엇을 할까?"));
			   
	}
	
	
   
	void FirstSelect() {
		//기본 필드 포켓몬 = p1(꼬부기이다.)//
		System.out.println(a6);
		System.out.println("1.싸우기 2.포켓몬 3. 가방 4.도망");
	}
	
	void BuildAttack1() {
	  System.out.println(a1);
	
	}
	void BuildAttack2() {
		  System.out.println(a2);
			
		}
	void BuildAttack3() {
		  System.out.println(a3);
			
		}
	void BuildAttack4() {
		  System.out.println(a4);
			
		}
	void BuildAttack5() {
		  System.out.println(a5);
			
		}
	

}