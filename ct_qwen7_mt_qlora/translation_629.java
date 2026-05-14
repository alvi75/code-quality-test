import java.util.*;

public class Translation629 {
    1 public Entry getEntry(String name) throws IOException {
    2 if (excludes.contains(name))3 throw new FileNotFoundException(name);
    4 Entry entry = directory.getEntry(name);
    5 return wrapEntry(entry);
}
}