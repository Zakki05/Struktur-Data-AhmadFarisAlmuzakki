/*
	Program : KonversiSuhu.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 21 September 2022
	Deskripsi : Menghitung Suhu 
*/

import java.util.Scanner;

public class KonversiSuhu{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		float c;
        float f;
        float r;
        float k;
		
		System.out.println("\n===PROGRAM MENGHITUNG KONVERSI SUHU===");
    
		System.out.print("\nMasukkan suhu dalam Celcius (C) : ");
		c = in.nextFloat();
		
		r = (float) 4/5 * c;
		f = (float) 9/5 * c + 32;
		k = (float) c - 273;
		
		System.out.println("\n\tHASIL KONVERSI SUHU\n");
        System.out.println("Celcius (C) : "+c);
        System.out.println("Reumur (R) : " +r);
		System.out.println("Fahrenheit (F) : " +f);
		System.out.println("Kelvin (K) : " +k);
	}
}