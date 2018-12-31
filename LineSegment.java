package triangleArea;

public class LineSegment extends Point{

	Point v1;
	Point v2;
	
	public double length(Point v1,Point v2) {
		double l=Math.sqrt(Math.pow((v1.getX()-v2.getX()),2)+Math.pow((v1.getY()-v2.getY()),2));
		return l;
	}
}
