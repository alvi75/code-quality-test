import java.util.*;

public class Generated_636767531a6d9265ec017ef1 {
    public static boolean equals(Point2D p1,Point2D p2){
		if(p1==p2) return true;
		if(p1==null || p2==null) return false;
		return TOLERANCE_DOUBLE_COMPARATOR.compare(p1,p2)==0;
	}
}