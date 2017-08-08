package jp.co.sample.git_sample_r.domain;

/**
 * 車を表すドメイン.
 * @author rui.toguchi
 *
 */
public class Car {
	/** スピード **/
	private int speed;
	
	/**
	 * 走ります
	 */
	public void run(){
		this.speed += 5;
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
