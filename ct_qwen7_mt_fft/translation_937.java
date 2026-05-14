import java.util.*;

public class Translation937 {
    public synchronized IndexReader getIndexReader() {
    if (indexReader != null) {
        indexReader.incRef();
    }
    return indexReader;
}
}