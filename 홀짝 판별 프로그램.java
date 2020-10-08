import java.util.Scanner;

public class javascript {

	
	public static void main(String[] args) {
		//입력받은 수가짝수인지 홀수인지를 판별하는 프로그램을 만들어보자//
		
		//1).입력받을 값을 위해서 스캐너를 호출한다 그리고 스캐너 객체를 만든.//
		Scanner sc = new Scanner(System.in);
		//2).질문을해야죠//
		
		System.out.println("숫자를 입력해주세요.");
	//3).스캐너 객체를 이용해야겠죠 변수를 선언해줍시다.
		
		//4)숫자 - int type;
		
		int num = sc.nextInt();
		
		//5)조건문을 이용해서 참이 면 짝수 거짓이면 홀수 라는것을 출력한다.
		
		//6)짝수의 특징을 알아본다 . 홀수의 특징을 알아본다.//
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
	
		
		
	
		