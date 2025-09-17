import java.util.*;

public class Translationtranslation_154 {
    public static short lookupIndexByName(String name) {
        for (int i = 0;
        i < functions.length;
        i++) {
            FunctionMetadata fm = functions[i];
            String nameName = fm.getName();
            if (nameName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}