/*
	Program	: LuasPersegiPanjang.java
	Pembuat	: Ahmad Faris Almuzakki
	Tanggal	: 16 September 2022
	Deskripsi	: Input nilai beberapa buah variabel dengan tipe data berbeda
*/

import java.util.Scanner;
public class LuasPersegiPanjang{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float Luas, Panjang, Lebar;
		
		System.out.println("\n===MENGHITUNG LUAS PERSEGI PANJANG==");
		System.out.print("\nMasukkan Nilai Panjang : ");
		Panjang = in.nextFloat();
		
		System.out.print("\nMasukkan Nilai Lebar : ");
		Lebar = in.nextFloat();
				
		Luas = Panjang * Lebar;
		System.out.print("\nLuas Persegi Panjang : " + Luas);
		System.out.print("\n");
	}
}