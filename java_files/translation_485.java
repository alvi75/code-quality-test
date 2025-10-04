import java.util.*;

public class Translation485 {
    public void serialize(LittleEndianOutput out) {
    out.writeInt(getfSD());
    out.writeInt(getPasswordVerifier());
    StringUtil.writeUnicodeString(out, getTitle());
    out.write(_securityDescriptor);
}
}