import java.util.*;

public class Translation403 {
    ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[MMS]\n");
    buffer.Append(" .addMenu = ").Append(StringUtil.toHexString(AddMenuCount)).Append("\n");
    buffer.Append(" .delMenu = ").Append(StringUtil.toHexString(DelMenuCount)).Append("\n");
    buffer.Append("[/MMS]\n");
    return buffer.ToString();
}
}