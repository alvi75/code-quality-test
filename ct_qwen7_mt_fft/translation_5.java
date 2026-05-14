import java.util.*;

public class Translation5 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + (fst!=null? fst.ramBytesUsed() : 0);
    for(Map.Entry<String,FST> entry: terms.entrySet()) {
        size += entry.getKey().length() * Character.BYTES;
        size += entry.getValue().ramBytesUsed();
    }
    return size;
}
}