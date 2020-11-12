package fff;

public class fff {

	public static void main(String[] args) {
		Pc2 p2 =new Pc2();
		p2.display();
		p2.typing();

	}

}
abstract class Pc{
	//추상메소드//
	//추상메소드는 상속을 강제해서 그내용을 재정의해서 사용해야한다//
	//추상메소드는 상속을 강제해서 오버라이딩된내용을 사용하게한다.//
	abstract void display();
	abstract void typing();
	//일반메소드//
	void turnOn() {
		System.out.println("power on");
	}
	void turnOff() {
		System.out.println("power off");
	}
}
class Pc2 extends Pc{
	//추상클래스를 상속받기위해서는//
	//1)추상클래스에 있는 추상메소드를 자식한테 구현해야한다.//
	//2)자식의 클래스를 추상클래스로 바꾸어준다.//
	
	void display(){
		System.out.println("display");
	}
	void typing() {
		System.out.println("typing");
	}
}
