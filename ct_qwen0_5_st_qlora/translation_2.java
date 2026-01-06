import java.util.*;

public class Translation2 {
    public void writeByte(int b) {
    if (upto == blockSize) {
        if (currentBlock != null)blocks.add(currentBlock);
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = (byte)b;
}
}