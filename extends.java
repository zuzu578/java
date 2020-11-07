import java.util.Scanner;
import java.util.ArrayList;

public class testfor {
  
	

	public static void main(String[] args) {
		//Sub 라는 클래스를인스터스화 한것임===>객체화 했다//
		
		Sub s1= new Sub();
		//값을 전달하는 인자 //
		s1.setOperands(10, 20);
		//인스턴스화 한 클래스의 메소드를 호출//
		
	    s1.sum();
	    s1.avg();
	    s1.substract();
		
	
	
}
}

class Calculator{
	//Global Scope(전역변수,멤버변수)//
	//Caculator ==>부모 //
	int left, right;
	
	void setOperands(int left, int right) {
		//this==>Calculator 객체 자기 자신을 가리킨다//
		//오른쪽에있는 left , right == > main메소드에서 전달해주는 인자 이다//
		this.left=left;
		this.right=right;
		
		
	}
	void sum() {
		System.out.println(this.left+this.right);
	}
	void avg() {
		System.out.println((this.left+this.right)/2);
		
	}
	
	
	
}
class Sub extends Calculator{
	//Sub ==> 자식 //
	// subtract 의 left ==>부모의 this(Calculator)객체이다 //
	void substract() {
		System.out.println(this.left+this.right);
	}
	
	
	
	
}