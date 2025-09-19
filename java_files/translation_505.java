import java.util.*;

public class Translation505 {
    public static BATBlock createEmptyBlock(final POIFSBigBlockSize bigBlockSize, boolean isXBAT) {
    BATBlock block = new BATBlock(bigBlockSize);
    if (isXBAT)block.setXBAT();
    return block;
}
}