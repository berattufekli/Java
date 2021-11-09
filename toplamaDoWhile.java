package deneme;
import java.util.Scanner;

public class toplamaDoWhile {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("(0 sayýsý girilirse program sonlanýr.)");
		int toplam = 0;
		int sayi;
		
		
		do {
			System.out.print("Lütfen sayi giriniz : ");
			sayi = input.nextInt();
			
			toplam += sayi;
		}
		while(sayi != 0);
		
		System.out.print("Girdiðiniz Sayýlarýn Toplamý : " + toplam);
		
	}
}
