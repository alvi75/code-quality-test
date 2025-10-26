import java.util.*;

public class Translation937 {
    ublic synchronized DirectoryReader getIndexReader() {
    if (indexReader == null) {
        indexReader = new IndexReader(indexDirectory);
        indexReader.IncRef();
    }
    return indexReader;
}
}