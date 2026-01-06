import java.util.*;

public class Translation581 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    size += (fieldInfos!=null)? fieldInfos.ramBytesUsed(): 0;
    if (docFreq != -1) {
        size += 8;
    }
    if (totalTermFreq != -1) {
        size += 4;
    }
    if (positions != null && positions.size() > 0) {
        for(int i=0;
        i<positions.size();
        i++) {
            int p = positions.get(i).position;
            if (p >= 0) {
                size += 2 + p;
            }
        }
        size += 3 * positions.size();
    }
    if (payloads != null && payloads.length > 0) {
        for(byte[] payload : payloads) {
            size += payload.length;
        }
    }
    return size;
}
}