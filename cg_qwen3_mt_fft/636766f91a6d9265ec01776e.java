import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
  public void write(final byte b[],final int off,final int len) throws IOException {
    if (b == null) {
      throw new NullPointerException("b");
    }
    if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length)) {
      throw new IndexOutOfBoundsException();
    }
    if (len > remaining()) {
      flushBuffer();
    }
    final int sublen = Math.min(len,remaining());
    System.arraycopy(b,off,buffer,position,sublen);
    position += sublen;
  }
}