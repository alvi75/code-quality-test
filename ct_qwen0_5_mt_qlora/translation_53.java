import java.util.*;

public class Translation53 {
    public void setPosition(long position) {
    currentBlockIndex = (int)((position >>> outerInstance.blockBits) & outerInstance.blockMask);
    currentBlock = outerInstance.blocks[currentBlockIndex];
    currentBlockUpto = (int)((position & outerInstance.blockMask));
}
}