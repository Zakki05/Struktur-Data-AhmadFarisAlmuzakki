/*
	Program : LuasBalok.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 21 September 2022
	Deskripsi : Menghitung Luas Balok
*/

import java.util.Scanner;
public class  LuasBalok{
    public static void main (String[] args){
        int p;
        int l;
        int t;
        int luas;

        Scanner in = new Scanner(System.in);

        System.out.println("\n===PROGRAM MENGHITUNG LUAS BALOK===\n");

        System.out.print("Masukkan Panjang : ");
        p = in.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = in.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = in.nextInt();

        luas = 2 * ((p*l)+(l*t)+(p*t));

        System.out.println("\nRumus Luas Balok : 2 * ((p*l) + (l*t) + (p*t)) ");   
        System.out.println("Nilai Luas Balok : "+ luas);      
    }
}