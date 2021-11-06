package Part_2_BasicProgramming;

public class Problem2 {
    private static void playWithAsterisk(int number){
        for(int i=0; i<number;i++){
            for(int j = 0; j <= number;j++){
                if(j == number - i){
                    System.out.print('*');
                    for(int k = 0; k < i; k++){
                        System.out.print(" *");
                    }
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
