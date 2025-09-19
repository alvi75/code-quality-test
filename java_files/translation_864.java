import java.util.*;

public class Translation864 {
    public String toString() {
    String collatorName = collator.getCanonicalName();
    if (collatorName == null) {
        return "Collator " + super.toString();
    }
    return "Collator " + collatorName + ", rules=" + rules;
}
}