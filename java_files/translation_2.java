import java.util.*;

public class Translation2 {
    public void writeByte(byte b) {
    if (upto == blockSize) {
        if (currentBlock != null) {
            blocks.add(currentBlock);
            currentBlock = EMPTY_BLOCK;
        }
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = b;
}
}