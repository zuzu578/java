package list.arraylist.implementation;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		//인터페이스는 인스턴스화(객체화)할수없다.//
		//newi n1 = new newi();//
		//D d1 = new D();
		int num1 = 10;
		int num2 =5;
		//묵시적 클래스 타입 캐스팅(Upcasting)
		C c1 = new D();
		System.out.println(c1.add(num1, num2));
		System.out.println(c1.divide(num1, num2));
		System.out.println(c1.substract(num1, num2));
		System.out.println(c1.times(num1, num2));
		
		//interface ==> default 를 이용한 메서드 ==> java8에서 등장//
		System.out.println(c1.running(100, 200));
		
		//interface ==> static 을 이용한 메서드 ==> java8에서 등장//
		System.out.println(newi.speaking(500,700));
		c1.description();
		//static 메소드 사용법//
		int[]arr= {1,2,3,4,5};
		System.out.println(newi.total(arr));		
		//private 메소드 사용//
		//defualt 메소드를 같이 사용해서 활용//
		c1.Usage();
		//private static 메소드 사용방법//
		c1.Usage2();
		
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.hello();
}
}
class Customer implements interface2,interface3{
	
	@Override
	public void hello() {
		//!중요!
		//이름이 서로다른 인터페이스에서 같은 이름의 default 메서드를 선언하면 에러가 발생한다.//
		//때문에 구현해주는 클래스에서 이들을 오버라이딩해주면된다.//
		interface3.super.hello();
		
	}
	
	
	
	
	//한클래스에서 여러개의 인터페이스 구현가능.//
	@Override
	public void sell() {
		System.out.println("구매");
		
	}
	

	@Override
	public void buy() {
		System.out.println("판매");
	}


	
}



abstract class C implements newi{
	//추상에서는 인터페이스와 달리 일반메서드를 가질수있고, 생성자메서드를 가질수있다.//
	int k ; 
	int j ;
	//추상에서는 멤버변수를 선언할수있다.//
	C(){
		
	}
	public int add(int num1, int num2) {
		return num1+num2;
	}

	public int substract(int num1 , int num2) {
		 return num1-num2;
	 }
}
class D extends C{
	public void description() {
		//super.description();//인터페이스에서의 description()메서드를 호출한것//
		System.out.println("설명2");
		
	}
	
	public int times(int num1 ,int num2) {
		return num1 * num2;
	}
	public int divide(int num1 , int num2) {
		if(num2 !=0) {
			return num1/num2;
		}else {
			return newi.ERROR;
		}
	}
	
}