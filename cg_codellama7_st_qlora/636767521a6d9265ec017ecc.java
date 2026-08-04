import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		double x = box.getX() + box.getWidth()/2;
		return new Pair<Box2D,Box2D>(new Box2D(box.getX(),box.getY(),x-box.getX(),box.getHeight()),
				new Box2D(x,box.getY(),box.getWidth()-x+box.getX(),box.getHeight()));
	}
}