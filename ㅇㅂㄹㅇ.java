//sub2 == 자식//


//부모한테도 sum()함수가있고 자식한테도 sum()함수가있다//
//그러면 메인 함수에서 sum()함수를 호출할때 부모 sum()함수를호출할까? 아니면 자식 sum()함수를//
//호출할까?//
//결론적으로는  부모의 sum()함수를 호출하지않고 자식의 sum()함수를 호출한다//
//이것이 overriding (오버라이딩 이라는것이다.)//
//오버라이딩이란  위와같이 부모의 함수 이름과 자식의 함수이름이 같을때 그 함수를 호출할때, //
//부모의 함수는 호출당하지않고 자식의 함수가 호출당하는 현상(부모가 무시당하고 자식이 호출되는 현상)//
//을 오버라이딩(overriding)이라고 한다. //

public class sub2 extends sub{
	
	public sub2(int left ,int right) {
	    this.left=left;
		 this.right=right;
	}
	
	public void subtract() {
		System.out.println(this.left - this.right);
	}
	public void sum() {
		System.out.println("자식입니다.");
	}

}