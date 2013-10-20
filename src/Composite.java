import java.util.ArrayList;
import java.awt.geom.Point2D;


public class Composite implements Shape {

	protected ArrayList<Shape> shapes;
	
	public Composite() {
		shapes = new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape) {
		this.shapes.add(shape);
	}
	
	public void removeShapeAtIndex(int index) {
		this.shapes.remove(index);
	}

	@Override
	public void show() {
		System.out.print(String.format("Begin Composite %s\n", this.toString()));
		for (Shape shape : shapes) {
			shape.show();
		}
		
		System.out.print(String.format("End Composite %s\n", this.toString()));
	}

	@Override
	public void move(Point2D point) {
		for (Shape shape : shapes) {
			shape.move(point);
		}
	}

}
