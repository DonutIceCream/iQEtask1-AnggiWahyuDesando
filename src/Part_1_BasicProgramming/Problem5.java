package Part_1_BasicProgramming;

import java.util.Scanner;


public class Problem5 {
    private static boolean primeNumber(int number){
        for(int i=2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("Masukan Bilangan Prima :");
        int bil = x.nextInt();
        System.out.println(primeNumber(bil));
    }
}
