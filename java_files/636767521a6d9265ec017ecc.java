import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		return new Pair<Box2D,Box2D>(new Box2D(box.x,box.y,box.width/2,box.height),new Box2D(box.x+box.width/2,box.y,box.width/2,box.height));
	}
}