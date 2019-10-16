package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class SleepingState extends State {
    public SleepingState(  int duration) {
        super( duration);
    }

    @Override
    State successor(Cat cat) {
        return new HungryState(cat.getAwake());
    }
}
