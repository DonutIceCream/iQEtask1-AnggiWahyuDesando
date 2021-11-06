package OOP;

public class Carnivor extends Animal{
    public void identify_myself(){
        System.out.println("Hi I'm Carnivore, My name is " + this.getNama() + " My Food is " + this.getJenis_makanan() + " I have " + this.getGigi_binatang() + " teeth");
    }
}
