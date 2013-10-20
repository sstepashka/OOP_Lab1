import java.awt.geom.Point2D;


public class Circle implements Shape {

	private Point2D center = null;
	private double radious = 0.0;
	
	public Circle() {
		this.center = new Point2D.Float(0, 0);
		this.radious = 2.0;
	}
	
	public Point2D getCenter() {
		return center;
	}

	public void setCenter(Point2D center) {
		this.center = center;
	}
	
	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	@Override
	public void show() {
		System.out.print(String.format("Center: %.2f, %.2f; Radius: %.2f\n", center.getX(), center.getY(), this.getRadious()));
	}

	@Override
	public void move(Point2D point) {
		//this.center.setLocation(center.getX() + point.getX(), center.getY() + point.getY());
//		this.center.setLocation(point);
	}

}
