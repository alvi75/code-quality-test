import java.util.*;

public class Translation937 {
    public DirectoryReader getIndexReader() {
    synchronized (this) {
        if (indexReader != null) {
            indexReader.incRef();
        }
        return indexReader;
    }
}
}