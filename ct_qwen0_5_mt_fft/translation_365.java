import java.util.*;

public class Translation365 {
    public String outputToString(Object output) {
    if (!(output instanceof List)) {
        return outputs.outputToString((T) output);
    }
    else {
        List outputList = (List) output;
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (Object o : outputList) {
            if (o == null) {
                b.append("null");
                continue;
            }
            b.append(outputs.outputToString(o));
            b.append(',');
        }
    }
    b.append(']');
    return b.toString();
}
}
}