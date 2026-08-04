import java.util.*;

public class Translation627 {
    public void serialize(LittleEndianOutput out) {
    out.writeShort(leftRowGutter);
    out.writeShort(topColGutter);
    out.writeShort(rowLevelMax);
    out.writeShort(colLevelMax);
}
}