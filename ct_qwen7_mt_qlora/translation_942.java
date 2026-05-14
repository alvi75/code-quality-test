import java.util.*;

public class Translation942 {
    1 public HashMap(int capacity, float loadFactor) {
    2 if (capacity < 0)3 throw new IllegalArgumentException("Capacity is negative");
    4 if (loadFactor <= 0 || Float.isNaN(loadFactor))5 throw new IllegalArgumentException("Invalid load factor: " + loadFactor);
    6 this.loadFactor = loadFactor;
    7 table = new Object[capacity];
    8 threshold = (int)(capacity * loadFactor);
}
}