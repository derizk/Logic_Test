import java.util.Scanner;

public class FizzBuzz {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int n ;
		
		System.out.println("Masukkan Angka");
		n = sc.nextInt();
		
		
		int[]angka = new int[n];
		
		for(int i = 0; i<n ;i++){ 
			angka[i] = i+1;
			//System.out.println(i);
		}
		
		for(int i = 0; i<angka.length ;i++){ 
			
			if ((angka[i]%3 == 0) && (angka[i]%5 == 0)) {
				
				System.out.print("FizzBuzz"+", ");
			}
			else if (angka[i]%5 == 0) {
				System.out.print("Buzz"+" , ");
			}
			else if (angka[i]%3 == 0) {
				System.out.print("Fizz"+" , ");
			}
			
			else {
				System.out.print(angka[i]+" , ");
			}
			
		}
		
	}
}
