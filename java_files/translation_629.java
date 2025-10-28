import java.util.*;

public class Translation629 {
    2 public Entry getEntry(String name) {
    if (excludes.contains(name)) {
        throw new FileNotFoundException(name);
    }
    Entry entry = directory.getEntry(name);
    return wrapEntry(entry);
}
}