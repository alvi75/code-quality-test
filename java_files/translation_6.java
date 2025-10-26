import java.util.*;

public class Translation6 {
    public String getFullMessage() {
    byte[] raw = buffer;
    int msgB = RawParseUtils.tagMessage(raw, 0);
    if (msgB < 0) {
        return "";
    }
    Encoding enc = RawParseUtils.parseEncoding(raw);
    return RawParseUtils.decode(enc, raw, msgB, raw.length);
}
}