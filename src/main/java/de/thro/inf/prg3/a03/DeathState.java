package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class DeathState extends State{
    public DeathState( int duration) {
        super( duration);
    }

    @Override
    State successor(Cat cat) {
        return new DeathState(50);
    }
}
