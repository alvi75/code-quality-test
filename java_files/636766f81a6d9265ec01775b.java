import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
    final byte b0 = this.buffer[offset + 0];
    final byte b1 = this.buffer[offset + 1];
    final byte b2 = this.buffer[offset + 2];
    final byte b3 = this.buffer[offset + 3];
    final byte b4 = this.buffer[offset + 4];
    final byte b5 = this.buffer[offset + 5];
    final byte b6 = this.buffer[offset + 6];
    final byte b7 = this.buffer[offset + 7];
    return (((long) (b0 & 0xff)) << 56)
        | ((long) (b1 & 0xff)) << 48
        | ((long) (b2 & 0xff)) << 40
        | ((long) (b3 & 0xff)) << 32
        | ((long) (b4 & 0xff)) << 24
        | ((long) (b5 & 0xff)) << 16
        | ((long) (b6 & 0xff)) << 8
        | ((long) (b7 & 0xff)) << 0;
  }
}