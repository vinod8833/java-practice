
/*

Enter number 6
     *
    ***
   *****
  *******
 *********
***********


*/

import java.util.Scanner;
class TriangleStar{
	public static void main(String[] args) {
		int i,j,space ;
		System.out.print("Enter number ");
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.parseInt(scan.nextLine());
		space= n-1;
		for(j=1;j<=n;j++){	
			for(i=1;i<=space;i++){
				System.out.print(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++){		

				System.out.print("*");
			}
			System.out.println();

			
		}
		
	}

	
	
}

