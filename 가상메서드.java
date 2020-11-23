import java.util.ArrayList;
public class testfor {


	public static void main(String[] args) {
		Animal a1 = new Human();
		Animal a2 = new Human();
		Animal a3 = new Human();
		Animal a4 = new Human();
		Animal a5 = new Human();
		
		
		Animal a6 = new Tiger();
		Animal a7 = new Eagle();
		a1.running();
		a2.running();
		a3.running();
		a4.running();
		a5.running();
	

	 		

}

}

abstract class Animal{
	protected abstract void running();
	
	
}
class Human extends Animal{
	protected void running() {
		System.out.println("사람이 달린다.");
		
	}
	
	
}
class Tiger extends Animal{
	protected void running() {
		System.out.println("호랑이가 달린다.");
	}
	
	
}

class Eagle extends Animal{
	protected void running() {
		System.out.println("독수리가날아 다닌다.");
	}
	
	
}



