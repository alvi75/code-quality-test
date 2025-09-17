import java.util.*;

public class Translationtranslation_6 {
    public final String getFullMessage() {
        byte[] raw = buffer;
        int msgB = RawParseUtils.tagMessage(raw, 0);
        if (msgB < 0) {
            return "";
        }
        int msgE = RawParseUtils.endOfParagraph(raw, msgB);
        String str = RawParseUtils.decode(guessEncoding(), raw, msgB, msgE);
        if (RevCommit.hasLF(raw, msgB, msgE)) {
            str = StringUtils.replaceLineBreaksWithSpace(str);
        }
        return str;
    }
}