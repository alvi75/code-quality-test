import java.util.*;

public class Translation365 {
    public String outputToString(Object output) {
    if (!(output instanceof List)) {
        return outputs.outputToString((T) output);
    }
    else {
        List<?> outputList = (List<?>) output;
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (Object o : outputList) {
            if (b.length() > 1) {
                b.append(", ");
            }
            b.append(outputs.outputToString((T) o));
        }
        b.append(']');
        return b.toString();
    }
}
}