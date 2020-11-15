
public class testfor {
  

	public static void main(String[] args) {
		//upcasting//
		//==> 묵시적클래스 형변환//
		A a1 = new B();
		a1.move();//===> 오버라이딩 되어서 하위클래스(B)의 재정의된 내용이 나온다.//
		Bus bus = new Bus();
		AutoCar autocar = new Bus();
		bus.run();
		autocar.run1();
		bus.refuel();
		autocar.refuel1();
		bus.takePassenger();
		autocar.load();
		bus.stop();
		autocar.stop1();
	
	}
}
abstract class AutoCar{
	protected void run1() {
		System.out.println("차가 달린다.");
	}
	protected void stop1() {
		System.out.println("차가 멈춘다.");
	}
	protected void refuel1() {
		System.out.println("휘발유를 주유한다.");
	}
	abstract protected void run();
	abstract protected void load();
	abstract protected void stop();
	abstract protected void refuel();
	abstract protected void takePassenger();
	
}
class Bus extends AutoCar{
		protected void run() {
	    System.out.println("버스가 달린다.");
		
	}
		protected void load() {
		System.out.println("짐을 싣는다.");
		
	}
		protected void stop() {
		System.out.println("버스가 멈춘다.");
		
	}
		protected void refuel() {
		System.out.println("천연가스를 주유한다.");
			
		}
		protected void takePassenger() {
		System.out.println("승객을 버스에 태운다.");
			
		}
	
}
abstract class A{
	//추상 클래스는 추상메서드와 일반 메서드를 가질수있다.//
	//추상메서드==>body가 없고 머리만 달려있다.//
	abstract protected void running();
	//일반 메서드==>body가 있고 머리도 달려있다.//
	//==>body 가 있다는것 자체가 안에 로직이 담겼다는 의미.//
	protected void move() {
		
	}
}
class B extends A{
	//추상 메서드는 오버라이딩(재정의)해서 사용 할수있다.//
	
	protected void running() {
		System.out.println("달린다.");
	}
	protected void move() {
		System.out.println("움직이기.");
	}
	
}