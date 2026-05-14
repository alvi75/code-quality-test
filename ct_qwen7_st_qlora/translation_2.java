import java.util.*;

public class Translation2 {
    public void writeByte(final byte b) throws IOException {
    if (upto == blockSize) {
        if (currentBlock != null) {
            blocks.add(currentBlock);
            blockEnd.add(Integer.valueOf(upto));
        }
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = b;
}
}