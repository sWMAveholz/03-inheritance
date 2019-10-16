package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class PlayfulState extends State {
    public PlayfulState( int duration) {
        super( duration);
    }

    @Override
    State successor(Cat cat) {
        return new SleepingState(cat.getSleep());
    }
}
