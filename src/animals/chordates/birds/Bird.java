package animals.chordates.birds;

import animals.chordates.Chordate;

public abstract class Bird extends Chordate {
    
    @Override
    public final String taxoClass() {
        return "Aves";
    }
    
}
