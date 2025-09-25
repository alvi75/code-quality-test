import java.util.*;

public class Translation6 {
    public String getFullMessage() {
    final byte[] raw = buffer;
    final int msgB = RawParseUtils.getTagMessage(raw, 0);
    if (msgB < 0) {
        return "";
    }
    final Encoding enc = RawParseUtils.parseEncoding(raw);
    return RawParseUtils.decode(enc, raw, msgB, raw.length);
}
}