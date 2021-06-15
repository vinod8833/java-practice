/*
The Substring 5th Position =  Standing
The Substring From 5th Index and Excluding 10th Index =  Stan
The First Position of The Character m =2
The Position of (m) From 5th Character = 3
The Compare String = 0
The Reversed String  ESOB ARDNAHC HSABUS
*/

import java.util.Scanner;
class StringTesting{ 
	public static void  main(String[] args) {
		StringBuilder sb =  new StringBuilder("SUBASH CHANDRA BOSE ");

		String a = "Under Standing";
		String b = "Computer";
		String c = "Prime Number";
		String d1 = "COMPUTER FEST";
		String d2 = "COMPUTER FEST";
		System.out.println("The Substring 5th Position = "+a.substring(5));
		System.out.println("The Substring From 5th Index and Excluding 10th Index = "+a.substring(5,10));
		System.out.println("The First Position of The Character m ="+b.indexOf ('m'));
		System.out.println("The Position of (m) From 5th Character = "+c.indexOf('m'));
		System.out.println("The Compare String = "+d1.compareTo(d2));

		System.out.println("The Reversed String "+sb.reverse());





	}  
}  
