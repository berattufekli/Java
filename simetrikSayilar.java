package deneme;

import java.util.Scanner;

public class simetrikSayilar {
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[10];
		boolean simetrik = false;
		
		for(int i = 0; i<10; i++) {
			System.out.print("Lütfen " + (i+1) + ". sayiyi giriniz : ");
			dizi[i] = input.nextInt();
		}
		
		for(int j=0; j<5;j++) {
			if(dizi[j] == dizi[9-j]) {
				simetrik = true;
			}else {
				simetrik = false;
			}
		}
		
		if(simetrik == true) {
			System.out.println("Verilen sayýlar simetriktir.");
		}else {
			System.out.println("Verilen sayýlar simetriktir deðildir.");
		}
		
		
	}

}
