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
        for (Iterator<T> it = outputList.iterator();
        it.hasNext();
        ) {
            T output = it.next();
            b.append(output.toString());
            if (it.hasNext()) {
                b.append(", ");
            }
        }
        b.append(']');
        return b.toString();
    }
}
}