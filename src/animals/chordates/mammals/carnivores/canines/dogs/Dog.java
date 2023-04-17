package animals.chordates.mammals.carnivores.canines.dogs;

import animals.chordates.mammals.carnivores.canines.Canine;

public class Dog extends Canine {
    
    @Override
    public final String species() {
        return "Canis lupus";
    }

    @Override
    public String getTaxonomicClassification() {
        return "Canis familiaris";
    }
    
    @Override
    public void printAnimalInfo() {
        System.out.println("Kingdom: " + this.kingdom());
        System.out.println("Phylum:  " + this.phylum());
        System.out.println("Class:   " + this.taxoClass());
        System.out.println("Order:   " + this.order());
        System.out.println("Family:  " + this.family());
        System.out.println("Species: " + this.species());
    }

    public void bark() {
        System.out.println("Arf! Arf!");
    }

}
