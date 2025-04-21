public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Feline Lion = new Feline("Lion", "roars");
        Feline Cat = new Feline("Cat", "purrs");
        Canine Wolf = new Canine("Wolf", "howls");
        Canine Dog = new Canine("Dog", "barks");

        animal.roam();
        animal.makeNoise();
        animal.roam();
        System.out.println();

        Cat.sleep();
        Cat.makeNoise();
        Cat.roam();
        Lion.makeNoise();
        Lion.roam();
        System.out.println();

        Wolf.sleep();
        Wolf.makeNoise();
        Wolf.roam();
        Dog.makeNoise();
        Dog.roam();
    }
}
