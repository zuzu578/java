import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dbapp {

	public static void main(String[] args) {
		//정해져있음//
		String driver = "oracle.jdbc.driver.OracleDriver";
		//localhost 부터 공통이 아님 포트번호 , 주소가 필요//
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//user id //
		String user = "system";
		//password//
		String password = "human123";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
			System.out.println("jdbc driver 로딩 성공"); 
			//Statement statement = conn.createStatement();
			Scanner sc1= new Scanner(System.in);
			Scanner sc2 =new Scanner(System.in);
			Scanner sc3= new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			Scanner sc5 = new Scanner(System.in);
			Scanner sc6 = new Scanner(System.in);
		     System.out.println("1.메뉴추가 2.메뉴제거 3.메뉴수정 4.메뉴조회 0.종료");
		     int m1 =sc1.nextInt();
		     while(m1!=0) {
		    	 
		     
		    	 switch(m1) {
		    	 //insert 문//
		    	 case 1:
		    		 String sql1="insert into  fruits values(?,?)";
		    		
		    		 PreparedStatement ps1 = conn.prepareStatement(sql1);
		    		 System.out.println("추가할 메뉴를 입력해주세요.");
		    		 String menu1 = sc2.nextLine();
		    	
		    		 while(!menu1.equals("")) {
		    			 System.out.println("가격을 입력해주세요");
		    	 		 int price1 = sc3.nextInt();
		    			 ps1.setString(1,menu1);
		    			 ps1.setInt(2, price1);
		    			 ps1.executeUpdate();
		    			 System.out.println("추가할 메뉴를 입력해주세요.");
		 		    	 menu1 = sc2.nextLine();
		 		    	 
		    		 }
		    		 ps1.close();
		    		 break;
		    	 
		    	 case 2:	
		    		 //delete (메뉴이름)//
		    		 String sql2 ="delete from fruits where name =?";
		    		 PreparedStatement ps2 = conn.prepareStatement(sql2);
		    		 System.out.println("삭제할 메뉴이름을  입력해주세요.");
		    		 String delete = sc4.nextLine();
		    		 while(!delete.equals("")) {
		    			 System.out.println("삭제할 메뉴를 입력해주세요.(공백 입력시 종료)");
			    		 delete = sc4.nextLine();
			    		 ps2.setString(1, delete);
			    		 ps2.executeUpdate();
							System.out.println("삭제할 메뉴를 입력해주세요. (공백 입력시 종료)");
							delete = sc4.nextLine();
		    		 }
		    		 System.out.println("죵료합니다.");
		 			ps2.close();
		 			break; 
		    	 case 3:
		    		 String sql3 = "update fruits set name=?,price=? where name=?";
		    		 PreparedStatement ps3 = conn.prepareStatement(sql3);
		    		 System.out.println("변경할 메뉴를 입력해주세요.");
		    		 String name2 = sc5.nextLine();
		    		 while(!name2.equals("")) {
			    		 System.out.println("기존 이름을 입력해주세요.");
			    		 String oldName = sc6.nextLine();
			    		 System.out.println("새로운 가격을 입력해주세요.");
			    		 int newPrice1 = sc6.nextInt();
			    		 ps3.setString(1, name2);
			    		 ps3.setString(2, oldName);
			    		 ps3.setInt(3, newPrice1);
			    		 ps3.executeUpdate();
			    		 
						 System.out.println("변경할 메뉴를 입력해주세요.");
						 name2 = sc5.nextLine();
		    		 }
		    		 ps3.close();
		 			 
		    		 break;
		    	 case 4:
		    		 String sql4 = "select * from fruits ";
		    		 Statement stmt=null;
						stmt=conn.createStatement();
						ResultSet rs=stmt.executeQuery(sql4);
						System.out.println("메뉴 | 가격");
						while(rs.next()) {
							String me_name=rs.getString("name");
							int me_price=rs.getInt("price");
							System.out.println(me_name +" | "+me_price);
						}
						stmt.close();
						break;
					default:
						System.out.println("잘못입력하였습니다.");
						break;
					}
					System.out.println("작업선택 1.메뉴추가 2.메뉴제거 3.메뉴수정 4.메뉴조회 0.종료");
					m1=sc1.nextInt();
				}
				System.out.println("종료합니다.");
				conn.close();
		     
		  
		
		    				
	
		}catch (ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패");
		}
		}

	}
	
