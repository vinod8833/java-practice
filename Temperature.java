import java.util.Scanner;
class Temprature{ 
	public static void  main(String[] args) {
		Float fah;
		Double cel;
		System.out.println("Enter Temprature In Fahrenheit:");
		Scanner scan = new Scanner(System.in);  
		fah = scan.nextFloat();
		cel = (fah-32)/1.8;
		System.out.print("Equivalent Temperature In Celsis = "+ cel);
	}
}  