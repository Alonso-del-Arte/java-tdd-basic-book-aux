package animals.chordates.birds.anseriformes;

import animals.chordates.birds.Bird;

public abstract class Anseriform extends Bird {
    
    @Override
    public final String order() {
        return "Anseriformes";
    }
    
    @Override
    public String call() {
        return "Quaw!";
    }
    
}
