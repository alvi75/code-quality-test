import java.util.*;

public class Translation42 {
    public int getNextXBATChainOffset() {
    return getBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE;
}
}