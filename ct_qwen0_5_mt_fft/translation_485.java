import java.util.*;

public class Translation485 {
    public void serialize(LittleEndianOutput out) {
    out.writeInt(field_1_fsd);
    out.writeInt(field_2_password_verifier);
    StringUtil.writeUnicodeString(out, getTitle());
    out.write(securityDescriptor);
}
}