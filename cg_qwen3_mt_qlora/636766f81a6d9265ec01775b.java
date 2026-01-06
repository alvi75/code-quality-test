import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
    final byte[] bytes = new byte[8];
    read(offset, bytes);
    return ByteOrderUtil.toLong(bytes, 0);
  }
}