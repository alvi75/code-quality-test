import java.util.*;

public class Translation53 {
    1 public void setPosition(long position) {
    currentBlockIndex = (int) ((position >>> outerInstance.blockBits) & Integer.MAX_VALUE);
    currentBlock = blocks.get(currentBlockIndex);
    currentBlockUpto = (int) (position & outerInstance.blockMask);
}
}