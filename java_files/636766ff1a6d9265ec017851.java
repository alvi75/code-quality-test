import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
        if(pos >= 0 && pos < _buffer.length){
            return _buffer[pos] == value ? pos : -1;
        }
        return -1;
    }
}