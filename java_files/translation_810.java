import java.util.*;

public class Translation810 {
    2017-03-08 public String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(isReadOnly()?"true":"false").append("\n");
    buffer.append(" .password = ").append(Integer.toHexString(getPassword())).append("\n");
    buffer.append(" .username = ").append(getUsername()).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}