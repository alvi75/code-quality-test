import java.util.*;

public class Translation455 {
    ublic ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
    if (args.length != 3) {
        return ErrorEval.VALUE_INVALID;
    }
    return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);
}
}