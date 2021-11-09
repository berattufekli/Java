package deneme;

import java.util.Scanner;

public class enBuyukEnKucuk {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int sayi, enBuyuk = 0, enKucuk =0;
		System.out.println("(0 girerseniz program sonlanýr)");
		
		System.out.print("Sayi giriniz : ");
		sayi = input.nextInt();
		enBuyuk = sayi;
		enKucuk = sayi;
		
		do {
			
			
			if(sayi == 0) {
				break;
			}
			
			
			if(sayi>enBuyuk) {
				enBuyuk = sayi;
			}
			
			if(sayi<enKucuk) {
				enKucuk = sayi;
			}
			
			
			
		}while(sayi != 0);
		
		System.out.println("En Büyük Sayý: "+ enBuyuk);
		System.out.println("En Küçük Sayý: "+ enKucuk);
		
		
	}		
}
