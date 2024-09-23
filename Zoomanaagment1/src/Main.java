public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Leo", 5, true);

        Zoo myZoo = new Zoo("Safari Park", "Tunis", 10);

        myZoo.addAnimal(lion);

        System.out.println("Lion's family: " + lion.family);
        System.out.println("Zoo's name: " + myZoo.name);
    }
}
