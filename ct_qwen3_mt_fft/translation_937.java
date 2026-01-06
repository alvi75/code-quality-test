import java.util.*;

public class Translation937 {
    1 public synchronized DirectoryReader getIndexReader() {
    if (indexReader != null) {
        indexReader.incRef();
    }
    return indexReader;
}
}