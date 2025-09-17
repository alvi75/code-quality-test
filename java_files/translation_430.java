import java.util.*;

public class Translationtranslation_430 {
    public void serialize(LittleEndianOutput out) {
        out.writeByte(_encodedTokenLen);
        out.write(_byteEncoding);
    }
}