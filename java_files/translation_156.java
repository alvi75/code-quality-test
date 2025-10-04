import java.util.*;

public class Translation156 {
    public PersonIdent getNameAndEmailAddress() {
    final int lt = RawParseUtils.nextLF(buffer, valStart, '<');
    if (valEnd <= lt) {
        final int at = RawParseUtils.nextLF(buffer, valStart, '@');
        if (valStart < at && at < valEnd)return getValue();
        return null;
    }
    final int gt = RawParseUtils.nextLF(buffer, lt, '>');
    if (valEnd < gt)return null;
    return RawParseUtils.decode(enc, buffer, lt, gt - 1);
}
}