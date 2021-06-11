import java.io.BufferedReader;
import java.io.InputStreamReader;
class CircleBufferedReader{  
	public static void main(String args[]){  
		Double radius;
		System.out.println("Enter radius of circle: ");
		try{
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
						radius = Double.parseDouble(reader.readLine());
			Double perimeter=2*3.14 * radius ;
			System.out.println("perimeter " + perimeter);

		}catch(Exception e){
			System.out.println("Error  "+e);

		}


	} 


}