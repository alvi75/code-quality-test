import java.util.*;

public class Translation937 {
    synchronized public DirectoryReader getIndexReader() {
    if (indexReader == null) {
        indexReader = new IndexReader(index);
    }
    indexReader.IncRef();
    return indexReader;
}
}