import java.util.*;

public class Translationtranslation_154 {
    public static short lookupIndexByName(String name) {
        FunctionMetadata fm = getInstance().getFunctionByNameInternal(name.toUpperCase(Locale. NameValPairs.EMPTY_INSTANCE);
        if(fm == null) {
            return -1;
        }
        return fm.getIndex();
    }
}