import java.util.*;

public class Translationtranslation_485 {
    public void serialize(LittleEndianOutput out) {
        out.writeInt(fSD);
        out.writeInt(passwordVerifier);
        StringUtil.writeUnicodeString(out, title);
        out.write(securityDescriptor);
    }
}