import java.util.*;

public class Translation210 {
    1 public StringBuilder append(CharSequence csq) {
    2 if (csq == null)3 {
        4 appendNull();
        5 }
        else6 {
            7 append0(csq, 0, csq.length());
            8 }
            9 return this;
        }
}