

public class testfor {

	public static void main(String[] args) {
		
		Animal a1 = new Human();
		Animal a2 = new Tiger();
		Animal a3 = new Rabbit();
		SuperUltra s1 = new SuperUltra(20,30);
		a1.Running2();
		a1.Running();
		a2.Running2();
		a2.Running();
		a3.Running2();
		a3.Running();
		Function(5);
		}
	
		public static void Function(int number) {
			if(number==0) {
				return;
			}else {
				System.out.println("hello");
				
				Function(number-1);
			}
		}
}
	class SuperUltra{
		int k;
		int l;
		
		SuperUltra(int x, int y){
			this.k = x;
			this.l = y;
			
		}
		protected void Running01() {
			System.out.println("Running01");
			System.out.println(this.k+this.l);
		}
		
		
	} 
	class Sub extends SuperUltra{
		int p;
		int q;
		Sub(int x, int y) {
			super(x, y);
		}
		protected void Sum() {
			System.out.println(p+q);
		}
		
	}
	abstract class Animal{
		protected void Running() {
			System.out.println("Running");
		}
		protected abstract void Running2();
		protected void Speaking() {
			System.out.println("parents,say");
		}
		
	}
	class Human extends Animal{
		protected void Running() {
			System.out.println("human, running");
		}
		protected void Running2() {
			System.out.println("Human,running");
		}
		protected void Speaking() {
			System.out.println("Human Speaking");
		}
		
	}
	class Tiger extends Animal{
		protected void Running() {
			System.out.println("Tiger, running");
		}
		protected void Running2() {
			System.out.println("Tiger,running");
		}
		protected void Speaking() {
			System.out.println("Tiger Speaking");
		}
		
	}
	class Rabbit extends Animal{
		protected void Running() {
			System.out.println("Rabbit, running");
		}
		protected void Running2() {
			System.out.println("Rabbit,running");
		}
		protected void Speaking() {
			System.out.println("Rabbit Speaking");
		}
		
	}




