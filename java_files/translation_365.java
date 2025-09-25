import java.util.*;

public class Translation365 {
    1 public String outputToString(Object output) {
    if (!(output instanceof List)) {
        return outputs.outputToString((T) output);
    }
    else {
        List outputList = (List) output;
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;
        i < outputList.size();
        i++) {
            if (i > 0) {
                b.append(", ");
            }
            b.append(outputs.outputToString(outputList.get(i)));
        }
        b.append(']');
        return b.toString();
    }
}
}