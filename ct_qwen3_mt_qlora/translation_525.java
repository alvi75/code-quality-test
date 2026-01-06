import java.util.*;

public class Translation525 {
    1 public boolean incrementToken() {
    if (used) return false;
    clearAttributes();
    termAtt.append(value);
    offsetAtt.setOffset(0, value.length());
    used = true;
    return true;
}
}