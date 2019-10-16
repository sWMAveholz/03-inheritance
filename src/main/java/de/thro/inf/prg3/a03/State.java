package de.thro.inf.prg3.a03;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    private static final Logger logger = LogManager.getLogger();
    protected int t;
    protected int duration;

    public State( int duration){

        t = 0;
        this.duration = duration;
    }

    State tick(Cat cat){
        t = t+1;
        if(duration>t)
            return this;
        return successor(cat);

    }

    abstract State successor (Cat cat); // weil abstract keine Implementierung


}
