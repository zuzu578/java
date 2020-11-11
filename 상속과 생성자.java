
public class new2 {

	public static void main(String[] args) {
		 nenen2 n2 = new nenen2(10,5);
		 eeff e2 = new eeff(40,20);
		 e2.running();
		 n2.add();
		 e2.avg();
}
	
}


public class nenen2 extends eeff {
     int z;
     int k;
	
	
	nenen2(int x, int y) {
		//자식의 초기화 코드가 부모의 생성자보다 먼저 출현하면 안된다.//
		//반드시 부모의 생성자가 먼저 출현해야한다//
		super(x, y);//부모의 생성자 코드 // 
		//super 를 통해서 부모의 생성자를 호출하게되면 부모의 기본생성자를 생성한것과 같은 효과를 볼수있다//
		//super를 호출하면 상위 클래스(부모)한테 자동적으로 디폴트 생성자가 호출이됨//
		//자식의 초기화 코드 //
		k = 20;
		z = 60;
		
	}

	void add() {
		System.out.println(a+b);
		System.out.println(this.z+this.k);
	}
	
	 
}



public class eeff {
	//private 접근 제어자를 사용하게되면 그 클래스 안에서만 변수를 사용할수있게된다//
	//때문에 외부에서 접근을 못한다//
	//protected ==> 상속 , 같은 클래스 소속 , 같은 패키지 내에서 사용을 할수있다//
    protected int a  ;
    protected int b  ;
    
    /*eeff(){
    	
    }*/
    eeff(int x , int y){
    	this.a = x;
    	this.b = y;
    }
    void running() {
    	System.out.println(a+b);
    }
    
    void avg() {
    	System.out.println(a/b);
    }
}
