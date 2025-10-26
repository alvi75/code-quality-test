import java.util.*;

public class Translation53 {
    public void setPosition(long position) {
    currentBlockIndex = (int) (position >>> blockBits);
    currentBlock = blocks[currentBlockIndex];
    currentBlockUpto = (int) (position & blockMask);
}
}