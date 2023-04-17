package animals;

public abstract class Animal {
    
    public final String kingdom() {
        return "Animalia";
    }

    public abstract String phylum();

    public abstract String taxoClass();

    public abstract String order();

    public abstract String family();

    public abstract String species();

    // TODO: Write tests for this
    public String getTaxonomicClassification() {
        return "SORRY, NOT IMPLEMENTED YET";
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
