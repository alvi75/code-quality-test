import java.util.*;

public class Translation6 {
    public String getFullMessage() {
    final byte[] raw = buffer;
    final int msgB = RawParseUtils.tagMessage(raw, 0);
    if (msgB < 0)return "";
    final Encoding enc = RawParseUtils.parseEncoding(raw);
    try {
        return RawParseUtils.decode(enc, raw, msgB, raw.length);
    }
    catch (UnsupportedEncodingException e) {
        throw new RuntimeException(e);
    }
}
}