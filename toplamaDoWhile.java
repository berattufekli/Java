package deneme;
import java.util.Scanner;

public class toplamaDoWhile {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("(0 say�s� girilirse program sonlan�r.)");
		int toplam = 0;
		int sayi;
		
		
		do {
			System.out.print("L�tfen sayi giriniz : ");
			sayi = input.nextInt();
			
			toplam += sayi;
		}
		while(sayi != 0);
		
		System.out.print("Girdi�iniz Say�lar�n Toplam� : " + toplam);
		
	}
}
