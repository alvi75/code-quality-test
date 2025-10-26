import java.util.*;

public class Translation6 {
    ublic String getFullMessage() {
    byte[] raw = buffer;
    int msgB = RawParseUtils.getTagMessage(raw, 0);
    if (msgB < 0) {
        return "";
    }
    Encoding enc = RawParseUtils.parseEncoding(raw);
    return RawParseUtils.decode(enc, raw, msgB, raw.length);
}
}