import java.util.*;

public class Translationtranslation_8 {
    public void init(int address) {
        slice = pool.buffers[address >>> BYTE_BLOCK_SHIFT];
        assert slice != null;
        upto = address & BYTE_BLOCK_MASK;
        assert upto < slice.length;
    }
    (byte)buffer[upto] = 0;
    bytesUsed.addAndGet(BYTE_BLOCK_SIZE);
    }
}