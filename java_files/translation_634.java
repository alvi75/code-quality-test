import java.util.*;

public class Translation634 {
    public static TagOpt fromOption(String o) {
    if (o == null || o.length() == 0)return AUTO_FOLLOW;
    for (final TagOpt to : values()) {
        if (to.option.equals(o))return to;
    }
    throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidTagOption, o));
}
Create a new class called "PersonIdent" with the following attributes: - Name - Email Address - When the object was created (in milliseconds since epoch) - Object ID (if available) public PersonIdent getNameAndEmailAddress() {
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