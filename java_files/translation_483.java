import java.util.*;

public class Translation483 {
    public IndonesianStemFilterFactory(Map<String,String> args) {
    super(input);
    stemDerivational = getBoolean(args, "stemDerivational", true);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}