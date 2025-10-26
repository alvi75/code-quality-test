import java.util.*;

public class Translation810 {
    ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[FILESHARING]\n");
    buffer.Append(" .Readonly = ").Append(ReadOnly == 1 ? "true" : "false").Append("\n");
    buffer.Append(" .password = ").Append(StringUtil.toHexString(Password)).Append("\n");
    buffer.Append(" .username = ").Append(Username).Append("\n");
    buffer.Append("[/FILESHARING]\n");
    return buffer.ToString();
}
}