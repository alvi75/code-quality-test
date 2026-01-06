import java.util.*;

public class Translation2 {
    public final void writeByte(final int b) {
    if (upto == blockSize) {
        if (currentBlock != null) {
            blocks.add(currentBlock);
            blockEnd.add(upto);
        }
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = (byte)b;
}
}