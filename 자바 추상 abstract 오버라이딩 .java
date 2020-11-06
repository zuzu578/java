import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
	

	public static void main(String[] args) {
		//추상클래스는 인스턴스 화 할수 없다.//
		//A obj = new A();//
	  
		
	}
}
//추상클래스는 abstract 를 통해 만들수 있다//

abstract class A{
	//추상메소드는 바디가 없다(몸통이 없다)//
	//추상 메소드를 사용하기위해서반드시 오버라이딩을 해야한다//
	
	public abstract int b();
	
	public void d() {
		System.out.println("hello word");
		
		
		
	}
	class B extends A{
		//오버라이딩을함//
		//오버라이딩을 사용해서 abstract int b를사용가능(추상메소드)//
		public int b() {
			return 1;
			
		}
		
	
	}
		
	
	
}