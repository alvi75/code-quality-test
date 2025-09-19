import java.util.*;

public class Translation2 {
    public void writeByte(int v) {
    if (upto == blockSize) {
        if (currentBlock != null) {
            addBlock(currentBlock);
        }
        currentBlock = new byte[blockSize];
        currentBlock[upto++] = (byte)v;
    }
}