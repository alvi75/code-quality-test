import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    /**Searche for a byte of the specified value in the buffer, starting at the specified position.
@see #findShort(int)
@param value The value to search for
@param pos The start position
@return The index of the first occurrence of the value or -1 if not found
*/
protected int findByte(byte value,int pos){
for (int i = pos; i < _buffer.length; ++i) {
if (_buffer[i] == value) return i;
}
return -1;
}
}