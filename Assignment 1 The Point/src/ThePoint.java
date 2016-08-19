
public class ThePoint {
	private int x;
	private int y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	public ThePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public int distance(ThePoint otherPoint){
		return (int) Math.sqrt(
				Math.pow(((double)otherPoint.getX() - (double)x), 2.0) + 
				Math.pow(((double)otherPoint.getY() - (double)y), 2.0));
	}
}