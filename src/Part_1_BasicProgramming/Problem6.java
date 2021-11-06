package Part_1_BasicProgramming;

public class Problem6 {
    private static boolean palindrome(String word){
        for(int i=0; i < word.length(); i++){
            int pairCharIndex =  word.length() - 1 - i; // mendapatkan index pasangan posisi
            if(word.charAt(i) != word.charAt(pairCharIndex)) { // charAt untuk mendapatkan karakter di posisi (i)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

    }
}