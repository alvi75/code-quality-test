import java.util.*;

public class Translation581 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    if (dict != null) {
        size += dict.ramBytesUsed();
    }
    return size;
}
}