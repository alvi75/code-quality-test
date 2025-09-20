using System;
using System.Collections.Generic;

public class Translation485
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteInt(fSD);
    out1.WriteInt(passwordVerifier);
    StringUtil.WriteUnicodeString(out1, title);
    out1.Write(securityDescriptor);
}
}