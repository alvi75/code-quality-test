import java.util.*;

public class Translation42 {
    public int getNextXBATChainOffset() {
    return getXBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE;
}
}