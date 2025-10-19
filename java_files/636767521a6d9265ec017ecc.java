import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		double h = box.getHeight();
		double hw = h/2;
		return new Pair<>(new Box2D(box.getX(),box.getY(),box.getWidth(),hw),
				new Box2D(box.getX(),box.getY()+hw,box.getWidth(),hw));
	}
}