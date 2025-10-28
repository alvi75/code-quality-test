import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len)
    {
        if (data == null) return false;
        if (offset < 0 || len < 0 || offset + len > data.length) return false;

        final int thisLen = getLength();
        if (thisLen != len) return false;

        for (int i = offset; i < offset + len; ++i) {
            if (data[i] != m_data[i]) return false;
        }

        return true;
    }
}