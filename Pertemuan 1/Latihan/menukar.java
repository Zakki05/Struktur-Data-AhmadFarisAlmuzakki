/*
	Program : Menukar.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 15 September 2022
	Deskripsi : Menukar isi dua buah gelas yang berisikan teh dan kopi.
				dalam program ini, diasumsikan teh dan kopi sebagai tulisan saja
*/

public class menukar{
	public static void main(String[] args){
		String  A,B,C; //terdapat 3 variabel tertipe data string
		A= "teh"; //Gelas A berisi teh
		B= "kopi"; //Gelas B berisi kopi
		System.out.println("\n===Sebelum Ditukar===");
		System.out.println("Gelas A berisi " + A + "\nGelas B berisi " + B);
		//proses tukar isi gelas
		C = A; //Isi Gelas C diisikan dengan isi gelas A
		A = B; //Isi Gelas A diisikan dengan isi gelas B
		B = C; //Isi Gelas B diisikan dengan isi gelas C
		System.out.println("\n===Sesudah Ditukar===");
		System.out.println("Gelas A berisi " + A);
		System.out.println("Gelas B berisi " + B);
	}
}