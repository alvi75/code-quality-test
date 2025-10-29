import java.util.*;

public class Translation210 {
    123 public StringBuilder append(CharSequence csq) {
    if (csq == null) {
        appendNull();
    }
    else {
        append0(csq, 0, csq.length());
    }
    return this;
}
}