import java.util.Scanner;
public class Vending {

	public static void main(String[] args) {
		Menu1 m1 = new Menu1();
		Order1 o1 = new Order1();
		 SelectChoice s = new  SelectChoice();
		 s.EventMessage();
		 Scanner sc1= new Scanner(System.in);
	      int select =sc1.nextInt();
	  while(select!=0) {
		  if(select==1) {
			  m1.buildMenu();
		  }else if(select==2) {
			  m1.deleteMenu();
		  }else if(select==3) {
			  m1.updateMenu();
		  }else if(select==4) {
			  m1.selectMenu();
		  }else if(select==5) {
			  o1.makeOrder();
			  
		  }else if(select==6) {
			  o1.orderList();
		  }
		  	  s.EventMessage();
			  sc1= new Scanner(System.in);
		  
	  }
	  	System.out.println("종료되었습니다.");

	}

}


import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Menu1 {
	ArrayList <String>a1 = new ArrayList<String>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Scanner sc5 = new Scanner(System.in);
    Scanner sc6 = new Scanner(System.in);
	
    Menu1(){
    	a1 = new ArrayList();
    	a2 = new ArrayList();
    	
    	
    }
    void buildMenu(){
    	//String sql1 = "insert into menu values(?,?)";//
    	//PreparedStatement ps1 =con.prepareStatement(sql1);//
    	System.out.println("추가하실 메뉴를 입력해주세요.");
    	String addMenu = sc1.nextLine();
    	a1.add(addMenu);
    	while(!addMenu.equals("")) {
    	      
    	     System.out.println("추가하실 가격을 입력해주세요.");
    	     int addPrice = sc2.nextInt();
    	     a2.add(addPrice);
    	    // ps1.setString(1,addMenu);
    	    // ps1.setInt(2,addPrice);
    	    // ps1.executeUpdate();
    	     System.out.println("추가하실 메뉴를 입력해주세요.");
    	     addMenu = sc1.nextLine();
    	     a2.add(addPrice);
    	     
    	     
    	}
    	
    	
    	//ps1,close();
    	
    	
    	
    }
    void deleteMenu() {
    	//String  sql2 = "delete from menu where name =?";
    	//PreparedStatement ps2 = conn.prepareStatement(sql2);
    	System.out.println("삭제할 메뉴를 입력해주세요.");
    	String deleteMenu = sc3.nextLine();
    	while(!deleteMenu.equals("")) {
    		//ps2.setString(1,deleteMenu);
    		//ps2.executeUpdate();
    		
    	}
    	//ps2.close();
    	
    	
    }
    void updateMenu() {
    	//String sq13 = "update menu set name =? , price =? where name=?";
    	//PreparedStatement ps3 = conn.prepareStatement(sql3);
    	System.out.println("변경하실 기존의 이름을 입력해주세요.");
    	String oldName = sc4.nextLine();
    	while(!oldName.equals("")) {
    		System.out.println("변경하실 새로운 이름을 입력해주세요.");
    		String newName =sc5.nextLine();
    		System.out.println("새로운 가격을 입력해주세요.");
    		int newPrice = sc6.nextInt();
    		//ps3.setString(1,newName);
    		//ps3.setString(2,oldName);
    		//ps3.setString(3,newPrice);
    		//ps3.executeUpdate();
    	
    	}
    	//ps3.close();
    	
    	
    }
    void selectMenu() {
    	//String sql4 = "select name,price from menu";
    	//Statement stmt = null;
    	//stmt = conn.createStatement();
    	//ResultSet rs = stmt.executeQuery(sql4);
    	//while(rs.next()) {
    	//	String name = rs.getNString("name");
    	//	int price  = rs.getInt("price");
    		
    		
    	}
    	//stmt.close();
    	
    	
    }
    import java.util.Scanner;
import java.util.ArrayList;
public class Order1 {
	
	ArrayList <Integer>choiceAl= new ArrayList<Integer>();
	ArrayList <Integer>countAl= new ArrayList<Integer>();
	ArrayList <String>mobileAl=new ArrayList<String>();
	
	Scanner sc1= new Scanner(System.in);
	Scanner sc2= new Scanner(System.in);
	Scanner sc3= new Scanner(System.in);
	Order1(){
		choiceAl=new ArrayList<Integer>();
		countAl=new ArrayList<Integer>();
		mobileAl=new ArrayList<String>();
		
	}
	
	void makeOrder() {
		System.out.println("상품을 선택해주세요.");
		int choice = sc1.nextInt();
		choiceAl.add(choice);
		while(choice!=0) {
			System.out.println("수량을 입력해주세요.");
			int count = sc2.nextInt();
			countAl.add(choice);
			System.out.println("모바일 번호를 입력해주세요.");
			String mobileNumber = sc3.nextLine();
			mobileAl.add(mobileNumber);
			System.out.println("상품을 선택해주세요.");
			choice = sc1.nextInt();
			choiceAl.add(choice);
		}
		
		
	}
	void orderList() {
		System.out.println(choiceAl);
		System.out.println(countAl);
		System.out.println(mobileAl);
		
		
	}
	
	
	
	
	

}
