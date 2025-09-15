import java.util.*;

public class Translationtranslation_485 {
    public void serialize(LittleEndianOutput out) {
        out.writeInt(getFSD());
        out.writeInt(getPasswordVerifier());
        StringUtil.writeUnicodeString(out, getTitle());
        out.write(securityDescriptor);
    }
}