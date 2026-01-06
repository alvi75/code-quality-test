import java.util.*;

public class Translation53 {
    public void setPosition(final long position) {
    currentBlockIndex = (int)((position >>> outerInstance.blockBits));
    currentBlock = outerInstance.blocks[currentBlockIndex];
    currentBlockUpto = (int)((position & outerInstance.blockMask));
}
}