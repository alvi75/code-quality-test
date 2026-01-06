import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    final byte[] bytes = this.bytes;
    final int offset = this.offset;
    final int length = this.length;
    final byte[] otherBytes = other.bytes;
    final int otherOffset = other.offset;
    final int otherLength = other.length;
    if (length == otherLength) {
        if (bytes == otherBytes && offset == otherOffset) {
            return 0;
        }
        else if (offset < otherOffset || offset + length <= otherOffset) {
            return -1;
        }
        else if (otherOffset < offset || otherOffset + otherLength <= offset) {
            return 1;
        }
        else {
            return utf8SortedAsUnicodeSortOrder.compare(bytes, offset, length, otherBytes, otherOffset, otherLength);
        }
    }
    else if (length < otherLength) {
        return -1;
    }
    else {
        return 1;
    }
}
}