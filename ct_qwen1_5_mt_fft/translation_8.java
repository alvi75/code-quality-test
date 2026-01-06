import java.util.*;

public class Translation8 {
    public void init(int address) {
    slice = pool.buffers[(address >>> buffer.shiftRightByOneByteCount)];
    assert slice != null;
    upto = (address & buffer.mask);
    offset0 = address;
    assert upto < slice.length;
}
}