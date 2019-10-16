package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class HungryState extends State {


    public HungryState( int t, int duration) {
        super( t, duration);
    }

    @Override
    State successor(Cat cat) {
        return null;
    }

    //State feed(Animal a)
}
