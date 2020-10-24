package new1;
import java.util.ArrayList;


public class nnew {
       
 
	public static void main(String[] args) {
		//상속을 할때 우선적으로 부모 클래스에서 는 기본 생성자를 우선적으로 만들어 주어야한다//
		//그래야지 오류가 일어나지 않는다.//
		
	
		 
		 
	 }
}


/*Calculator c1 = new Calculator(10,20);	
		c1.sum();
		c1.avg();
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
		
		SubtractionableCalculator s1 = new SubtractionableCalculator();
		s1.subtract();
	}
	
}
class Calculator{
	int left, right;
	
	//초기화 작업 ==> 생성자에서//
	Calculator(int left , int right){
		this.left =left;
		this.right = right;
		
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
     
	}
}

class SubtractionableCalculator extends Calculator{
	

	SubtractionableCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void subtract() {
		System.out.println(this.left-this.right);
	}
	
}





     /* Calculator c1 = new Calculator(10,20);
      c1.sum();
      c1.avg();
 
     
}
}

class Calculator{
	//멤버(전역변수)//
	int left, right;
	
	//생성자//
	//기본생성자 X 매개변수가있는 생성자//
	Calculator(int x , int y){
		this.left = x;
		this.right = y;
	}
    //!==>생성자는 그 어떤 메소드보다 먼저 실행하도록 약속 되어있다!<==!//		
   //Calculator 생성자에서 멤버 변수들 한테 10과 20이라는 값을 초기화 시켜줌//
   // 초기 세팅을 여기 생성자에서 한 셈//
		
		public void sum() {
			System.out.println(this.left+this.right);
		}
		public void avg() {
			System.out.println((this.left+this.right)/2);
		}
}*/



//Running 인스턴스//
/* Running r1 = new Running();
 r1.setOperands(10, 20);
 Running r2 = new Running();    
 r2.setOperands(20, 40);	
 
 r1.sum();
 r1.avg();
 r2.avg();
 r2.sum();*/
	
			
	/*
//메소드란 무엇인가?//
//메소드는 함수를 말해요 근데 함수를 자바라는 언어에서 다르게 말한건데 //
// 메소드와 함수는 같은 뜻입니다. //
R1 r = new R1();
System.out.println(r.R2(20, 30,40,50));
}
}

class R1{

ArrayList R2(int x , int y,int z,int k){
 ArrayList a1 = new ArrayList();
 a1.add(x);
 a1.add(y);
 a1.add(z);
 a1.add(k);
return a1;
	
}
*/



/*class Running{
//멤버변수(전역변수)// 
int left , right ;
Running(){
	left= 0 ;
	right = 0; 
}

public void setOperands(int left ,int right){
//this = 인스턴스 자기 자신을 가리킴//
// 다시말해서 this 는 class 아래에서 만들어진 멤버변수(전역변수) //
//
this.left = left;
this.right = right;
	
}
public void sum() {
	System.out.println(left + right);
}
public void avg() {
	System.out.println((left+right)/2);
}*/

/*
Sub c1 = new Sub(10,20);
c1.sum();
c1.avg();
c1.subtract();

}
}

class Calculator{
int left, right;
Calculator(){

}

public Calculator(int left, int right) {
this.left = left;
this.right= right;
}

public void setOperands(int left, int right) {
this.left= left;
this.right =right;


}

public void sum() {
System.out.println(this.left+ this.right);

}
public void avg() {
System.out.println((this.left+this.right)/2);

}



class Sub extends Calculator {
public Sub(int left, int right) {
 this.left = left;
 this.right= right;
}

public void subtract() {
 System.out.println(this.left-this.right);
}

*/
	

	
