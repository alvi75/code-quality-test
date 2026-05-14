import java.util.*;

public class Translation629 {
    public DirectoryEntry getEntry(String name) throws IOException {
    if (excludes.contains(name))throw new FileNotFoundException(name);
    DirectoryEntry entry = directory.getEntry(name);
    return wrapEntry(entry);
}
}