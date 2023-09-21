package cs176l;

public class Bug {
	public int position;
	public boolean isRight;
	
	public Bug(int initialPosition) {
		position = initialPosition;
	}
	public void turn() {
		if (isRight == true) {
			isRight = false;
		}
		else {
			isRight = true;
		}
	}
	public void move() {
		if (isRight == true) {
			position += 1;
		}
		else {
			position -= 1;
		}
	}
	public int getPosition() {
		return position;
	}
	
	
}
