import java.util.*;

public class Translationtranslation_8 {
    public void init(int address) {
        slice = pool.buffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT];
        assert slice != null;
        upto = address & ByteBlockPool.BYTE_BLOCK_MASK;
        offset0 = address;
        assert upto < slice.length;
    }
}