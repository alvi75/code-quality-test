import java.util.*;

public class Translation16 {
    1 public synchronized int read(byte[] buffer,int offset,int length) {
    2 if (buffer == null)3 throw new NullPointerException("buffer == null");
    4 Arrays.checkOffsetAndCount(buffer.length,offset,length);
    5 if (length == 0)6 return 0;
    7 int copylen = count - pos < length ? count - pos : length;
    8 for (int i=0;
    i<copylen;
    i++)9 buffer[offset+i] = this.buffer[pos+i];
    10 pos += copylen;
    11 return copylen;
}
}