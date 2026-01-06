import java.util.*;

public class Translation485 {
    public void serialize(LittleEndianOutput out) {
    out.writeInt(field_1_fsd);
    out.writeInt(passwordVerifier);
    StringUtil.writeUnicodeString(out, title);
    out.write(securityDescriptor);
}
}