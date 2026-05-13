import java.util.*;

public class Translation308 {
    ublic void serialize(LittleEndianOutput out) {
    out.writeShort(getMain() + 1);
    out.writeShort(getSubFrom());
    out.writeShort(getSubTo());
}
}