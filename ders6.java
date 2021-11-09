public class ders6 {

	public static void main(String[] args) {
		arrays();
	}
	
	public static void arrays() {
		int[][] array = new int[4][4];
		int[][] array2 = new int[2][2];
		
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				array[i][j] = (int)(Math.random()*5+1); //Random sayı 1 ile 5 arasında
			}
		}
		
		
		System.out.println("1. Matris");
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		
		for (int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				array2[i][j] = (int)(Math.random()*5+1);  //Random sayı 1 ile 5 arasında
			}
		}
		
		System.out.println("2. Matris");
		for (int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Büyük matris satırlar için
		for(int i=0;i<3;i++) {
			//Büyük matris sütunlar için
			for(int j=0;j<3;j++) {
				//Küçük matris satırlar için
				for(int k=0;k<2;k++) {
					//Küçük matris sütunlar için
					for(int l=0;l<2;l++) {
						array[i+k][j+l] = array[i+k][j+l]*array2[k][l];
					}
				}
				System.out.println("------ Durumlar ------ ");
				
				for (int m=0;m<4;m++) {
					for(int n=0;n<4;n++) {
						System.out.print(array[m][n] + " ");
					}
					System.out.println("");
				}
				
				System.out.println();
			}
			
			
		}
		
		System.out.println("");

	}

}
