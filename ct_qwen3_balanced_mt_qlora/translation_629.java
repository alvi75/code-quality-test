import java.util.*;

public class Translation629 {
    ublic Entry getEntry(String name) throws IOException {
    if (excludes.contains(name)) {
        throw new FileNotFoundException(name);
    }
    Entry entry = directory.getEntry(name);
    return wrapEntry(entry);
}
}