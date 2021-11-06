package Part_1_BasicProgramming;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("=========Program Konversi Nilai==========");
        System.out.println("Masukkan Sebuah Nilai = ");
        int a = x.nextInt();
        if (a>100){
            System.out.println("Invalid");
        }
        else if (a>=80&&a<=100)
            System.out.println("Nilai A");
        else if (a>=65&&a<=79){
            System.out.println("Nilai Anda B");
        }
        else if (a>=50&&a<=64){
            System.out.println("Nilai Anda C");
        }
        else if (a>=35&&a<=49){
            System.out.println("Nilai Anda D");
        }
        else if(a<=0){
            System.out.println("invalid");
        }
    }
}