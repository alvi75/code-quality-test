import java.util.*;

public class Translation5 {
    ublic long ramBytesUsed() {
    long sizeInBytes = 0;
    for (FieldIndexData fieldIndexData : fields.values()) {
        sizeInBytes += fieldIndexData.ramBytesUsed();
    }
    return sizeInBytes;
}
}