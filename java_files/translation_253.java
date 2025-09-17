import java.util.*;

public class Translationtranslation_253 {
    public short readUShort() {
        byte[] buf = new byte[LittleEndianConsts.SHORT_SIZE];
        try {
            checkEOF(read(buf), LittleEndianConsts.SHORT_SIZE);
        }
        ;
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    return LittleEndian.getUShort(buf);
    }
}