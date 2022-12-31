package animals.chordates.birds.charadriiformes.auks.puffins;

import animals.characteristics.FlightCapable;
import animals.characteristics.FlightParameters;
import animals.characteristics.SwimCapable;
import animals.characteristics.SwimParameters;

public class AtlanticPuffin extends Puffin 
        implements FlightCapable, SwimCapable {
    
    public String species() {
        return "Fratercula arctica";
    }

    @Override
    public void fly(FlightParameters flightParams) {
        System.out.println("Flying somehow...");
    }

    @Override
    public void swim(SwimParameters swimParams) {
        System.out.println("Swimming somehow...");
    }
    
}
