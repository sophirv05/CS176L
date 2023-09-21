package cs176l;

public class BugTest {
	
	public static void main(String[] args) {
		Bug bugsy =  new Bug(10);
		bugsy.move(); 
		bugsy.turn(); 
		System.out.println("The position is " + bugsy.getPosition());
	}

}
