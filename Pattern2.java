import java.util.Scanner;
class Pattern2{
	public static void main(String[] args) {

		System.out.print("Enter number ");
		Scanner scan = new Scanner(System.in);
		Integer num = Integer.parseInt(scan.nextLine());


		for (int i = num; i > 0; i--) {
			for (int j = 0;j < i; j++){
				System.out.print("*");

			}
			System.out.println();
		}
	}

}


