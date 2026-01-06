import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len){
        if (data == null) return false;
        if (offset < 0 || len < 0 || offset + len > data.length) return false;
        if (this.size != data.length) return false;
        for (int i = 0; i < this.size; ++i)
            if (!Arrays.equals(data, offset+i, len)) return false;
        return true;
    }
}