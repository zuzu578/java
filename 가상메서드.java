class Animal{
	void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Human extends Animal{
	void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
	
}
class Tiger extends Animal{
	void move() { 
		System.out.println("호랑이가 네발로 뛴다");
	}
}
class Eagle extends Animal{
	void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
}
public class new2 {

	public static void main(String[] args) {
		new2 a1 = new new2();
		a1.moveAnimal(new Human());
		a1.moveAnimal(new Tiger());
		a1.moveAnimal(new Eagle());
	}
	
	void moveAnimal(Animal animal) {
		animal.move();
	}

}
