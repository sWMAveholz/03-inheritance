package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class DigestingState extends State {

    public DigestingState(  int duration) {
        super( duration);
    }

    @Override
    State successor(Cat cat) {
        return new PlayfulState(0);
    }
}
