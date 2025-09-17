import java.util.*;

public class Translationtranslation_853 {
    public void write(LittleEndianOutput out) {
        out.writeByte(sid + getPtgClass());
        out.writeByte(_value ? 1 : 0);
    }
}