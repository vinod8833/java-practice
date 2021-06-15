/*
Enter number
76776889
the value of 76776889 * 2 is 153553778*/


import java.util.Scanner;
class Number{
	public static void  main(String[] args) {
	 		Integer num=10, result; 
			System.out.println("Enter number");
			Scanner scan = new Scanner(System.in);  
			num = Integer.parseInt(scan.nextLine());
			result = num *2;
			System.out.println("the value of "+num+" * 2 is " + result);
	}
}