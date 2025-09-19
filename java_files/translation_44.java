import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder b = new StringBuilder();
    final int length = path.length();
    b.append(path.getDirectory());
    for(int i=0;
    i<length;
    i++) {
        if (components[i].length()==0)continue;
        if(b.length()!=0 && !components[i].equals(".")) {
            b.append(separator);
        }
    }
    b.append(components[i]);
}
return b.toString();
}
}