import java.util.*;

public class Translation308 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getSid());
    out.writeShort( _data.length );
    out.write(_data);
}
}