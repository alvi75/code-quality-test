import java.util.*;

public class Translation937 {
    public synchronized DirectoryReader getIndexReader() {
    if (indexReader != null) {
        indexReader.incRef();
    }
    return indexReader;
}
}