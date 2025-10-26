import java.util.*;

public class Translation2 {
    public void writeByte(final byte b) {
    if (upto == blockSize) {
        if (currentBlock != null) {
            blocks.add(currentBlock);
            blockEnd.add(upto);
        }
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = b;
}
}