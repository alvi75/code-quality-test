import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    /**Searche for a byte of the specified value in the buffer, starting at the specified position.**/
    protected int findByte(byte value,int pos){
        if(pos<0 || pos>=buffer.length) return -1;
        for(int i=pos;i<buffer.length;i++){
            if(buffer[i]==value) return i;
        }
        return -1;
    }
}