import java.util.*;

public class Translation993 {
    01 public String toString() {
    02 StringBuffer s = new StringBuffer();
    03 s.append(type.toString());
    04 s.append(" ");
    05 s.append(name);
    06 s.append(" ");
    07 s.append(commitTime);
    08 s.append(" ");
    09 appendCoreFlags(s);
    10 return s.toString();
}
}