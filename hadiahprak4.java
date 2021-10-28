import java.util.Scanner;
class hitungpln {
	int x,y,z;
	
 	int hargabayar (int tiperumah, char blokrumah) {
	 		if (tiperumah == 36 & blokrumah == 'A'){
	 			x = 500000;	
	 		} else
	 		if (tiperumah == 36 & blokrumah == 'B'){
	 			x = 300000;	
	 		} else
	 		if (tiperumah == 37 & blokrumah == 'A'){
	 			x = 800000;
	 		} else 
	 		if (tiperumah == 37 & blokrumah == 'B'){
	 			x = 600000;
	 		} 
	 return x;		
 	} 
  	void cetakharga (){
  			System.out.println("Total Harga Listrik Rumah Anda : " + x);
  	}
  	int kembalian (int uangbayar){
  			 z = uangbayar - x;
 			return z;
 	}
 	
}


public class hadiahprak4 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		char blok;
		String nama, alamat;
		int bayar, tipe_rumah;
		
	hitungpln pln = new hitungpln();
		
		System.out.println("Aplikasi class dan object untuk Aplikasi pembayaran PLN");
		System.out.println();
		
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat Anda  : ");
		alamat = input.nextLine();
		System.out.println("Masukkan Tipe Rumah Anda");
		System.out.println("Tipe Yang Tersedia : \n36\n37");
		System.out.print("Tipe Rumah Anda : ");
		tipe_rumah = input.nextInt();
		System.out.println("Masukkan Blok Rumah Anda");
		System.out.println("Blok Yang Tersedia : \nA\nB");
		System.out.print("Blok Rumah Anda : ");
		blok = input.next().charAt(0);
		System.out.println();
		pln.hargabayar(tipe_rumah,blok);
		pln.cetakharga();
		System.out.print("Masukkan Jumlah Uang anda : ");
		bayar = input.nextInt();
		
		System.out.println();
		
		System.out.println("Nama Anda : " + nama);
		System.out.println("Alamat Anda : " + alamat);
		pln.cetakharga();
		System.out.println("Jumlah Uang anda : " + bayar);
		System.out.println("Kembalian Uang anda : " + pln.kembalian(bayar));
		
	}	
}