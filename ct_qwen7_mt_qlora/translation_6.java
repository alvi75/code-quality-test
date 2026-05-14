import java.util.*;

public class Translation6 {
    1 public String getFullMessage() {
    2 byte[] raw = buffer;
    3 int msgB = RawParseUtils.tagMessage(raw, 0);
    4 if (msgB < 0)5 return "";
    6 Encoding enc = RawParseUtils.parseEncoding(raw);
    7 return RawParseUtils.decode(enc, raw, msgB, raw.length);
}
}