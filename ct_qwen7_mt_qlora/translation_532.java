import java.util.*;

public class Translation532 {
    1 public E get(int location) {
    2 try {
        3 return a[location];
        4 }
        catch (java.lang.ArrayIndexOutOfBoundsException e) {
            5 throw java.util.ArrayList.throwIndexOutOfBoundsException(location, a.length);
            6 }
        }
}