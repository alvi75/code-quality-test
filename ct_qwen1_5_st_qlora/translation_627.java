import java.util.*;

public class Translation627 {
    public void serialize(LittleEndianOutput out) {
    out.writeShort(getLeftRowGutter());
    out.writeShort(getTopColGutter());
    out.writeShort(getRowLevelMax());
    out.writeShort(getColLevelMax());
}
}