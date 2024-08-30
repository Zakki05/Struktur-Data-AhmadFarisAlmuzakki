/*
	Program : KonversiWaktu.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 21 September 2022
	Deskripsi : Menghitung Luas Balok
*/

import java.util.Scanner;
public class  KonversiWaktu{
    public static void main (String[] args){
        int jam;
        int menit;
        int detik;
        int waktu;
        int sisa1;

        Scanner in = new Scanner(System.in);

        System.out.println("\n===PROGRAM MENGHITUNG KONVERSI WAKTU===\n");

        System.out.print("Masukkan Waktu Satuan Detik : ");
        waktu = in.nextInt();

        jam = waktu / 3600;
        sisa1 = waktu % 3600;

        menit = sisa1 / 60;
        detik = sisa1 % 60;

        System.out.println("hasil konversi waktu : "+ jam +" jam "+ menit +" menit "+ detik +" detik ");     
    }
}