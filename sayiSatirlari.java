package deneme;

import java.util.Scanner;

public class sayiSatirlari {
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen sat�r say�s� giriniz: ");
		int satir = input.nextInt();
		int sayi = 0;
		
		for(int i = 0; i<satir; i++) {
		
			for(int j = 0; j<=i;j++) {
				System.out.print(++sayi +  " ");
			}
			
			System.out.print("\n");
		}
	}
	
}
