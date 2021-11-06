package OOP;

public class Animal {
    public String nama;
    public String jenis_makanan;
    public String gigi_binatang;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis_makanan() {
        return jenis_makanan;
    }
    public void setJenis_makanan(String jenis_makanan) {
        this.jenis_makanan = jenis_makanan;
    }
    public String getGigi_binatang() {
        return gigi_binatang;
    }
    public void setGigi_binatang(String gigi_binatang) {
        this.gigi_binatang = gigi_binatang;
    }
    public void identify_myself(){
        System.out.println("Hi I'm Parent of All Animal, My name is " + this.getNama());
    }
}
