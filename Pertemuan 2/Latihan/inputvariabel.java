/*
	Program	: inputvariabel.java
	Pembuat	: Ahmad Faris Almuzakki
	Tanggal	: 16 September 2022
	Deskripsi	: Input nilai beberapa buah variabel dengan tipe data berbeda
*/

import java.util.Scanner;
public class inputvariabel{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String huruf, nama;
		int umur;
		float angka;
		
		System.out.print("\nMasukkan sebuah bilangan huruf : ");
		huruf = in.nextLine();
		
		System.out.print("\nMasukkan sebuah bilangan Pecahan : ");
		angka = in.nextFloat();
		System.out.println("angka = " + angka);
		in.nextLine();
		
		System.out.print("\nMasukkan Nama anda : ");
		nama = in.nextLine();
		
		System.out.print("\nMasukkan umur anda : ");
		umur = in.nextInt();
	}
}