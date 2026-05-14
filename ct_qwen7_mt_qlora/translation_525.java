import java.util.*;

public class Translation525 {
    1 public boolean incrementToken() {
    2 if (used) {
        3 return false;
        4 }
        5 clearAttributes();
        6 termAttribute.append(value);
        7 offsetAttribute.setOffset(0, value.length());
        8 used = true;
        9 return true;
    }
}