import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
		Pair<Box2D,Box2D> result = new Pair<>();
		
		result.first = new Box2D();
		result.second = new Box2D();
		
		result.first.x0 = box.x0;
		result.first.y0 = box.y0;
		result.first.x1 = (box.x0 + box.x1) / 2f;
		result.first.y1 = box.y1;

		result.second.x0 = result.first.x1;
		result.second.y0 = box.y0;
		result.second.x1 = box.x1;
		result.second.y1 = box.y1;
		
		return result;
	}
}