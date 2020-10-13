import java.util.Scanner;
public class JavaNew {

	public static void main(String[] args) {
		
		//for1 :읽어들이고 저장//
		//for 2 :출력//
		
		Scanner sc = new Scanner(System.in);
		String[]a = new String[9];
		//----> ! 이름을 총 학생수 에 맞게 배열에맞게 입력받는다.! 9번 <-------//
		for(int i = 0 ; i<9 ; i++){
			
			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			//------>! 스캐너의 내용물을 배열에다 저장 !<-------//
			a[i]=name;		
		}
		//------------>! 배열에 저장한내용(a[])배열을 j 가 1증하하면서 반복하는 반복문을 통해 출력! <------------//
		 for(int j = 0 ; j<9 ; j++){
			 System.out.println(a[j]);
		 }
	
			
		
         	
	
	
		
	}
	}


