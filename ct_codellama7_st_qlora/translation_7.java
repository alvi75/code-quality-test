import java.util.*;

public class Translation7 {
    public POIFSFileSystem() {
    _headerBlock = new HeaderBlock();
    _property_table = new PropertyTable(_headerBlock);
    _documents = new ArrayList<>();
    _root = null;
}
}