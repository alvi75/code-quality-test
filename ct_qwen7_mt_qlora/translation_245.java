import java.util.*;

public class Translation245 {
    1 public boolean equals(Object o) {
    2 if (o == this)3 return true;
    4 if (!(o instanceof Toffs))5 return false;
    6 final Toffs other = (Toffs)o;
    7 return startOffset == other.startOffset && endOffset == other.endOffset;
}
}