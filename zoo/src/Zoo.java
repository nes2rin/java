public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur de la classe Zoo
    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
}