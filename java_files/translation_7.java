import java.util.*;

public class Translation7 {
    public POIFSFileSystem() {
    headerBlock = new HeaderBlock(getBigBlockSize());
    _property_table = new PropertyTable(headerBlock);
    _documents = new ArrayList<>();
    _root = null;
}
}