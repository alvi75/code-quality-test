import java.util.*;

public class Translation785 {
    1 public Hashtable(int capacity, float loadFactor) {
    2 super(capacity);
    3 if (loadFactor <= 0 || Float.isNaN(loadFactor))4 throw new IllegalArgumentException("Load factor: " + loadFactor);
}
}