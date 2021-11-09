package deneme;
import java.util.Scanner;

public class deneme {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Satýr => "); 
		int satir = input.nextInt();
		
		for(int i=1; i<=satir; i++) {
			for (int j=1; j<=satir; j++) {
				System.out.print(j + " ");
			}
		}
		
			
		
		
	}
}
