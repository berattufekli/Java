package deneme;
import java.util.Scanner;

public class enbuyuksayiDoWhile {
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("(0 sayýsý girilirse program sonlanýr.)");
		int enBuyuk = 0;
		int sayi;
		
		do {
			System.out.print("Lütfen Sayý Giriniz : ");
			sayi = input.nextInt();
			
			if(sayi>enBuyuk) {
				enBuyuk = sayi;
			}else {
				continue;
			}
			
		}
		while(sayi != 0);
		
		System.out.print("Girdiðiniz Sayýlarýn En Büyüðü : " + enBuyuk);
		
	}

}
