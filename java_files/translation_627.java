import java.util.*;

public class Translationtranslation_627 {
    public void serialize(LittleEndianOutput out) {
        out.writeByte(getLeftRowGutter());
        out.writeByte(getTopColGutter());
        out.writeInt(getRowLevelMax());
        out.writeInt(getColLevelMax());
    }
}