package new1;
import java.util.Scanner;
import java.util.ArrayList;




public class nnew {
       
 
	public static void main(String[] args) {
/*엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서
 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가
 매개변수로 주어질 때
 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 
 함수를 완성해주세요.*/
//1) 키패드를 담는 ArrayList 가 필요하다//
		ArrayList key = new ArrayList();
		
		key.add(1);
		key.add(2);
		key.add(3);
		key.add(4);
		key.add(5);
		key.add(6);
		key.add(7);
		key.add(8);
		key.add(9);
		key.add(0);
		
		ArrayList direction = new ArrayList();
		
		direction.add("left");
		direction.add("right");
		
		//본인이 오른손잡이라고 가정할때//
		
		/*for(int i =0 ; i<=8; i++) {
			System.out.println(key.get(i)+""+"은");
		}*/
		
		/*System.out.println(key.get(0)+""+"은"+direction.get(0)+"이다.");
		System.out.println(key.get(1)+""+"은"+direction.get(1)+"이다.");
		
		System.out.println(key.get(2)+""+"은"+direction.get(1)+"이다.");
		
		System.out.println(key.get(3)+""+"은"+direction.get(0)+"이다.");
		
		System.out.println(key.get(4)+""+"은"+direction.get(1)+"이다.");
		
		System.out.println(key.get(5)+""+"은"+direction.get(1)+"이다.");
		
		System.out.println(key.get(6)+""+"은"+direction.get(0)+"이다.");
		
		System.out.println(key.get(7)+""+"은"+direction.get(1)+"이다.");
		
		System.out.println(key.get(8)+""+"은"+direction.get(1)+"이다.");*/
		
		
		
		
		
		/*문제 설명
	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	
	
	
	제한 조건
	a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
	a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
	a와 b의 대소관계는 정해져있지 않습니다.
         */
		/*int a = 5; 
		int b = 10;
		//==> a와 b 사이에있는 수는 5 6 7 8 9 10 //
		
		// 5부터 10 까지의 합을 리턴해주면 된다 //
		
		int sum = 0 ; 
		
		for(int i = 5 ; i<=10 ; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
		//ex2) 위의 숫자처럼 a가 3이고 b가 5인경우//
		//3..4..5..세숫자의 합 //
		int sum1 = 0 ;
		for(int i = 3;  i<=5;  i++) {
			sum1= sum1+i;
			System.out.println(sum1);
			
		}*/
		/*문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.*/
		
	/*int x = 47 ; 
    if(x%(4+7)==0) {	
    	System.out.println(x +"는하샤드 수이다.");
    }else {
    	System.out.println(x +"는하샤드 수가 아니다.");
    }*/
		
		
		/*임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
		n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.*/
		//예를 들 어서 121은 양의 정수 11의 제곱 이다.//
		//따라서 (11+1)을 제곱한 144를 리턴한다.//
	    //100 이라는 숫자의 제곱근은 10이다//
		/*
		int n =10000 ;
		int x = 100;
		//그 제곱근을 표현한 math함수는 math.pow로 표현//
		double target1 = Math.pow(x, 2); //10000의제곱
		//만약 math.pow(제곱근을 표현한 내장함수가)위의 n 과 일치한다면//
	     if(target1==n) {
	    	 //제곱근이므로 참 따라서 위의 문제에서 나온것처럼 x+1이라는 조건을 출력//
	    	 int k  = (x+1);
	    	  target1 = Math.pow(k, 2);
	    	  System.out.println(target1);
	     }else {
	    	System.out.println(-1);
	     }
	 	
		*/
		
		
		
		
       //1-1. 입력된 수가 짝수라면 2로 나눕니다. 
		//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
		//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
		//답이 1이 될때까지 반복//
       /*
		Scanner sc1 = new Scanner(System.in);
		  String s = "String";
	        int s_len = s.length();//길이 구하기
             if(s_len%2==0) {
            	 System.out.println("ri");
             }
	      */
		/*System.out.println("정수를 입력해주세요.");
		int n = sc1.nextInt();
		//조건1. 1이 될때까지 반복한다.//
		//반복 = while ,
		//답을 변수에다 넣는다//
		int answer1 = 0;
		int answer2 = 0;*/
		
		
	
		//짝수이면 2로나눈다 그값을 넣는다//
		//홀수이면 3을 곱하고 1을 더한다//
		//중요한 사실 => 나누는것과 짝수인지 홀수인지를 비교하는 작업이 반복된다//
		//나눳을때 나오는 똑같은 값을 반복하는게 아니라//
		//2로 나누고 확인하고 짝수면 또2 로나누고 하는 작업이 필요함 //
		/*while(true) {
		 if(n%2==0) {
			 System.out.println(n/2);
		 }else {
			 System.out.println((n*3)+1);
		 }
		}
		}*/
		/*if(n%2==0) {
			for(int i = n ; i<=answer1; i++)
			answer1 = (n/2);
			System.out.println(answer1);
		//홀수이면 3을 곱하고 1을 더한다//
		}else {
			for(int i = n ; i<=answer2; i++)
			answer2 = ((n*3)+1);
			System.out.println(answer2);
		}*/
		
		
		
	}


}

	
