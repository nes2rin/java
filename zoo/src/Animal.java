
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal{" +  "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}