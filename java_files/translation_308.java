import java.util.*;

public class Translation308 {
    public void serialize(LittleEndianOutput out) {
    out.writeShort(getMain());
    out.writeShort(getSubFrom());
    out.writeShort(getSubTo());
}
}