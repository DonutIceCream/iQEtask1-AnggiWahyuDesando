package Part_2_BasicProgramming;

public class Problem5 {
    private static String ubahHuruf(String s){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char character = ' ';
            if(s.charAt(i) == ' '){
                result = result + character;
                continue;
            }
            for(int j = 0; j < alphabet.length(); j++){
                if(s.charAt(i) == alphabet.charAt(j)){
                    character = alphabet.charAt((j + 10) % alphabet.length());
                }
            }
            result = result + character;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));

    }
}