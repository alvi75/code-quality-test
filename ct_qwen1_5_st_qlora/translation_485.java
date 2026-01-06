import java.util.*;

public class Translation485 {
    public void serialize(LittleEndianOutput out) {
    out.writeInt(getFSD());
    out.writeInt(passwordVerifier);
    StringUtil.writeUnicodeString(out, getTitle());
    serializeSecurityDescriptor(out);
}
}