import java.util.*;

public class Translation937 {
    public synchronized IndexSearcher getIndexReader() {
    if (indexReader!=null) {
        indexReader.incRef();
    }
    return indexReader;
}
}