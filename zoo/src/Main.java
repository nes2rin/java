
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Animal[] animals = { lion };

        Zoo myZoo = new Zoo(animals, "Safari Park", "Paris", 10);

        System.out.println(myZoo);
    }
}
