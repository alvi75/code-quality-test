import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        }
        if (b.length == 0) {
            return;
        }

        int pos = position;
        int len = b.length;

        // If we have enough room, just copy it straight into the buffer.
        if (pos + len <= limit) {
            System.arraycopy(b, 0, data, pos, len);
            position += len;
            return;
        }

        // Otherwise, we need to allocate a new buffer and copy the bytes there.
        byte[] newData = new byte[limit];
        System.arraycopy(data, 0, newData, 0, pos);
        System.arraycopy(b, 0, newData, pos, len);

        // Now that we've got our own buffer, let's update the limit.
        limit = newData.length;
        position = limit;
        data = newData;
    }
}