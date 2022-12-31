package animals.chordates.mammals.bats;

import animals.characteristics.FlightCapable;
import animals.characteristics.FlightParameters;
import animals.chordates.mammals.Mammal;

public class Bat extends Mammal implements FlightCapable {
    
    public String order() {
        return "Chiroptera";
    }
    
    @Override
    public void fly(FlightParameters flightParams) {
        //
    }
    
}
