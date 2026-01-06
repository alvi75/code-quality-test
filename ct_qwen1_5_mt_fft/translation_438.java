import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    for(FieldIndexData fieldData: fields.values()) {
        size += fieldData.ramBytesUsed();
    }
    return size;
}
}