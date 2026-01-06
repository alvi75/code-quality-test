import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len){
        if (len > remaining()) {
            return false;
        }
        final int thisPos = position;
        final int thatPos = offset + length - thisPos;
        for (int i = 0; i < len; ++i) {
            if (data[i + offset] != get(i + thisPos)) {
                return false;
            }
        }
        return true;
    }
}