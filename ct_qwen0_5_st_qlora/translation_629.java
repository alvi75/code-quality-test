import java.util.*;

public class Translation629 {
    public Entry getEntry(String name) {
    if (excludes.contains(name)) {
        throw new FileNotFoundException(name);
    }
    return directory.getEntry(name);
}
}