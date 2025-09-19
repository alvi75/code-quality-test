import java.util.*;

public class Translation5 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + (fst!=null ? fst.ramBytesUsed() : 0);
    for(FieldIndexData entry : fields.values()) {
        size += entry.ramBytesUsed();
    }
    return size;
}
}