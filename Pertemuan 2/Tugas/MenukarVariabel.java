/*
	Program : MenukarVariabel.java
	Pembuat : Ahmad Faris Almuzakki
	Tanggal : 21 September 2022
	Deskripsi : Menukar isi kedua variabel
*/

import java.util.Scanner;
public class  MenukarVariabel{
    public static void main (String[] args){
        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);

        System.out.println("\n===PROGRAM MENUKAR VARIABEL===\n");

        System.out.print("Masukkan Nilai Variabel A : ");
        a = in.nextInt();
        System.out.print("Masukkan Nilai Variabel B : ");
        b = in.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("\nNilai Akhir Variabel A : "+ a);
        System.out.println("Nilai Akhir Variabel B : "+ b);      
    }
}