/*
Enter name 
vinod
Hello vinod How are you ?
*/

import java.util.Scanner;

class PrintNameScanner{
	public static void  main(String[] args) {
		String name ;
		System.out.println("Enter name ");
		Scanner scan = new Scanner(System.in);  
		name = scan.nextLine();
		System.out.println("Hello "+name+" How are you ?");

	}
}

	