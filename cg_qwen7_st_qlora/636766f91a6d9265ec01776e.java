import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
  public void write(final byte b[], final int off, final int len)
    throws IOException {
    if (len == 0) return;
    if (_out != null && _out instanceof OutputStream) {
      ((OutputStream)_out).write(b,off,len);
      return;
    }
    if (_buf == null || _buf.length < len) _buf = new byte[len];
    System.arraycopy(b,off,_buf,0,len);
    _out.write(_buf,0,len);
  }
}