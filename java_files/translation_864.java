import java.util.*;

public class Translation864 {
    public String toString() {
    String coll = m_collectionModel.getName();
    if (coll != null) {
        return String.format("LM %s - %s", getName(), coll);
    }
    else {
        return String.format("LM %s", getName());
    }
}
}