import java.util.*;

public class Generated_636767531a6d9265ec017ef1 {
    public static boolean equals(Point2D p1,Point2D p2){
        if (p1 == null || p2 == null) {
            return false;
        }
        return Double.compare(p1.getX(), p2.getX()) == 0 && Double.compare(p1.getY(), p2.getY()) == 0;
    }
}