import java.util.*;

public class Translation53 {
    public final void setPosition(long position) {
    assert position >= 0;
    blockOffset = (int) (position >> blockBits);
    block = blocks[blockOffset];
    upto = (int) (position & blockMask);
}
}