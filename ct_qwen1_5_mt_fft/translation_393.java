import java.util.*;

public class Translation393 {
    public final WAH8DocIdSet build() {
    final int size = this.wires.length;
    assert(size == 1 || (size & 0x7ffffffb) == 0;
    final byte[] bytes = new byte[size];
    for(int i=0;
    i<bytes.Length;
    i++) {
        bytes[i] = this.wires[i >> 3];
    }
    return new WAH8DocIdSet(bytes);
}
}