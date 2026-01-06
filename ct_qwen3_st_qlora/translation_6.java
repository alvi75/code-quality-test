import java.util.*;

public class Translation6 {
    ublic String getFullMessage() {
    final byte[] raw = buffer;
    final int msgB = RawParseUtils.tagMessage(raw, 0);
    if (msgB < 0) {
        return "";
    }
    final Charset enc = RawParseUtils.parseEncoding(raw);
    return RawParseUtils.decode(enc, raw, msgB, raw.length);
}
}