import java.util.*;

public class Generated_636767521a6d9265ec017ecc {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
        return new Pair<>(new Box2D(box.getX(),box.getY()+box.getHeight()/2,box.getWidth(),box.getHeight()),new Box2D(box.getX()+box.getWidth()/2,box.getY(),box.getWidth()/2,box.getHeight()));
    }
}