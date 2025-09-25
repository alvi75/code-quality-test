import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position)throws IOException {
    if(position >= size)return new DirectBufferIterator();
    final int work = Math.min(length, remaining());
    final byte[] buffer = new byte[work];
    final int nread = read(buffer, 0, work);
    assert nread == work;
    final ByteBuffer dst = ByteBuffer.wrap(buffer, 0, nread);
    dst.position(0);
    return dst;
}
}