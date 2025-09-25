import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    long size = 0;
    for (Block b : blocks) {
        size += b.ramBytesUsed();
    }
    return size;
}
}