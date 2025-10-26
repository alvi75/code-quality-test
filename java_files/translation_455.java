import java.util.*;

public class Translation455 {
    public ValueEval evaluate(final ValueEval[] args, final int srcRowIndex, final int srcColumnIndex) {
    if (args.length != 3) {
        return ErrorEval.VALUE_INVALID;
    }
    return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);
}
}