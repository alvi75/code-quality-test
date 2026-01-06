import java.util.*;

public class Translation864 {
    ublic String toString() {
    String coll = getCollectionModel().getName();
    if (coll != null) {
        return "LM " + getName() + " - " + coll;
    }
    else {
        return "LM " + getName();
    }
}
}