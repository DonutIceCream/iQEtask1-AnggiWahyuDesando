package Part_1_BasicProgramming;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System. in );
        System.out.println("=======Faktor Bilangan======");
        System.out.println("Masukkan angka");
        int nilai = x.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int z = 0; z <= nilai; z++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.println(tambah + " ");
            }
        }
    }
}