import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    @Override
    public int available() throws IOException {
        if (index < 0) {
            return -1;
        }
        long pos = file.length();
        if (pos > Long.MAX_VALUE || pos == 0) {
            throw new EOFException("file size overflows a long: " + pos);
        }
        long toRead = Math.min(pos, Long.MAX_VALUE);
        long readTo = Math.min(toRead, index);
        if (readTo <= 0) {
            return 0;
        }

        // check that we can actually read all bytes up to the index
        long actual = file.seek(readTo);
        if (actual != readTo) {
            throw new IOException("could not seek to position " + readTo);
        }

        // now try to read the rest of the buffer
        byte[] buf = new byte[(int)(toRead - readTo)];
        int ret = file.read(buf);
        if (ret != buf.length) {
            throw new IOException("expected " + buf.length + " bytes but got " + ret);
        }
        file.seek(pos);

        return buf.length;
    }
}