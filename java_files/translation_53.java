import java.util.*;

public class Translation53 {
    ublic void setPosition(long position) {
    currentBlockIndex = (int)(position >>> blockBits);
    currentBlock = blocks[currentBlockIndex];
    currentBlockUpto = (int)(position & blockMask);
}
}