package deneme;

import java.util.Scanner;

public class tekSayilar {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Baþlangýç Sayýsý => ");
		int baslangic = input.nextInt();
		System.out.print("Bitiþ Sayýsý =>");
		int bitis = input.nextInt();
		
		int min = 0, maks = 0;
		
		//çift
		if(baslangic%2==0) {
			min = baslangic/2;
		}

		//tek
		if(baslangic%2==1) {
			min = baslangic/2 + 1;
		}
		
		maks = bitis/2 - 1;
		
		System.out.print("Tek Sayýlar = ");
		
		
		for(int i=min; i<=maks; i++) {
			System.out.print(2*i + 1 + " ");
		}
		
		
		
	}
}
