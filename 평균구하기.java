import java.util.Scanner;
import java.util.ArrayList;

public class Example1 {


	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
			int p1 = sc1.nextInt();
			while(p1!=0) {
				a1.add(p1);
				sum = sum+p1;
				System.out.println("점수를 입력해주세요.");
				p1 = sc1.nextInt();
				
			}
			System.out.println(sum/a1.size());
		}
			
}
