package animals.chordates.mammals.carnivores;

import animals.chordates.mammals.Mammal;

public abstract class Carnivore extends Mammal {
    
    @Override
    public final String order() {
        return "Carnivora";
    }

}
