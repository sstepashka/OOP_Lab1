import java.awt.geom.Rectangle2D;
import java.util.EmptyStackException;


public class Square extends Rect {

	public Square() {
		this.setRect(new Rectangle2D.Float(0.f, 0.f, 0.f, 0.f));
	}
	
	@Override
	public void setRect(Rectangle2D rect) {
		if (rect.getWidth() == rect.getHeight()) {
			super.setRect(rect);
		} else {
			throw new EmptyStackException();
		}
	}
}
