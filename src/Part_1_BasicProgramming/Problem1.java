package Part_1_BasicProgramming;

public class Problem1 {
    public static void main(String[] args) {
        float alas = 20;
        float tinggi = 25;

        System.out.println("=======Menghitung luas segitiga=========");
        System.out.println("Nilai alas :" +alas);
        System.out.println("Nilai tinggi :" +tinggi);

        float luas = (float) (0.5 * tinggi * alas);
        System.out.println("luas segitiga :" +luas);
    }
}