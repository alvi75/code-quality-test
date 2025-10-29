import java.util.*;

public class Generated_636767531a6d9265ec017ef1 {
    /**Using TOLERANCE_DOUBLE_COMPARATOR to compare two points for equality,return true the point p1 is equal to another point p2,otherwise return false.**/
    public static boolean equals(Point2D p1,Point2D p2){
        if(p1 == null || p2 == null) {
            return false;
        }
        return Math.abs(p1.getX() - p2.getX()) <= TOLERANCE_DOUBLE_COMPARATOR && Math.abs(p1.getY() - p2.getY()) <= TOLERANCE_DOUBLE_COMPARATOR;
    }
}