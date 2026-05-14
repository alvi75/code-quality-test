import java.util.*;

public class Translation47 {
    1 public void reset() {
    2 if (first)3 {
        4 ptr = 0;
        5 if (!eof)6 {
            7 parseEntry();
            8 }
            9 }
            else10 {
                11 first = true;
                12 }
                13 }
}