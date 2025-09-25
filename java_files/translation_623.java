import java.util.*;

public class Translation623 {
    public long ramBytesUsed() {
    long size = 0;
    for (int i=0;
    i<wordNums.length;
    i++) {
        size += wordNums[i].ramBytesUsed();
    }
    return size;
}
}