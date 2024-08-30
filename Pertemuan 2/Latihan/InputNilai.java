/*
	Program	: InputNilai.java
	Pembuat	: Ahmad Faris Almuzakki
	Tanggal	: 16 September 2022
	Deskripsi	: Input nilai beberapa buah variabel dengan tipe data berbeda
*/

import java.util.Scanner;
public class InputNilai{
	public static void main(String[] args){
		float nilai, mean, sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n===PROGRAM INPUT NILAI (SUM DAN MEAN)==");
		sum = 0;
		System.out.print("\nNilai-1\t= ");
		nilai = input.nextFloat();
		sum = sum + nilai;
		mean = sum;
		
		System.out.println("Jumlah\t= "+ sum +"\trata-rata\t= "+mean);
		
		System.out.print("\nNilai-2\t= ");
		nilai = input.nextFloat();
		sum = sum + nilai;
		mean = sum/2;
		
		System.out.println("Jumlah\t= "+ sum +"\trata-rata\t= "+mean);
		
		System.out.print("\nNilai-3\t= ");
		nilai = input.nextFloat();
		sum = sum + nilai;
		mean = sum/3;
		
		System.out.println("Jumlah\t= "+ sum +"\trata-rata\t= "+mean);
		
	}
}