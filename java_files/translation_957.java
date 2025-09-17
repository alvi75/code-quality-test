import java.util.*;

public class Translationtranslation_957 {
    public void removeName(NameRecord name) {
        int index = getNameIndex((HSSFName) name);
        removeName(index);
    }
}