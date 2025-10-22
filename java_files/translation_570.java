import java.util.*;

public class Translation570 {
    ublic ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
    if (args.length < 1) {
        return ErrorEval.VALUE_INVALID;
    }
    boolean isA1style;
    String text;
    try {
        ValueEval ve = OperandResolver.getSingleValue(args[0], srcRowIndex, srcColumnIndex);
        text = OperandResolver.coerceValueToString(ve);
        switch (args.length) {
            case 1:isA1style = true;
            break;
            case 2:isA1style = evaluateBooleanArg(args[1], srcRowIndex, srcColumnIndex);
            break;
            default:return ErrorEval.VALUE_INVALID;
        }
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    return evaluateIndirect(srcRowIndex, srcColumnIndex, text, isA1style);
}
}