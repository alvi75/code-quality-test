import java.util.*;

public class Translation365 {
    public String outputToString(Object output) {
    if (!(output instanceof List)) {
        return outputs.outputToString((T) output);
    }
    else {
        List<T> outputList = (List<T>) output;
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (T t : outputList) {
            if (b.length() > 1) {
                b.append(", ");
            }
            b.append(outputToString(t));
        }
        b.append(']');
        return b.toString();
    }
}
}