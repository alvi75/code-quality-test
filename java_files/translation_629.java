import java.util.*;

public class Translationtranslation_629 {
    public Entry getEntry(String name) throws FileNotFoundException {
        if (excludes.contains(name)) {
            throw new FileNotFoundException(name);
        }
        Entry entry = directory.getEntry(name);
        return wrapEntry(entry);
    }
}