package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import static de.thro.inf.prg3.a03.Cat.State.*;

public class Cat {

	private final int sleep;
	private final int awake;
	private final int digest;
	private State currentState;

	private final String name;

	private int time = 0;
	private int timeDigesting = 0;

	public Cat(String name, int sleep, int awake, int digest) {
		this.name = name;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;
		this.currentState = new SleepingState(this.sleep);
	}

	public void tick(){
		this.currentState = currentState.tick(this);
	}

	/**
	 * This would be a user interaction: feed the cat to change its state!
	 */
	public void feed(){
		if(currentState instanceof HungryState){
			currentState = ((HungryState)currentState).feed(this);
		}
		else {
			throw new IllegalStateException("cat is not hungry");
		}

	}

	public int getSleep() {
		return sleep;
	}

	public int getDigest() {
		return digest;
	}

	public int getAwake() {
		return awake;
	}

	public String getName() {
		return name;
	}

	public boolean isAsleep() {
		return currentState instanceof SleepingState;
	}

	public boolean isPlayful() {
		return currentState instanceof PlayfulState;
	}

	public boolean isHungry() {
		return currentState instanceof HungryState;
	}

	public boolean isDigesting() {
		return currentState instanceof DigestingState;
	}

	public boolean isDead() {
		return currentState instanceof DeathState;
	}

	@Override
	public String toString() {
		return name;
	}

}
