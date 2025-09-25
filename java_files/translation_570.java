import java.util.*;

public class Translation570 {
    public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
    if (args.length < 1) {
        return ErrorEval.VALUE_INVALID;
    }
    boolean isA1style;
    String text;
    if (args.length == 1) {
        ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRow(), ec.getColumn());
        text = OperandResolver.coerceValueToString(ve);
        isA1style = true;
    }
    else if (args.length == 2) {
        ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRow(), ec.getColumn());
        text = OperandResolver.coerceValueToString(OperandResolver.getSingleValue(args[1], ec.getRow(), ec.getColumn()));
        isA1style = false;
    }
    else {
        return ErrorEval.VALUE_INVALID;
    }
    return evaluateIndirect(ec, text, isA1style);
}
}