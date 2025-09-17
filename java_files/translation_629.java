import java.util.*;

public class Translationtranslation_629 {
    public Entry getEntry(final String name) throws FileNotFoundException {
        if (excludes.contains(name))throw new FileNotFoundException(name);
        return directory.getEntry(name);
    }
}