package deneme;
import java.util.Scanner;

public class stars {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("lütfen yildiz sayisini giriniz => ");
		int sayi = input.nextInt();
		
		for(int i=1; i<=sayi;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
