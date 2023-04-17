package animals.chordates;

import animals.Animal;

public abstract class Chordate extends Animal {
    
    @Override
    public final String phylum() {
        return "Chordata";
    }

}
