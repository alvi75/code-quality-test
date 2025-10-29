import java.util.*;

public class Translation485 {
    0;
out1.writeShort(0);
}
if (passwordVerifier != 0){
    out1.writeShort(0x0002);
    out1.writeInt(passwordVerifier);
}
if (title != null){
    out1.writeShort(0x0003);
    StringUtil.writeUnicodeString(out1, title);
}
if (securityDescriptor != null){
    out1.writeShort(0x0004);
    out1.write(securityDescriptor);
}
}
}