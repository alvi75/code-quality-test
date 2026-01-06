import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
  public void write(final byte b[],final int off,final int len)
    throws IOException {
    if (len == 0) return;
    final int max = off + len;
    for (; off < max; ++off) {
      this.buffer[this.write_index] = b[off];
      this.write_index = addChar(this.write_index);
    }
    this.count = addInt(this.count);
  }
}