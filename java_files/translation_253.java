import java.util.*;

public class Translationtranslation_253 {
    public int readUShort() {
        byte[] buf = new byte[LittleEndianConsts.SHORT_SIZE];
        try {
            checkEOF(read(buf), buf.length);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return LittleEndian.getUShort(buf);
    }
}