package deneme;

import java.util.Scanner;

public class paraUstuOdeme {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Mümkün olan en az banknot ile öde.");
		System.out.print("Lütfen para üstü miktarýný giriniz :  ");
		int ucret = 100;
		ucret = input.nextInt();
		int tutar200, tutar100, tutar50, tutar20, tutar10, tutar5, tutar1;
		
		
		if(ucret/200 < ucret/100) {
			tutar200 = (ucret/200);
			ucret -= tutar200*200;
			if(tutar200 != 0) {
				System.out.println(tutar200 + " tane 200 = " + tutar200*200);
			}
			
			
		}
		if(ucret/100 < ucret/50) {
			tutar100 = ucret/100;
			ucret -= tutar100*100;
			if(tutar100 != 0) {
				System.out.println(tutar100 + " tane 100 = " + tutar100*100);
			}
			
		}
		if(ucret/50 < ucret/20) {
			tutar50 = ucret/50;
			ucret -= tutar50*50;
			if(tutar50 != 0) {
				System.out.println(tutar50 + " tane 50 = " + tutar50*50);
			}
			
		}
		if(ucret/20 < ucret/10) {
			tutar20 = ucret/20;
			ucret -= tutar20*20;
			if(tutar20 != 0) {
				System.out.println(tutar20 + " tane 20 = " + tutar20*20);
			}
			
		}
		if(ucret/10 < ucret/5) {
			tutar10 = ucret/10;
			ucret -= tutar10*10;
			if(tutar10 != 0) {
				System.out.println(tutar10 + " tane 10 = " + tutar10*10);
			}
		}
		if(ucret/5 < ucret/1) {
			tutar5 = ucret/5;
			ucret -= tutar5*5;
			tutar1 = ucret;
			if(tutar5 != 0) {
				System.out.println(tutar5 + " tane 5 = " + tutar5*5);			
			}
			if(tutar1 != 0) {
				System.out.println(tutar1 + " tane 1 = " + tutar1);		
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
