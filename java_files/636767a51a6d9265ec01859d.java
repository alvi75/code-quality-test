import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len){
        if(len != this.data.length) return false;
        for(int i = 0; i < len; i++){
            if(data[offset + i] != this.data[i]) return false;
        }
        return true;
    }
}