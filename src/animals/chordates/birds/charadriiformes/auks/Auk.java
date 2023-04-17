package animals.chordates.birds.charadriiformes.auks;

import animals.characteristics.SwimCapable;
import animals.characteristics.SwimParameters;
import animals.chordates.birds.charadriiformes.Charadriiform;

public abstract class Auk extends Charadriiform implements SwimCapable {
    
    @Override
    public final String family() {
        return "Alcidae";
    }
    
    @Override
    public void swim(SwimParameters swimParams) {
        System.out.println("Swimming, somehow...");
    }

}
