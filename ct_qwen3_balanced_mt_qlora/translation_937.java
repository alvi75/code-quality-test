import java.util.*;

public class Translation937 {
    1 public synchronized IndexReader getIndexReader() {
    2 if (indexReader != null) {
        3 indexReader.incRef();
        4 }
        5 return indexReader;
        6 }
}