package de.thro.inf.prg3.a03;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    private static final Logger logger = LogManager.getLogger();
    private final int t;
    private final int duration;

    public State( int t,int duration){

        this.t = t;
        this.duration = duration;
    }

    State tick(Cat cat){

    }
    abstract State successor (Cat cat); /* weil abstract keine Implementierung


}
