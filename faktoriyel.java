package deneme;
import java.util.Scanner;

public class faktoriyel {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("lütfen bir sayi giriniz => ");
		int sayi = input.nextInt();
		int forFaktor = 1;
		int whileFaktor = 1;
		int doWhileFaktor = 1;
		
		for(int i = 1; i<=sayi;i++) {
			forFaktor *=i;
		}
		System.out.println("FOR Faktoriyel("+ sayi +") : " + forFaktor);
		
		
		int WhileSayac = 1;
		while(WhileSayac <= sayi) {
			whileFaktor *= WhileSayac;
			WhileSayac +=1;
		}
		System.out.println("While Faktoriyel("+ sayi +") : " + whileFaktor);
		
		
		int DoWhileSayac = 1;
		
		do{
			doWhileFaktor *= DoWhileSayac;
			DoWhileSayac += 1;
		}
		while(DoWhileSayac <= sayi);
		System.out.println("Do While Faktoriyel("+ sayi +") : " + doWhileFaktor);
		
	}

}
