import java.util.*;

public class Translation8 {
    1 public final void init(int address) {
    2 slice = pool.buffers[address >>> BYTE_BLOCK_SHIFT];
    3 assert slice != null;
    4 upto = address & BYTE_BLOCK_MASK;
    5 offset0 = address;
    6 assert upto < slice.length;
}
}