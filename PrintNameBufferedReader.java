import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrintNameBufferedReader{
	public static void  main(String[] args) {
		String name ;
		System.out.println("Enter name ");
	
		try{
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
			name = reader.readLine();
			System.out.println("Hello "+name+" How are you ?");
		}catch(Exception e){
			 System.out.println("Error  "+e);

	    }

	}
}

	