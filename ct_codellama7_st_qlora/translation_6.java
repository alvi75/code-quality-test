import java.util.*;

public class Translation6 {
    public String getFullMessage() {
    final byte[] raw = buffer;
    final int msgB = RawParseUtils.tagMessage(raw, 0);
    if (msgB < 0)return "";
    return RawParseUtils.decode(UTF_8, raw, msgB, raw.length);
}
}