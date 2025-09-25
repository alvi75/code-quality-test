import java.util.*;

public class Translation2 {
    public void writeByte(int val) {
    assert val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE;
    if (upto == blockSize) {
        flush();
    }
    currentBlock[upto++] = (byte)val;
}
}