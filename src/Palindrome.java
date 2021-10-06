import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {
	
	public static void main (String[]args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String kata1;
		String kata2 = "";
		
		System.out.print ("Masukkan kata : ");
		kata1 = br.readLine();
		
		int p = kata1.length();
		
		for(int i = p-1;i>=0;i--) {
	
			kata2 = kata2+kata1.charAt(i);
			//
			
			System.out.println(kata2);
		}
		
		if (kata1.equals(kata2)) {
			
			System.out.println("true");
			
		}
		
		else {
			System.out.println("false");
		}
	}
		
	
}
