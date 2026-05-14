import java.util.*;

public class Translation623 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED+ ((termOffsets!=null)? termOffsets.ramBytesUsed(): 0) +((termsDictOffsets!=null)? termsDictOffsets.ramBytesUsed(): 0);
    if (fieldInfos != null) {
        size += fieldInfos.ramBytesUsed();
    }
    return size;
}
}