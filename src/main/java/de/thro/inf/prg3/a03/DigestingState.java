package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class DigestingState extends State {

    public DigestingState( int t, int duration) {
        super( t, duration);
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}
