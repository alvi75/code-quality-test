import java.util.*;

public class Translation365 {
    ublic String toString(Object output) {
    if (!(output instanceof List)) {
        return outputs.toString((T) output);
    }
    else {
        List<T> outputList = (List<T>) output;
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;
        i < outputList.size();
        i++) {
            if (i > 0) {
                b.append(", ");
            }
            b.append(outputs.toString(outputList.get(i)));
        }
        b.append(']');
        return b.toString();
    }
}
}