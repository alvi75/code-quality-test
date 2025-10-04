import java.util.*;

public class Translation505 {
    public static BATBlock createEmptyBATBlock(final POIFSBigBlockSize bigBlockSize, boolean isXBAT) {
    BATBlock block = new BATBlock(bigBlockSize);
    block.setBATSize(0);
    block._next = null;
    if (isXBAT) {
        block.setXBAT(true);
        block._xbat_start = 0;
        block._xbat_end = 0;
    }
    else {
        _bat_start = -1;
        _bat_end = -1;
    }
    return block;
}
}