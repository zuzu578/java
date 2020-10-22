//sub == 부모 // 
public class sub {
	//멤버변수(전역변수)//
	int left , right; 
	
	public sub() {
		//기본 생성자//
	}
	public sub(int left, int right) {
		//this. 멤버변수들을 가리킨다// 
		this.left = left;
		this.right= right;
	}
	public void setOperands(int left , int right) {
		this.left = left;
		this.right = right; 
		
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}

	
	

}