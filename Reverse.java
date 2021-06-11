import java.util.Scanner;
import java.io.BufferedReader;
class Reverse{
	public static void  main(String[] args) {
		System.out.println("Enter Name");
		Scanner scan = new Scanner(System.in);  
		StringBuilder sb = new StringBuilder("");
		sb.append(scan.nextLine());

		System.out.println("Reverse name is " + sb.reverse());
	}
}
