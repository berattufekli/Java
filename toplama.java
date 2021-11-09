package deneme;

import java.util.Scanner;

public class toplama {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Kaç sayý => ");
		int kacsayi = input.nextInt();
		int sayac = 0;
		int toplam = 0;
		
		while(sayac != kacsayi) {
			System.out.print(sayac+1 + ". sayý => ");
			toplam += input.nextInt();
			sayac+=1;
		}
		
		System.out.print("Toplam  = " + toplam);
		
	}

}
