package animals.chordates.birds.charadriiformes;

import animals.characteristics.FlightCapable;
import animals.characteristics.FlightParameters;
import animals.chordates.birds.Bird;

public abstract class Charadriiform extends Bird implements FlightCapable {
    
    @Override
    public final String order() {
        return "Charadriiformes";
    }
    
    @Override
    public void fly(FlightParameters flightParams) {
        System.out.println("Flying, somehow...");
    }

}
