package id.ac.its.tari.movingsprites;

public class Asteroid extends Sprite {
	private final int INITIAL_X = 400;
	
	public Asteroid(int x, int y) {
		super(x, y);
		initAsteroid();
	}
	
	private void initAsteroid() {
		loadImage("src/resources/asteroid-brown.png");
		getImageDimensions();
	}
	
	public void move() {
		if(x < 0) {
			x = INITIAL_X;
		}
		x-=1;
	}
}
