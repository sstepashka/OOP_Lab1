import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;


public class Rect implements Shape {

	private Rectangle2D rect = null;
	
	public Rectangle2D getRect() {
		return rect;
	}

	public void setRect(Rectangle2D rect) {
		this.rect = rect;
	}

	public Rect() {
		this.rect = new Rectangle2D.Float(0, 0, 0, 0);
	}

	@Override
	public void show() {
		System.out.print(String.format("Rect: %.2f, %.2f, %.2f, %.2f\n", rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight()));
	}

	@Override
	public void move(Point2D point) {
		rect.setRect(
				rect.getX() + point.getX(), 
				rect.getY() + point.getY(), 
				rect.getWidth(), 
				rect.getHeight()
				);

	}

}
