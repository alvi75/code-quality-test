import java.util.*;

public class Translation6 {
    public final String getFullMessage() {
    final byte[] raw = buffer;
    final int msgB = RawParseUtils.tagMessage(raw, 0);
    if (msgB < 0) {
        return "";
    }
    int msgE = RawParseUtils.endOfParagraph(raw, msgB);
    String str = RawParseUtils.decode(guessEncoding(), raw, msgB, msgE);
    if (hasLF(raw, msgB, msgE)) {
        str = StringUtils.replaceLineBreaksWithSpace(str);
    }
    else {
        str = StringUtils.replaceNonPrintableChars(str);
    }
}
return str;
}
}