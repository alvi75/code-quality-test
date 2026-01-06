import java.util.*;

public class Translation8 {
    ublic void init(int address) {
    slice = pool.buffers.get(address >>> BYTE_BLOCK_SHIFT);
    assert slice != null;
    upto = address & BYTE_BLOCK_MASK;
    offset0 = address;
    assert upto < slice.length;
}
}