
public class new2 {

	public static void main(String[] args) {
		
	    /* int num1 = 10;
	     int num2 = 20;
	     //중요한점은 , 함수를 호출할때 매개변수 개수는 함수안에있는 인자의 개수와 비례한다//
	     
	     int sum = add(num1,num2);
	     System.out.println(sum);
			}
*/
		
		
		//클래스와 인스턴스 //
		//Student 라는 클래스를 인스턴스화 해서 객체로 만들고 //
		//메모리상에 잡히게함//
		 Student st1 = new Student(0, null, 0, null);
		System.out.println(st1);
		 System.out.println(st1.getScore());
		 System.out.println(st1.studentName);
		 System.out.println(st1.getStudent());
	}
}
class Student{
	//멤버변수(전역변수)//
	int studentID;
	String studentName;//(=LEE)//
	int grade;
	String address;
	

	//생성자//
	//지금현재는 전역변수(클래스에서 만든 멤버변수)의 값들을 초기화 작업을 해주었다.//
	//어떤 작업을할때 값을 전달받아서 초기화해주는 역할도 함===>기본생성자는 아님//
	//값을 전달받지 않고 초기화 해주는역할도 한다 ==>기본생성자//
	Student(int studentID , String studentName, int grade, String address){
		this.studentID = 2003;
		this.studentName = "Lee";
		this.grade = 100;
		this.address = "seoul";
	}

String getStudent() {
	
   return studentName;	
}
int getScore() {
	return grade;
}
}

	/*private static int add(int num1, int num2) {
		int k = num1+num2;
		return k;
	}
		
	}
	*/

	


