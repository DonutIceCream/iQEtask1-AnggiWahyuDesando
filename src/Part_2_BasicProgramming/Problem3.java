package Part_2_BasicProgramming;

public class Problem3 {
    private static void drawXYZ(int height){
        int counter = 1;
        for(int i=0; i < height; i++){
            for(int j = 0; j < height; j++){
                if(counter % 3 == 0)
                    System.out.print(" X");
                else if(counter % 2 == 0)
                    System.out.print(" Z");
                else
                    System.out.print(" Y");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawXYZ(5);
    }
}