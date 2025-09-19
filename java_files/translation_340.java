import java.util.*;

public class Translation340 {
    public DirCacheEntry getDirCacheEntry() {
    return currentSubtree == null ? currentEntry : currentSubtree.getEntry(path);
}
}