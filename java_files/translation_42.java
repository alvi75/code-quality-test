import java.util.*;

public class Translation42 {
    public int getNextXBATChainOffset() {
    return getXBATEntriesPerBlock() * Ints.BYTES_PER_INT;
}
}