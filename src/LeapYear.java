import java.util.Scanner;

public class LeapYear {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yearA , yearB = 0;
		
		System.out.println("Masukkan Tahun 1");
		yearA = sc.nextInt();
		System.out.println("Masukkan Tahun 2");
		yearB = sc.nextInt();
		
		for(int i = yearA+4;i<=yearB;i++) {
			System.out.print(i+", ");
		}
	}
}