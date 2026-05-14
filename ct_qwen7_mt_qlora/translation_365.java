import java.util.*;

public class Translation365 {
    1 public String outputToString(Object output) {
    2 if (!(output instanceof List)) {
        3 return outputs.outputToString((T) output);
        4 }
        else {
            5 List outputList = (List) output;
            6 StringBuilder b = new StringBuilder();
            7 b.append('[');
            8 for (int i = 0;
            i < outputList.size();
            i++) {
                9 if (i > 0) {
                    10 b.append(", ");
                    11 }
                    12 b.append(outputs.outputToString((T) outputList.get(i)));
                    13 }
                    14 b.append(']');
                    15 return b.toString();
                    16 }
                }
}