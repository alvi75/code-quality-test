import java.util.*;

public class Translation455 {
    1 public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
    2 if (args.length != 3) {
        3 return ErrorEval.VALUE_INVALID;
        4 }
        5 return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);
        6 }
}