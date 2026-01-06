import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		return new Pair<>(box.copy(),box.copy().translate(-box.width/2,-box.height/2));
	}
}