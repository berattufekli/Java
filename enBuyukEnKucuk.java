package deneme;

import java.util.Scanner;

public class enBuyukEnKucuk {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int sayi, enBuyuk = 0, enKucuk =0;
		System.out.println("(0 girerseniz program sonlan�r)");
		
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
		
		System.out.println("En B�y�k Say�: "+ enBuyuk);
		System.out.println("En K���k Say�: "+ enKucuk);
		
		
	}		
}
