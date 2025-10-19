import java.util.*;

public class Generated_636767531a6d9265ec017ef1 {
    /**Using TOLERANCE_DOUBLE_COMPARATOR to compare two points for equality,return true the point p1 is equal to another point p2,otherwise return false.*/
    if(TOLERANCE_DOUBLE_COMPARATOR.compare(p1.getX(),p2.getX())!=0){
      return false;
    }
    if(TOLERANCE_DOUBLE_COMPARATOR.compare(p1.getY(),p2.getY())!=0){
      return false;
    }
    return true;
  }
}