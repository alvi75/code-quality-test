import java.util.*;

public class Translationtranslation_485 {
    public void serialize(LittleEndianOutput out) {
        out.writeShort( fSD );
        out.writeByte(passwordVerifier);
        out.writeShort(fSD);
        out.writeInt(unused1);
        out.writeInt((int)unused2);
        out.writeShort(fSD);
        out.writeInt((int)unused3);
    }
}