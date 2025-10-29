import java.util.*;

public class Translation570 {
    public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
    if (args.length < 1) {
        return ErrorEval.VALUE_INVALID;
    }
    boolean isA1style;
    String text;
    try {
        ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
        text = OperandResolver.coerceValueToString(ve);
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    switch (args.length) {
        case 1:isA1style = true;
        break;
        case 2:isA1style = evaluateBooleanArg(args[1], ec);
        break;
        default:return ErrorEval.VALUE_INVALID;
    }
    return evaluateIndirect(ec, text, isA1style);
}
}