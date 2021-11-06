package Part_2_BasicProgramming;

public class Problem4 {
    public static void main(String[] args) {

        //membuat header tabelnya
        String tabelnya = " Tabel Perkalian \n";
        tabelnya += "------------------------------\n";

        //cetak tubuh tabel
        for (int i = 1; i <= 9; i++) {
            tabelnya += i + " | ";
            for (int j = 1; j <= 9; j++) {
                //menampilkan angka dan pengaturan
                if (i * j < 10) {
                    tabelnya += " " + i * j;
                } else {
                    tabelnya += " " + i * j;

                }
            }
            tabelnya += "\n";
        }
        //menampilkan hasilnya
        System.out.println(tabelnya);
    }

}