import java.util.*;

public class Translation42 {
    public int getNextXBATChainOffset() {
    return getXBATEntriesPerBlock() * LittleEndianConstants.INT_SIZE;
}
}