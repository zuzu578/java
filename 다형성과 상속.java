class Animal{
	public void move() {
		System.out.println("동물들이 움직인다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이 네발로 걷는다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 날아다닌다.");
	}
}
public class Example1 {


	public static void main(String[] args) {
		 Example1 e1 = new  Example1();
		 e1.moveAnimal( new Human());
		 e1.moveAnimal( new Tiger());
		 e1.moveAnimal( new Eagle());
		 A b1 = new B();
		 A c1 = new C();
		 A d1 = new D();
		 b1.move();
		 c1.move();
		 d1.move();
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
abstract class A{
   abstract protected void move();

}

class B extends A{
	protected void move() {
		System.out.println("사람이 움직인다1.");
	}
}
class C extends A{
	protected void move() {
		System.out.println("호랑이가  움직인다1.");
	}
	
}
class D extends A{
	protected void move() {
		System.out.println("독수리가 움직인다1.");
	}
	
}