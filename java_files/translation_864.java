import java.util.*;

public class Translationtranslation_864 {
    public String toString() {
        String collatorName = collator.getname();
        if (collatorName == null) {
            return "Collator " + super.getName();
        }
        return "Collator " + collatorName + ", " + super.getName();
    }
}