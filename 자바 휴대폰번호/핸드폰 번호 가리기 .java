import java.util.Scanner;
import java.util.ArrayList;

public class Example {
        

	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		c1.Phone();
		
		/*int sum1 = 0;
        int[] a = {3,2,4,5,1};
        
        for(int i = 0 ; i<a.length;i++) {
          sum1 = a[i]+sum1;
       
        	
        }
        System.out.println("총합은"+sum1);
        System.out.println("평균은"+sum1/a.length);*/
		
		//월//
	   
		
		//홀수는 소문자 짝수번째는 대문자 
       /*프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

		제한 조건
		s는 길이 4 이상, 20이하인 문자열입니다.
		입출력 예*/
		//01033334444	*******4444//
		
		}   
}
class Calculate{

	public void Phone() {
		String[]a = new String[11];
		a[0]="0";
		a[1]="1";
		a[2]="0";
		a[3]="3";
		a[4]="0";
		a[5]="8";
		a[6]="0";
		a[7]="3";
		a[8]="4";
		a[9]="8";
		a[10]="2";
	
		
		for(int i = 0 ; i <7; i++ ){
		    
		  a[i]="*";
		  
			
		}
	   for(int j = 0 ;  j<11 ;j++) {
		   System.out.print(a[j]);
	   }
		
		
		
		
	}
	
}
