import java.util.*;

public class Translation53 {
    public void setPosition(final long position) {
    final int newBlockNum= (int) ((position >>> blockShift) & BLOCK_MASK);
    if (newBlockNum != currentBlockIndex) {
        getNewBlock(newBlockNum);
    }
    currentBlockUpto = (int) (position & BLOCK_MASK);
}
}