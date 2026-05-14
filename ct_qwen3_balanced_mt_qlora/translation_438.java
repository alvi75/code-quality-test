import java.util.*;

public class Translation438 {
    ublic long ramBytesUsed() {
    long sizeInBytes = 0;
    for (Map.Entry<String, Terms> entry : termsByField.entrySet()) {
        sizeInBytes += entry.getKey().length() * Character.BYTES;
        Terms terms = entry.getValue();
        if (terms != null) {
            sizeInBytes += terms.ramBytesUsed();
        }
    }
    return sizeInBytes;
}
}