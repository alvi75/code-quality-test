import java.util.*;

public class Translation864 {
    2 public String toString() {
    3 final String coll = getCollectionName();
    4 if (coll != null) {
        5 return "LM " + getName() + " - " + coll;
        6 }
        else {
            7 return "LM " + getName();
            8 }
        }
}