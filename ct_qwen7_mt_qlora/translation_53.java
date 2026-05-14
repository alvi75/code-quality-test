import java.util.*;

public class Translation53 {
    1 public final void setPosition(final long position) {
    2 currentBlockIndex = (int) (position >>> blockBits);
    3 currentBlock = blocks[currentBlockIndex];
    4 currentBlockUpto = (int) (position & blockMask);
}
}