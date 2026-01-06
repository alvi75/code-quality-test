import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		double width = box.getWidth();
		double height = box.getHeight();
		double x = box.getX();
		double y = box.getY();
		double halfWidth = width/2;
		double halfHeight = height/2;
		return new Pair<Box2D,Box2D>(new Box2D(x,y,halfWidth,halfHeight),
				new Box2D(x+halfWidth,y,halfWidth,halfHeight));
	}
}