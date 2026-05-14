import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
        if (pos < 0) {
            return -1;
        }
        while (pos < length()) {
            if (get(pos) == value) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
}