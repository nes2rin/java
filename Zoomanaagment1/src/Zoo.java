public class Zoo  {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25]; // Maximum 25 animals
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }
}



