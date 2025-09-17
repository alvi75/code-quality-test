import java.util.*;

public class Translationtranslation_308 {
    public void serialize(LittleEndianOutput out) {
        out.writeByte(getSid());
        out.writeShort( _data.length );
        out.write(_data);
    }
}