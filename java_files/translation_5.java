import java.util.*;

public class Translationtranslation_5 {
    public long ramBytesUsed() {
        long bytes = 0;
        for(FieldIndexData entry : fields.values()) {
            bytes += entry.ramBytesUsed();
        }
        return bytes;
    }
}