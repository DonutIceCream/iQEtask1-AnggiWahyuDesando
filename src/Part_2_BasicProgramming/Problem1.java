package Part_2_BasicProgramming;

public class Problem1 {
    private static int pangkat(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++){ // looping sebanyak b
            result = result*a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
