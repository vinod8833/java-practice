import java.util.Scanner;
class NewApplication{
	public static void  main(String[] args) {
String name ;
		System.out.println("Enter name ");
			Scanner scan = new Scanner(System.in);  
				name = scan.nextLine();
String email ;
		System.out.println("Enter email ");
		 		email = scan.nextLine();
		      
float p ,r ,t, sinterest;
				System.out.println("Enter the prinicipal : ");
		p = scan.nextFloat();
		System.out.println("Enter the rate of interest : ");
		r = scan.nextFloat();
		System.out.println("Enter the time period : ");
		t = scan.nextFloat();
		scan.close();
		sinterest = (p * r * t) / 100;
		System.out.println("Simple Interest is: " +sinterest);

        Scanner input = new Scanner(System.in);

        
    }
}



		

		