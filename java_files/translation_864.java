import java.util.*;

public class Translationtranslation_864 {
    public String toString() {
        String coll = getCollectionModel().getName();
        if (coll != null) {
            return "LM "+getName()+" - "+coll;
        }
        else {
            return "LM "+getName();
        }
    }
}