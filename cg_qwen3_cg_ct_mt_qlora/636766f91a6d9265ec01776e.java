import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (len == 0) return;
        if (len < 0) throw new IndexOutOfBoundsException();
        if (off < 0 || off + len > b.length) throw new ArrayIndexOutOfBoundsException();

        //if (len > 1024*1024) {
        //    System.out.println("write "+len+" bytes");
        //}

        while(len > 0) {
            final int toWrite = Math.min(len, _bufferSize - _pos);
            System.arraycopy(b, off, _buffer, _pos, toWrite);
            _pos += toWrite;
            off += toWrite;
            len -= toWrite;

            if (_pos == _bufferSize) {
                flush();
            }
        }
    }
}