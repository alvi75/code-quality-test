import java.util.*;

public class Translation5 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    for (int i = 0;
    i < fields.length;
    i++) {
        size += fields[i].ramBytesUsed();
    }
    return size;
}
}