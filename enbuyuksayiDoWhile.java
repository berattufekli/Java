package deneme;
import java.util.Scanner;

public class enbuyuksayiDoWhile {
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("(0 say�s� girilirse program sonlan�r.)");
		int enBuyuk = 0;
		int sayi;
		
		do {
			System.out.print("L�tfen Say� Giriniz : ");
			sayi = input.nextInt();
			
			if(sayi>enBuyuk) {
				enBuyuk = sayi;
			}else {
				continue;
			}
			
		}
		while(sayi != 0);
		
		System.out.print("Girdi�iniz Say�lar�n En B�y��� : " + enBuyuk);
		
	}

}
