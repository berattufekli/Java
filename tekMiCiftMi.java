package deneme;

import java.util.Scanner;

public final class tekMiCiftMi {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int sayi;
		
		for(int i = 0; i<=10; i--) {
			System.out.print("L�tfen say� giriniz : ");
			sayi = input.nextInt();
			if(sayi%2 == 0) {
				System.out.println("Girilen Sayi ("+ sayi + ") �ifttir.");
			}else {
				System.out.println("Girilen Sayi ("+ sayi + ") Tektir.");
			}
		}
		
	}

}
