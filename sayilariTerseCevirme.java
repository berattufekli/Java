package deneme;
import java.util.Scanner;

public class sayilariTerseCevirme {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int sayi, sonBasamak, tersi = 0;
		System.out.print("Lütfen bir sayý giriniz : ");
		sayi = input.nextInt();
		
		do {
			sonBasamak = sayi%10;
			tersi =  (tersi*10) + sonBasamak;
			sayi /= 10;
			
		}
		while(sayi>0);
		
		System.out.print("Tersi : "+ tersi);
		
	}
}