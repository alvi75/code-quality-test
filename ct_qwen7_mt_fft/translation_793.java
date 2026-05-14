import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef b) {
    final int lenA = this.length;
    final int lenB = b.length;
    int posA = offset;
    int posB = b.offset;
    int limA = offset + lenA;
    int limB = b.offset + lenB;
    while (posA < limA && posB < limB) {
        int d = bytes[posA++] - b.bytes[posB++];
        if (d != 0)return d;
    }
    return lenA - lenB;
}
}