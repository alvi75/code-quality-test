import java.util.*;

public class Translation864 {
    public String toString() {
    String coll = getCollectionModel().getName();
    if (coll != null) {
        return String.format(Locale.ROOT,"LM %s - %s", getName(), coll);
    }
    else {
        return String.format(Locale.ROOT,"LM %s", getName());
    }
}
}