import java.util.*;

public class Translation864 {
    public String toString() {
    String coll = m_collectionModel.getName();
    if (coll != null) {
        return "LM " + getName() + " - " + coll;
    }
    else {
        return "LM " + getName();
    }
}
}