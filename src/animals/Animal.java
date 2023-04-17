package animals;

public class Animal {
    
    public final String kingdom() {
        return "Animalia";
    }

    public String phylum() {
        return "Not applicable";
    }

    public String taxoClass() {
        return "Not applicable";
    }

    public String order() {
        return "Not applicable";
    }

    public String family() {
        return "Not applicable";
    }

    public String species() {
        return "Not applicable";
    }

    public String getTaxonomicClassification() {
        return "Unknown";
    }

    public void printAnimalInfo() {
        System.out.println("Kingdom: " + this.kingdom());
        System.out.println("Phylum:  " + this.phylum());
        System.out.println("Class:   " + this.taxoClass());
        System.out.println("Order:   " + this.order());
        System.out.println("Family:  " + this.family());
        System.out.println("Species: " + this.species());
    }

    public String call() {
        return "";
    }

}
