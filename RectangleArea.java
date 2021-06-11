import java.util.Scanner;
class RectangleArea{  
	public static void main(String args[]){  
		Double length ;
		Double width ;
		Scanner scan = new Scanner(System.in);
		System.out.println("length = "  );
		length = Double.parseDouble(scan.nextLine());
		System.out.println("width = ");
		width = Double.parseDouble(scan.nextLine());
		Double area= (length * width);
		System.out.println("Area of Rectangle is: "+area);
	}


}  
