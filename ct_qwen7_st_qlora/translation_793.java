import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    assert other.bytes != null;
    final int comp = ByteBlockPool.compareBytes(this.bytes, this.offset, other.bytes, other.offset, this.length, other.length);
    if (comp != 0)return comp;
    if (!this.sortedByTermComp) return this.fstOrd - other.fstOrd;
    elsereturn this.fstOrd - other.fstOrd;
}
}