package animals.chordates.birds.anseriformes;

import animals.chordates.birds.Bird;

public class Anseriform extends Bird {
    
    public String order() {
        return "Anseriformes";
    }
    
    @Override
    public String call() {
        return "Quaw!";
    }
    
}
