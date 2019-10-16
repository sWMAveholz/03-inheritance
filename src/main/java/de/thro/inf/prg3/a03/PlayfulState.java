package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class PlayfulState extends State {
    public PlayfulState(int t, int duration) {
        super( t, duration);
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}
