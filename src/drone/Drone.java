package drone;

public class Drone implements StandardDrone{

	int koordinate[] = new int[3];
	public Drone(int[] koor){
		if(koor.length != 3)
				
		koordinate = koor;
	}
	
	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
