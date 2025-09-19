import java.util.*;

public class Translation8 {
    public void init(int address) {
    slice = pool.buffers[address >>> BYTE_BLOCK_SHIFT];
    assert slice != null;
    upto = address & BYTE_BLOCK_MASK;
    assert upto < slice.length;
}
}