import java.util.*;

public class Translationtranslation_937 {
    public synchronized DirectoryReader getIndexReader() {
        if (indexReader != null) {
            indexReader.incRef();
        }
        return indexReader;
    }
}