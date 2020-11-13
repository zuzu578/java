
public class testfor {
  

	public static void main(String[] args) {
		A b1 = new B();
		b1.div();
		b1.sum();
		b1.sub();
		Animal h1 = new Human();
		Animal t1 = new Tiger();
		Animal e1 = new Eagle();
		h1.Running();
		t1.Running();
		e1.Running();
		

		
	}
	
	
}
abstract class Animal{
  protected abstract void Running();
	  
}
class Human extends Animal{
	protected void Running() {
		System.out.println("사람이 움직인다.");
	}
}
class Tiger extends Animal{
	protected void Running() {
		System.out.println("호랑이가 움직인다.");
	}
}
class Eagle extends Animal{
	protected void Running() {
		System.out.println("독수리가 움직인다.");
	}
}

class Animal1{
	protected void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Human1 extends Animal1{
	protected void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
}
class Tiger1 extends Animal1{
	protected void move() {
		System.out.println("호랑이가 네발로 뛴다.");
	}
}
class Eagle1 extends Animal1{
	protected void move() {
		System.out.println("독수리가 날아다닌다.");
	}
}


abstract class A {
	protected int k;
	protected int l;
	
	A(){
	 k = 40;
	 l = 20;
	 
	}

    protected abstract void div();
    
	protected void sum() {
	  System.out.println(this.k+this.l);
	}
	protected void sub() {
		System.out.println(this.k-this.l);
	}
}

class B extends A{
	int p ;
	int q ;
	
	B(){
		p = k;
		q = l;
	}
	protected void div() {
		System.out.println(p/q);
	}
	protected void sum() {
		System.out.println(p+q);
	}
	protected void sub() {
		System.out.println(p-q);
	}
	
  
}
