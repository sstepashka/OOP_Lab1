import java.awt.Rectangle;
import java.awt.geom.Point2D;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setCenter(new Point2D.Float(1, 2));

		System.out.print("created Circle\n");
		
		circle.show();
		
		circle.move(new Point2D.Float(1, 1));
		
		System.out.print("moved Circle\n");
		
		circle.show();
		
		Rect rect = new Rect();
		rect.setRect(new Rectangle.Float(2, 2, 2, 2));
		
		Circle circle2 = new Circle();
		circle2.setCenter(new Point2D.Float(5, 5));
		
		Composite compositeInside = new Composite();
		compositeInside.addShape(rect);
		compositeInside.addShape(circle2);
		
		Composite composite = new Composite();
		composite.addShape(circle);
		composite.addShape(compositeInside);
		
		System.out.print("composite\n");
		
		composite.show();
		
		composite.move(new Point2D.Float(1, 1));
		System.out.print("composite moved\n");
		composite.show();
		
		composite.move(new Point2D.Float(2, 2));
		System.out.print("composite moved 2\n");
		composite.show();
	}

}
