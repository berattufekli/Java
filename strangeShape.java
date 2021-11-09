package deneme;

import java.util.Scanner;

public class strangeShape {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Kaç tane satýr olacak => ");
		int satir = input.nextInt();
		
		for(int i=0; i<satir; i++) {
			
			for (int k=0; k<=i; k++) {
				System.out.print(" ");
			}
			
			System.out.print("#");
			
			for(int j=0; j<=(satir*2)-i*2;j++) {
				System.out.print(" ");
			}
			
			System.out.println("#");
		}
		
		for(int l = 0; l<satir+2; l++) {
			System.out.print(" ");
		}
		
		System.out.println("#");
		
	}

}
