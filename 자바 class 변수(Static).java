import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
  
	

	public static void main(String[] args) {
		
		//클래스를 인스턴스화 ,인스턴스화 하고 그 객체를 변수에 담음//
		Calculator c1 = new Calculator();
		//c1(Calculator 소속의 PI를 불러와라 라는 뜻)//
		System.out.println(c1.PI);
		//클래스를 인스턴스화 ,인스턴스화 하고 그 객체를 변수에 담음//
		//c2(Calculator 소속의 PI를 불러와라 라는 뜻)//
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		System.out.println(Calculator.PI);
		

		
	}
	
}
class Calculator{
	//클래스 변수 //
	//클래스 변수를 선언하게 되면 모든 인스턴스에서 동일 한 값을 공유하는 변수를//
	//클래스 변수라고 한다//
	
	//static 이 붙게되면 이 변수가 클래스의 소속이 된다는 뜻//
	//즉 static 을 붙이게 되면 static double PI ==> Calculator 클래스의 소속이 된다//
	//클래스 소속이 된다는것은 해당변수를 모든 인스턴스에서 공유 할수 있다는 것이다.//
	
	
	 static double PI = 3.14;
	 int left, right;
	 
	 void setOperands(int left , int right) {
		 this.left = left;
		 this .right = right;
		 
	 }
	void sum() {
		System.out.println(this.left+this.right);
	}
	void avg() {
		System.out.println((this.left+ this.right)/2);
	}
}