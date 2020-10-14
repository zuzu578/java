import java.util.Scanner;

import java.util.ArrayList;


public class JavaNew {

	public static void main(String[] args) {
		    //카페 주문 관리 //
		//1) 메뉴를 화면에 표시(메뉴는 배열에 저장해도된다. array list도 가능)
		//2)메뉴번호를 입력하시오.출력 만약 0이면 종료.
	//3) ex 카페라떼 4000 카푸치노 4천 아메리카노 3천 에스프레소 2500  4.얼그레이 25백	
		//4) 메뉴번호가 들어오면 수량을 입력하시오(1이상);
		// --(2) ---(3)을반복 메뉴 번호가 0일때 까지 반복
		// 0이되면 종료  메뉴이름 :x개
		// 총액 ~~ 출력
		//for  
		
		ArrayList alPrice = new ArrayList();//  값을 저장
		ArrayList <Integer>alOrder = new ArrayList();// 주문을 저장
		ArrayList alCount =new ArrayList() ; //수량을 저장
		ArrayList <Integer>alExpanse =new ArrayList();//가격저장//
		
								Scanner sc1 = new Scanner(System.in);//주문//
                              Scanner sc2 = new Scanner(System.in);//수량//
                              Scanner sc3 = new Scanner(System.in);//네 아니오 대답//
                              Scanner sc4 = new Scanner(System.in);
                              Scanner sc5 = new Scanner(System.in);
                              
                              
		         String [] menu = {"1.카페라떼4천원 ","2.카푸치노3천원","3.아메리카노2천원","4.얼그레이2천500원"};
		            //---> 커피 가격 저장 <----//  
					         alExpanse.add(4000);//1. 카페라떼//
					         alExpanse.add(3000);//2. 카푸치노//
					         
					         alExpanse.add(2000);//3. 아메리카노//
					         alExpanse.add(2500);//4.얼그레이 //
		              
		                   Object  a = alExpanse.get(0);
                             System.out.println("메뉴를 선택해주세요.");
                             System.out.println(menu[0]);
                             System.out.println(menu[1]);
                             System.out.println(menu[2]);
                             System.out.println(menu[3]);
                             int select = sc1.nextInt();
                             alOrder.add (select);//주문을 저장 //
                            
                             
                             alOrder.get(select);
                            	  System.out.println("수량을 입력해주세요.");
                             int count =sc2.nextInt();
                             alCount.add(count);// 수량을 저장 // 
                             System.out.println("수량"+count+"개"+"주문"+select+"번"+"맞나요?");
                             System.out.println("1.네,2.아니오.");
                             int  answer = sc3.nextInt();
                             if(answer ==1){
                            	 System.out.println("수량"+count+"입니다."+"가격은"+(count* alExpanse.get(select))+"입니다.");
                             }
                           
                             
                             
                          

                             
                            
                     
                        
                             
                             
                             
	    }


			
			}
		
		
	
		

