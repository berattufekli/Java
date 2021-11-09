package deneme;

import java.util.Scanner;

public class fonksiyonlar {
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.print("lütfen ilk sayiyi giriniz: ");
		int ilk = input.nextInt();
		System.out.print("lütfen son sayiyi giriniz: ");
		int son = input.nextInt();
		
		System.out.println(topla(ilk, son));
		
		
		
		
	}
	
	public static int topla(int ilk, int son) {
		int toplam = 0;
		for(int sayi = ilk; sayi<=son; sayi++) {
			toplam += sayi;
		}
		
		return toplam;
	}

}
