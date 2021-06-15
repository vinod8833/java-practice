/*
length = 
89
width = 
76
perimeter of rectangle is : 330.0
*/

import java.util.Scanner;
class Rectangle{  
	public static void main(String args[]){  
		Double length ;
		Double width ;
		Scanner scan = new Scanner(System.in);
		System.out.println("length = "  );
		length = Double.parseDouble(scan.nextLine());
		System.out.println("width = ");
		width = Double.parseDouble(scan.nextLine());
		Double perimeter= (length + width) *2;
		System.out.println("perimeter of rectangle is : " + perimeter );
	}


}  
