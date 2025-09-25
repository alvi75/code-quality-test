import java.util.*;

public class Translation485 {
    public void serialize(LittleEndianOutput out) {
    out.writeInt(fSD);
    out.writeInt(passwordVerifier);
    StringUtil.putUnicodeString(title, out);
    out.write(securityDescriptor);
}
}