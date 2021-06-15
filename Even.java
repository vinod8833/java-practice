
/*Enter The Integer : 
67878786
Even
Enter The Integer : 
45453
Odd*/


import java.util.Scanner;
class Even{
	public static void  main(String[] args) {
		System.out.println("Enter The Integer : ");
			Scanner scan = new Scanner(System.in);
			Integer num = Integer.parseInt(scan.nextLine());
			if (num %2 == 0){
			System.out.println("Even");
			}
			else{
			System.out.println("Odd");
			}

			} 
		}