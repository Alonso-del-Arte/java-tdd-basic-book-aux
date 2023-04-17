package animals.chordates.mammals;

import animals.chordates.Chordate;

public abstract class Mammal extends Chordate {
    
    @Override
    public final String taxoClass() {
        return "Mammalia";
    }

}
