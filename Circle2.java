import java.util.Scanner;
class Circle2{  
	public static void main(String args[]){  
		Double radius;
		System.out.println("Enter radius of circle: ");
		Scanner scan = new Scanner(System.in);
		radius = Double.parseDouble(scan.nextLine());
		Double perimeter=2*3.14 * radius ;
		System.out.println("perimeter " + perimeter);
	}


}  
