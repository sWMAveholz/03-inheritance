package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class SleepingState extends State {
    public SleepingState( int t, int duration) {
        super( t, duration);
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}
