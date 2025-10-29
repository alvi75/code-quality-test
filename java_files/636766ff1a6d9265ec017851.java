import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    public int findByte(byte value,int pos){
        if(pos >= 0 && pos < length) {
            int i = 0;
            while(i < length - pos) {
                if(buffer[pos + i] == value)
                    return pos + i;
                ++i;
            }
        }
        return -1;
    }
}