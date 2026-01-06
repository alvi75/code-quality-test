import java.util.*;

public class Translation53 {
    public final void setPosition(long position) {
    currentBlockIndex = (int) (position >> blockBits);
    currentBlock = blocks.get(currentBlockIndex);
    currentBlockUpto = (int) (position & blockMask);
}
}