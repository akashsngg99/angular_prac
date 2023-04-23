package java_pattern_q_solutions;

import java.util.Scanner;

public class solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		int ip=sc.nextInt();
		patterns p=new patterns();
		switch(ip) {
		case 1:
			p.Square_Hollow_Pattern(4);
		case 2:
			p.Number_triangle_Pattern(4);
		case 3:
			p.Number_increasing_Pyramid_Pattern(4);
		case 4:
			p.Number_increasing_reverse_Pyramid(4);
		case 5:
			p.Number_changing_Pyramid(4);
		case 6:
			p.Zero_One_Triangle(5);
		case 7:
			p.Palindrome_Triangle(4);
		case 8:
			p.Rhombus(4);
		case 9:
			p.Diamond(4);
			
		
		}
			
		
		
		
		
		
		
	}
	

}
