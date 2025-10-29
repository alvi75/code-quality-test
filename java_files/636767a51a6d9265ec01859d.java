import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    /**Return true if the contents of the internal array bytes and the provided array data match.**/
    public boolean equals(final byte[] data,int offset,final int len){
        if (len != this.length) return false;
        for (int i = 0; i < len; i++){
            if (data[offset + i] != this.bytes[i]) return false;
        }
        return true;
    }
}