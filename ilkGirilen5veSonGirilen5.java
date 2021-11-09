package deneme;

import java.util.Scanner;

public class ilkGirilen5veSonGirilen5 {
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[10];
		int ilk = 0, son = 0;
		boolean boolilk = true;
		
		for(int i=0; i<10; i++) {
			System.out.print("Lütfen "+ (i+1) +".sayiyi giriniz : ");
			dizi[i] = input.nextInt();
			if(dizi[i] == 5) {
				if(boolilk) {
					ilk = i+1;
					boolilk = false;
				}
				son = i+1;
			}
		}
		
		System.out.println("ilk girilen index : " + ilk + " ");
		System.out.print("son girilen index : " + son);
		
	}
}
