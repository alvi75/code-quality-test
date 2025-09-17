import java.util.*;

public class Translationtranslation_781 {
    public void setPrecedenceFilterSuppressed(boolean value) {
        if (value) {
            precedenceFilter = new PrecedenceFilter(this);
        }
        else {
            precedenceFilter = null;
        }
    }
}