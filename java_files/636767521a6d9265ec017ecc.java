import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		return new Tuple<>(new Box2D(box.getX(),box.getY(),0.5f,box.getWidth()),new Box2D(box.getX()+box.getWidth()/2,box.getY(),0.5f,box.getHeight()));
	}
}