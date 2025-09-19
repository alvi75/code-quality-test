import java.util.*;

public class Translation455 {
    public final ValueEval evaluate(ValueEval[] args = {
    arg0, arg1, arg2}
    ;
    int maxN = Math.max(args.length, DEFAULT_ARG_LENGTH);
    ValueEval[] vargs = new ValueEval[maxN];
    System.arraycopy(args, 0, vargs, 0, args.length);
    vargs[args.length] = DEFAULT_ARG;
    return evaluate(vargs, srcRowIndex, srcColumnIndex);
}
}