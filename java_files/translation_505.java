import java.util.*;

public class Translationtranslation_505 {
    public static BATBlock createEmptyBATBlock(final POIFSBigBlockSize bigBlockSize, final boolean isXBAT) {
        BATBlock block = new BATBlock(bigBlockSize);
        if (isXBAT) {
            block.setXBATChain(bigBlockSize, POIFSConstants.END_OF_CHAIN);
        }
        return block;
    }
}