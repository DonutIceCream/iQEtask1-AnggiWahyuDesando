package Part_1_BasicProgramming;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System. in );
        System.out.println("=======Faktor Bilangan======");
        System.out.println("Masukkan angka");
        int nilai = x.nextInt();
        System.out.println("Faktor-faktornya:");
        for (int z = nilai; z > 0; z--) {
            if (nilai % z == 0) {
                System.out.println(z + " ");
            }
        }
    }
}