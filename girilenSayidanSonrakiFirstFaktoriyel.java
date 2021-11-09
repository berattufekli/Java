package deneme;

import java.util.Scanner;


public class girilenSayidanSonrakiFirstFaktoriyel {
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int sayi = input.nextInt();
		int faktoriyel = 1;
		
		
		for(int i=1; i<=sayi; i++) {
			
			faktoriyel *= i;
			
			if(faktoriyel>=sayi) {
				System.out.print("Girilen sayýdan sonraki ilk faktoriyel ("+ i +"!) : "+ faktoriyel);
				break;
			}
			
		}
		
	}

}
