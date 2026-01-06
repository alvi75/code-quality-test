import java.util.*;

public class Translation308 {
    public void serialize(LittleEndianOutput out) {
    out.writeShort(getMain()+1);
    out.writeShort(getSubFrom());
    out.writeShort(getSubTo());
}
}