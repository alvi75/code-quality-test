import java.util.*;

public class Translation505 {
    public static BATBlock createEmptyBATBlock(POIFSBigBlockSize bigBlockSize, boolean isXBAT) {
    BATBlock block = new BATBlock(bigBlockSize);
    if(isXBAT) {
        block.setXBATChain(bigBlockSize, POIFSConstants.END_OF_CHAIN);
    }
    return block;
}
}