package animals.chordates.birds.anseriformes.anatids.ducks;

import animals.chordates.birds.anseriformes.anatids.Anatid;

public abstract class Duck extends Anatid {
    
    @Override
    public final String call() {
        return "Quack!";
    }
    
}
