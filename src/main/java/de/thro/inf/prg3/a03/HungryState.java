package de.thro.inf.prg3.a03;

import java.util.logging.Logger;

public class HungryState extends State {


    public HungryState(  int duration) {
        super(  duration);
    }

    State feed(Cat cat){
        return new DigestingState(cat.getDigest());
    }

    @Override
    State successor(Cat cat) {
        return new DeathState(50);
    }

    //State feed(Animal a)
}
