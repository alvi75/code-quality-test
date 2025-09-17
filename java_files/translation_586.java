import java.util.*;

public class Translationtranslation_586 {
    public void write(LittleEndianOutput out) {
        out.writeByte(sid + getPtgClass());
        out.writeShort( _len );
    }
}