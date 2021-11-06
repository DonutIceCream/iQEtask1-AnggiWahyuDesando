package OOP;

    public class Omnivor extends Animal{
        public void identify_myself(){
            System.out.println("Hi I'm Omnivore , My name is " + this.getNama() + " My Food is " + this.getJenis_makanan() + " I have " + this.getGigi_binatang() + " teeth");
        }
    }