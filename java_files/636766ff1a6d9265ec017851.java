import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
        if(pos<0) return -1;
        if(pos>=buffer.length) return -1;
        for(int i=pos;i<buffer.length;i++){
            if(buffer[i]==value) return i;
        }
        return -1;
    }
}