import java.util.*;

public class Translation485 {
    2013-07-16T19:58:42Z @override public void serialize(LittleEndianOutput out) {
    out.writeInt(fSD);
    out.writeInt(passwordVerifier);
    UnicodeString.writeUnicodeString(out, title);
    out.write(securityDescriptor);
}
}