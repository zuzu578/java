			//메인 호출 클래스 //

import java.util.Scanner;
import java.util.ArrayList;

public class Pokemonster {

	public static void main(String[] args) {
		pokemon1 p1 = new pokemon1();
		ArrayList c1= new ArrayList();
		
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
		Scanner sc4= new Scanner(System.in);
		
		Fight f1 = new Fight();
	    System.out.println("야생의 한카리아스가 등장했다. 가랏 꼬부기!");
	    
		bag b = new bag();
		
		Run r = new Run();
		EventMessage e = new EventMessage();
		
		
		//!배틀이벤트!//
		f1.FirstSelect();
		int n1 = sc1.nextInt();
		while(n1!=4) {
		if(n1==1) {
			f1.BuildAttack1();
			int n2 = sc2.nextInt();
			if(n2==1) {
				e.eventMessage1();
			}else if(n2==2) {
				e.eventMessage2();
			}else if(n2==3) {
				e.eventMessage3();
			}else if(n2==4) {
				e.eventMessage4();
			}
			f1.FirstSelect();
			 n1 = sc1.nextInt();
		
			//포켓몬 체인지 이벤트//
		}else if(n1==2) {
			p1.ShowPokemon1();
			int n3 = sc3.nextInt();
		   if(n3==1) {
			   p1.changeEvent1();
		   }else if(n3==2) {
			   p1.changeEvent2();
		   }else if(n3==3) {
			   p1.changeEvent3();
			   
		   }else if(n3==4) {
			 p1.changeEvent4();
		   }
			f1.FirstSelect();
			 n1 = sc1.nextInt();
		 
		}else if(n1==3) {
		   b.AllItems();
		   int n5= sc3.nextInt();
		   
		}
		}
		r.GiveupMatch();
	}


}