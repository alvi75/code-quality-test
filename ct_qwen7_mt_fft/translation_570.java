import java.util.*;

public class Translation570 {
    public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
    if (args.length < 1) {
        return ErrorEval.VALUE_INVALID;
    }
    boolean isA1Style;
    String sheetName;
    try {
        ValueEval ve = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
        sheetName = OperandResolver.coerceValueToString(ve);
        switch (args.length) {
            case 1:isA1Style = true;
            break;
            case 2:isA1Style = evaluateBooleanArg(args[1], ec);
            break;
            default:return ErrorEval.VALUE_INVALID;
        }
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    return evaluateIndirect(ec, sheetName, isA1Style);
}
}