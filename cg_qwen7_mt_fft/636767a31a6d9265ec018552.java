import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString()
        throws IOException
    {
        int len = _in.readInt();
        byte[] bytes = new byte[len];
        if (_in.read(bytes) != bytes.length)
            throw new EOFException("short read of DER-strings");
        return new String(bytes);
    }
}