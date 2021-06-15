/*Enter the 1st no
78
Enter the 2nd no
98
the result of the operation a>b is false.

Enter the 1st no
876
Enter the 2nd no
234
the result of the operation a>b is true.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
class  Bignumber{
	public static void main(String[] args) {
		int a,b;
		Boolean c;
		try {
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the 1st no");
			a = Integer.parseInt(reader.readLine());
			System.out.println("Enter the 2nd no");
			b = Integer.parseInt(reader.readLine());
			c = a > b;
			System.out.println("the result of the operation a>b is "+c+".");
		}catch(Exception e) {
			System.out.println("Invalid  "+e);

		}
	} 
}	
