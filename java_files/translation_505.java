import java.util.*;

public class Translation505 {
    public static BATBlock createEmptyBATBlock(BigBlockSize bigBlockSize, boolean isXBAT) {
    BATBlock block = new BATBlock(bigBlockSize);
    if(isXBAT) {
        block.setXBATChain(bigBlockSize, END_OF_CHAIN);
    }
    return block;
}
}