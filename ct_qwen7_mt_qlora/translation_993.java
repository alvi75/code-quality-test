import java.util.*;

public class Translation993 {
    1 public String toString() {
    2 final StringBuilder s = new StringBuilder();
    3 s.append(Constants.typeString(type));
    4 s.append(' ');
    5 s.append(name);
    6 s.append(' ');
    7 s.append(commitTime);
    8 s.append(' ');
    9 appendCoreFlags(s);
    10 return s.toString();
}
}