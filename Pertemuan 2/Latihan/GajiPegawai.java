/*
	Program	: GajiPegawai.java
	Pembuat	: Ahmad Faris Almuzakki
	Tanggal	: 16 September 2022
	Deskripsi	: Input nilai beberapa buah variabel dengan tipe data berbeda
*/

import java.util.Scanner;
public class GajiPegawai{
	public static void main(String[] args){
		int upahreguler = 50000;
		int upahlembur = 70000;
		int jamkerjareguler, jamkerjalembur, gajisebulan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n===PROGRAM MENGHITUNG GAJI BULANAN PEGAWAI==");
		System.out.print("\nJam Kerja Reguler : ");
		jamkerjareguler = input.nextInt();
		
		System.out.print("\nJam Kerja Lembur : ");
		jamkerjalembur = input.nextInt();
				
		gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
		System.out.print("\nGaji Pegawai bulan ini : " + gajisebulan);
		System.out.print("\n");
	}
}