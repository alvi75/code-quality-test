import java.util.*;

public class Translation7 {
    1 public POIFSFileSystem() {
    2 _header_block = new HeaderBlock(_big_block_size);
    3 _property_table = new PropertyTable(_header_block);
    4 _documents = new ArrayList();
    5 _root = null;
}
}