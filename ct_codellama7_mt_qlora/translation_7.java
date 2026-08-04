import java.util.*;

public class Translation7 {
    public POIFSFileSystem() {
    HeaderBlock headerBlock = new HeaderBlock(bigBlockSize);
    _property_table = new PropertyTable(headerBlock);
    _documents = new ArrayList();
    _root = null;
}
}