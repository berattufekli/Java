package deneme;

import java.util.Scanner;

public class forStars {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Satýr Sayýsýný Giriniz : ");
		int sayi = 5;
		sayi = input.nextInt();
		
		for(int i=0;i<sayi;i++) {
			
	
			
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		System.out.print("\n--------------------\n");
		
		
		for(int i=0;i<sayi;i++) {
			
			for(int k = 0; k<sayi-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		System.out.print("\n--------------------\n");
		
		
		for(int i=0;i<sayi;i++) {
			
			for(int j=0; j<sayi-i;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		
		System.out.print("\n--------------------\n");
		
		
		
	}
}
