import java.util.*;

public class Translation137 {
    public LatvianStemFilterFactory(Map<String,String> args, Analyzer filterType = null;
for (Map.Entry<String,String> e : args.entrySet()) {
    String key = e.getKey();
    String value = e.getValue();
    switch (key) {
        case "name":if (value.length() != 1)throw new IllegalArgumentException("Name must be a one-letter code—no spaces!");
        );
        name = value;
        break;
        default:throw new IllegalArgumentException("Unknown parameter '" + key + "'");
    }
}
}
if (name.length() == 0)throw new IllegalArgumentException("Parameter 'name' not specified");
this.filter = filter;
}
}