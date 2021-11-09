package deneme;

import java.util.Scanner;

public class toplamaSwitch {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);  
		int kacSayi = 1;
		kacSayi =  input.nextInt();
		int toplam = 0;
		
		switch(kacSayi) {
		case 2:
			for(int i = 0; i<2; i++) {
				System.out.print(i+1 +". sayý => ");
				toplam += input.nextInt();
			}
			break;
		
		case 3:
			for(int i = 0; i<3; i++) {
				System.out.print(i+1 +". sayý => ");
				toplam += input.nextInt();
			}
			break;
		
		case 4:
			for(int i = 0; i<4; i++) {
				System.out.print(i+1 +". sayý => ");
				toplam += input.nextInt();
			}
			break;
			
		case 5: 
			for(int i = 0; i<5; i++) {
				System.out.print(i+1 +". sayý => ");
				toplam += input.nextInt();
			}
			break;
		
		case 6:
			for(int i = 0; i<6; i++) {
				System.out.print(i+1 +". sayý => ");
				toplam += input.nextInt();
			}
			break;
		}
		
		System.out.print("Toplam = " + toplam);
	}
}
