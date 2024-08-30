/*
	Program : TeleponBayar.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 15 September 2022
	Deskripsi : Biaya Pembicaraan Telepon
*/

import java.util.Scanner;
public class TelponBayar{
	public static void main (String[] args){
		int jam1,menit1,detik1,total1;
		int jam2,menit2,detik2,total2;
		int jamtot,menittot,detiktot;
		int rpbayar,durasi;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n==Program Menghitung Bayar==\n");
		System.out.println("Masukan Waktu Awal Pembicaraan");
		System.out.print("Masukkan jam masuk = ");
		jam1 = in.nextInt();
		System.out.print("Masukkan menit masuk = ");
		menit1 = in.nextInt();
		System.out.print("Masukkan detik masuk = ");
		detik1 = in.nextInt();
		System.out.println("\nMasukan Waktu Akhir Pembicaraan");
		System.out.print("Masukkan jam Akhir = ");
		jam2 = in.nextInt();
		System.out.print("Masukkan menit Akhir = ");
		menit2 = in.nextInt();
		System.out.print("Masukkan detik Akhir = ");
		detik2 = in.nextInt();
		total1 = (jam1*3600) + (menit1*60) + (detik1);
		total2 = (jam2*3600) + (menit2*60) + (detik2);
		durasi = (total2 - total1);
		jamtot = durasi/3600;
		menittot = (durasi%3600)/60;
		detiktot = (durasi%60);
		rpbayar = (total2 - total1)*50/10;
		System.out.println("\nDurasi pembicaraan = "+durasi+" detik = " +jamtot+" Jam, " +menittot+ " Menit, " +detiktot+ " Detik");
		System.out.println("Biaya Pembicaraan= Rp."+ rpbayar + ",-");
	}
	
}