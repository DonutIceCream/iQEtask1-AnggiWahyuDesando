package OOP;

public class Main {
    public static void main(String[] args) {
        Animal animalObj = new Animal();
        animalObj.setNama("Binatang");
        animalObj.identify_myself();
        System.out.println("");
        Herbivor herbivorObject = new Herbivor();
        herbivorObject.setNama("Kambing");
        herbivorObject.setJenis_makanan("'Tumbuhan',");
        herbivorObject.setGigi_binatang("Tumpul");
        herbivorObject.identify_myself();
        Carnivor carnivorObject = new Carnivor();
        carnivorObject.setNama("Singa");
        carnivorObject.setJenis_makanan("'Daging',");
        carnivorObject.setGigi_binatang("Tajam ");
        carnivorObject.identify_myself();
        System.out.println("");
        Omnivor omnivorObject = new Omnivor();
        omnivorObject.setNama("Ayam");
        omnivorObject.setJenis_makanan("'Semua',");
        omnivorObject.setGigi_binatang("Tajam dan Tumpul");
        omnivorObject.identify_myself();
    }
}