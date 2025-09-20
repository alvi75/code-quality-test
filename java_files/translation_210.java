import java.util.*;

public class Translation210 {
    ublic StringBuilder append(CharSequence csq) {
    if (csq == null) {
        appendNull();
    }
    else {
        append0(csq, 0, csq.length());
    }
    return this;
}
}